package org.apache.commons.lang3.time;


public class FastDateParser implements java.io.Serializable , org.apache.commons.lang3.time.DateParser {
    private static final long serialVersionUID = 3L;

    static final java.util.Locale JAPANESE_IMPERIAL = new java.util.Locale("ja" , "JP" , "JP");

    private final java.lang.String pattern;

    private final java.util.TimeZone timeZone;

    private final java.util.Locale locale;

    private final int century;

    private final int startYear;

    private transient java.util.List<org.apache.commons.lang3.time.FastDateParser.StrategyAndWidth> patterns;

    protected FastDateParser(final java.lang.String pattern ,final java.util.TimeZone timeZone ,final java.util.Locale locale) {
        this(pattern, timeZone, locale, null);
    }

    protected FastDateParser(final java.lang.String pattern ,final java.util.TimeZone timeZone ,final java.util.Locale locale ,final java.util.Date centuryStart) {
        this.pattern = pattern;
        this.timeZone = timeZone;
        this.locale = locale;
        final java.util.Calendar definingCalendar = java.util.Calendar.getInstance(timeZone, locale);
        int centuryStartYear;
        if (centuryStart != null) {
            definingCalendar.setTime(centuryStart);
            centuryStartYear = definingCalendar.get(java.util.Calendar.YEAR);
        } else if (locale.equals(JAPANESE_IMPERIAL)) {
            centuryStartYear = 0;
        } else {
            definingCalendar.setTime(new java.util.Date());
            centuryStartYear = (definingCalendar.get(java.util.Calendar.YEAR)) - 80;
        }
        century = (centuryStartYear / 100) * 100;
        startYear = centuryStartYear - (century);
        init(definingCalendar);
    }

    private void init(final java.util.Calendar definingCalendar) {
        patterns = new java.util.ArrayList<org.apache.commons.lang3.time.FastDateParser.StrategyAndWidth>();
        StrategyParser fm = new StrategyParser(pattern , definingCalendar);
        for ( ;  ; ) {
            org.apache.commons.lang3.time.FastDateParser.StrategyAndWidth field = fm.getNextStrategy();
            if (field == null) {
                break;
            } 
            patterns.add(field);
        }
    }

    private static class StrategyAndWidth {
        final org.apache.commons.lang3.time.FastDateParser.Strategy strategy;

        final int width;

        StrategyAndWidth(org.apache.commons.lang3.time.FastDateParser.Strategy strategy ,int width) {
            this.strategy = strategy;
            this.width = width;
        }

        int getMaxWidth(java.util.ListIterator<org.apache.commons.lang3.time.FastDateParser.StrategyAndWidth> lt) {
            if ((!(strategy.isNumber())) || (!(lt.hasNext()))) {
                return 0;
            } 
            org.apache.commons.lang3.time.FastDateParser.Strategy nextStrategy = lt.next().strategy;
            lt.previous();
            return nextStrategy.isNumber() ? width : 0;
        }
    }

    private class StrategyParser {
        private final java.lang.String pattern;

        private final java.util.Calendar definingCalendar;

        private int currentIdx;

        StrategyParser(java.lang.String pattern ,java.util.Calendar definingCalendar) {
            this.pattern = pattern;
            this.definingCalendar = definingCalendar;
        }

        org.apache.commons.lang3.time.FastDateParser.StrategyAndWidth getNextStrategy() {
            if ((currentIdx) >= (pattern.length())) {
                return null;
            } 
            char c = pattern.charAt(currentIdx);
            if (org.apache.commons.lang3.time.FastDateParser.isFormatLetter(c)) {
                return letterPattern(c);
            } else {
                return literal();
            }
        }

        private org.apache.commons.lang3.time.FastDateParser.StrategyAndWidth letterPattern(char c) {
            int begin = currentIdx;
            while ((++(currentIdx)) < (pattern.length())) {
                if ((pattern.charAt(currentIdx)) != c) {
                    break;
                } 
            }
            int width = ((_arithmeticOperatorHotSpot314.is("PLUS")) ? ((currentIdx) + begin) : (_arithmeticOperatorHotSpot314.is("MINUS")) ? ((currentIdx) - begin) : (_arithmeticOperatorHotSpot314.is("MUL")) ? ((currentIdx) * begin) :  ((currentIdx) / begin));
            return new org.apache.commons.lang3.time.FastDateParser.StrategyAndWidth(getStrategy(c, width, definingCalendar) , width);
        }

        private org.apache.commons.lang3.time.FastDateParser.StrategyAndWidth literal() {
            boolean activeQuote = false;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            while ((currentIdx) < (pattern.length())) {
                char c = pattern.charAt(currentIdx);
                if ((!activeQuote) && (org.apache.commons.lang3.time.FastDateParser.isFormatLetter(c))) {
                    break;
                } else if (c == '\'') {
                    if (((++(currentIdx)) == (pattern.length())) || ((pattern.charAt(currentIdx)) != '\'')) {
                        activeQuote = !activeQuote;
                        continue;
                    } 
                } 
                ++(currentIdx);
                sb.append(c);
            }
            if (activeQuote) {
                throw new java.lang.IllegalArgumentException("Unterminated quote");
            } 
            java.lang.String formatField = sb.toString();
            return new org.apache.commons.lang3.time.FastDateParser.StrategyAndWidth(new org.apache.commons.lang3.time.FastDateParser.CopyQuotedStrategy(formatField) , formatField.length());
        }
    }

    private static boolean isFormatLetter(char c) {
        return ((c >= 'A') && (c <= 'Z')) || ((c >= 'a') && (c <= 'z'));
    }

    @java.lang.Override
    public java.lang.String getPattern() {
        return pattern;
    }

    @java.lang.Override
    public java.util.TimeZone getTimeZone() {
        return timeZone;
    }

    @java.lang.Override
    public java.util.Locale getLocale() {
        return locale;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (!(obj instanceof org.apache.commons.lang3.time.FastDateParser)) {
            return false;
        } 
        final org.apache.commons.lang3.time.FastDateParser other = ((org.apache.commons.lang3.time.FastDateParser)(obj));
        return ((pattern.equals(other.pattern)) && (timeZone.equals(other.timeZone))) && (locale.equals(other.locale));
    }

    @java.lang.Override
    public int hashCode() {
        return (pattern.hashCode()) + (13 * ((timeZone.hashCode()) + ((_arithmeticOperatorHotSpot317.is("PLUS")) ? ((13 + (locale.hashCode()))) : (_arithmeticOperatorHotSpot317.is("MINUS")) ? ((13 - (locale.hashCode()))) : (_arithmeticOperatorHotSpot317.is("MUL")) ? ((13 * (locale.hashCode()))) :  ((13 / (locale.hashCode()))))));
    }

    @java.lang.Override
    public java.lang.String toString() {
        return ((((("FastDateParser[" + (pattern)) + ",") + (locale)) + ",") + (timeZone.getID())) + "]";
    }

    private void readObject(final java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        in.defaultReadObject();
        final java.util.Calendar definingCalendar = java.util.Calendar.getInstance(timeZone, locale);
        init(definingCalendar);
    }

    @java.lang.Override
    public java.lang.Object parseObject(final java.lang.String source) throws java.text.ParseException {
        return parse(source);
    }

    @java.lang.Override
    public java.util.Date parse(final java.lang.String source) throws java.text.ParseException {
        java.text.ParsePosition pp = new java.text.ParsePosition(0);
        final java.util.Date date = parse(source, pp);
        if (date == null) {
            if (locale.equals(JAPANESE_IMPERIAL)) {
                throw new java.text.ParseException((((("(The " + (locale)) + " locale does not support dates before 1868 AD)\n") + "Unparseable date: \"") + source) , pp.getErrorIndex());
            } 
            throw new java.text.ParseException(("Unparseable date: " + source) , pp.getErrorIndex());
        } 
        return date;
    }

    @java.lang.Override
    public java.lang.Object parseObject(final java.lang.String source, final java.text.ParsePosition pos) {
        return parse(source, pos);
    }

    @java.lang.Override
    public java.util.Date parse(final java.lang.String source, final java.text.ParsePosition pos) {
        final java.util.Calendar cal = java.util.Calendar.getInstance(timeZone, locale);
        cal.clear();
        return parse(source, pos, cal) ? cal.getTime() : null;
    }

    public boolean parse(final java.lang.String source, final java.text.ParsePosition pos, final java.util.Calendar calendar) {
        java.util.ListIterator<org.apache.commons.lang3.time.FastDateParser.StrategyAndWidth> lt = patterns.listIterator();
        while (lt.hasNext()) {
            org.apache.commons.lang3.time.FastDateParser.StrategyAndWidth pattern = lt.next();
            int maxWidth = pattern.getMaxWidth(lt);
            if (!(pattern.strategy.parse(this, calendar, source, pos, maxWidth))) {
                return false;
            } 
        }
        return true;
    }

    private static java.lang.StringBuilder simpleQuote(final java.lang.StringBuilder sb, final java.lang.String value) {
        for (int i = 0 ; i < (value.length()) ; ++i) {
            char c = value.charAt(i);
            switch (c) {
                case '\\' :
                case '^' :
                case '$' :
                case '.' :
                case '|' :
                case '?' :
                case '*' :
                case '+' :
                case '(' :
                case ')' :
                case '[' :
                case '{' :
                    sb.append('\\');
                default :
                    sb.append(c);
            }
        }
        return sb;
    }

    private static final java.util.Comparator<java.util.Map.Entry<java.lang.String, java.lang.Integer>> ALTERNATIVES_ORDERING = new java.util.Comparator<java.util.Map.Entry<java.lang.String, java.lang.Integer>>() {
        @java.lang.Override
        public int compare(java.util.Map.Entry<java.lang.String, java.lang.Integer> left, java.util.Map.Entry<java.lang.String, java.lang.Integer> right) {
            int v = (left.getValue()) - (right.getValue());
            if (v != 0) {
                return v;
            } 
            return right.getKey().compareToIgnoreCase(left.getKey());
        }
    };

    private static void appendDisplayNames(java.util.Calendar cal, java.util.Locale locale, int field, java.lang.StringBuilder regex, java.util.Map<java.lang.String, java.lang.Integer> values) {
        java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Integer>> displayNames = cal.getDisplayNames(field, java.util.Calendar.ALL_STYLES, locale).entrySet();
        java.util.TreeSet<java.util.Map.Entry<java.lang.String, java.lang.Integer>> sort = new java.util.TreeSet<java.util.Map.Entry<java.lang.String, java.lang.Integer>>(ALTERNATIVES_ORDERING);
        sort.addAll(displayNames);
        for (java.util.Map.Entry<java.lang.String, java.lang.Integer> entry : sort) {
            java.lang.String symbol = entry.getKey();
            if ((symbol.length()) > 0) {
                if ((values.put(symbol.toLowerCase(locale), entry.getValue())) == null) {
                    org.apache.commons.lang3.time.FastDateParser.simpleQuote(regex, symbol).append('|');
                } 
            } 
        }
    }

    private int adjustYear(final int twoDigitYear) {
        final int trial = ((_arithmeticOperatorHotSpot315.is("PLUS")) ? ((century) + twoDigitYear) : (_arithmeticOperatorHotSpot315.is("MINUS")) ? ((century) - twoDigitYear) : (_arithmeticOperatorHotSpot315.is("MUL")) ? ((century) * twoDigitYear) :  ((century) / twoDigitYear));
        return twoDigitYear >= (startYear) ? trial : ((_arithmeticOperatorHotSpot316.is("PLUS")) ? (trial + 100) : (_arithmeticOperatorHotSpot316.is("MINUS")) ? (trial - 100) : (_arithmeticOperatorHotSpot316.is("MUL")) ? (trial * 100) :  (trial / 100));
    }

    private abstract static class Strategy {
        boolean isNumber() {
            return false;
        }

        abstract boolean parse(org.apache.commons.lang3.time.FastDateParser parser, java.util.Calendar calendar, java.lang.String source, java.text.ParsePosition pos, int maxWidth);
    }

    private abstract static class PatternStrategy extends org.apache.commons.lang3.time.FastDateParser.Strategy {
        private java.util.regex.Pattern pattern;

        void createPattern(java.lang.StringBuilder regex) {
            createPattern(regex.toString());
        }

        void createPattern(java.lang.String regex) {
            this.pattern = java.util.regex.Pattern.compile(regex);
        }

        @java.lang.Override
        boolean isNumber() {
            return false;
        }

        @java.lang.Override
        boolean parse(org.apache.commons.lang3.time.FastDateParser parser, java.util.Calendar calendar, java.lang.String source, java.text.ParsePosition pos, int maxWidth) {
            java.util.regex.Matcher matcher = pattern.matcher(source.substring(pos.getIndex()));
            if (!(matcher.lookingAt())) {
                pos.setErrorIndex(pos.getIndex());
                return false;
            } 
            pos.setIndex(((_arithmeticOperatorHotSpot313.is("PLUS")) ? (((pos.getIndex()) + (matcher.end(1)))) : (_arithmeticOperatorHotSpot313.is("MINUS")) ? (((pos.getIndex()) - (matcher.end(1)))) : (_arithmeticOperatorHotSpot313.is("MUL")) ? (((pos.getIndex()) * (matcher.end(1)))) :  (((pos.getIndex()) / (matcher.end(1))))));
            setCalendar(parser, calendar, matcher.group(1));
            return true;
        }

        abstract void setCalendar(org.apache.commons.lang3.time.FastDateParser parser, java.util.Calendar cal, java.lang.String value);
    }

    private org.apache.commons.lang3.time.FastDateParser.Strategy getStrategy(char f, int width, final java.util.Calendar definingCalendar) {
        switch (f) {
            default :
                throw new java.lang.IllegalArgumentException((("Format '" + f) + "' not supported"));
            case 'D' :
                return DAY_OF_YEAR_STRATEGY;
            case 'E' :
                return getLocaleSpecificStrategy(java.util.Calendar.DAY_OF_WEEK, definingCalendar);
            case 'F' :
                return DAY_OF_WEEK_IN_MONTH_STRATEGY;
            case 'G' :
                return getLocaleSpecificStrategy(java.util.Calendar.ERA, definingCalendar);
            case 'H' :
                return HOUR_OF_DAY_STRATEGY;
            case 'K' :
                return HOUR_STRATEGY;
            case 'M' :
                return width >= 3 ? getLocaleSpecificStrategy(java.util.Calendar.MONTH, definingCalendar) : NUMBER_MONTH_STRATEGY;
            case 'S' :
                return MILLISECOND_STRATEGY;
            case 'W' :
                return WEEK_OF_MONTH_STRATEGY;
            case 'a' :
                return getLocaleSpecificStrategy(java.util.Calendar.AM_PM, definingCalendar);
            case 'd' :
                return DAY_OF_MONTH_STRATEGY;
            case 'h' :
                return HOUR12_STRATEGY;
            case 'k' :
                return HOUR24_OF_DAY_STRATEGY;
            case 'm' :
                return MINUTE_STRATEGY;
            case 's' :
                return SECOND_STRATEGY;
            case 'w' :
                return WEEK_OF_YEAR_STRATEGY;
            case 'y' :
                return width > 2 ? LITERAL_YEAR_STRATEGY : ABBREVIATED_YEAR_STRATEGY;
            case 'X' :
                return org.apache.commons.lang3.time.FastDateParser.ISO8601TimeZoneStrategy.getStrategy(width);
            case 'Z' :
                if (width == 2) {
                    return org.apache.commons.lang3.time.FastDateParser.ISO8601TimeZoneStrategy.ISO_8601_3_STRATEGY;
                } 
            case 'z' :
                return getLocaleSpecificStrategy(java.util.Calendar.ZONE_OFFSET, definingCalendar);
        }
    }

    @java.lang.SuppressWarnings(value = "unchecked")
    private static final java.util.concurrent.ConcurrentMap<java.util.Locale, org.apache.commons.lang3.time.FastDateParser.Strategy>[] caches = new java.util.concurrent.ConcurrentMap[java.util.Calendar.FIELD_COUNT];

    private static java.util.concurrent.ConcurrentMap<java.util.Locale, org.apache.commons.lang3.time.FastDateParser.Strategy> getCache(final int field) {
        synchronized(caches) {
            if ((caches[field]) == null) {
                caches[field] = new java.util.concurrent.ConcurrentHashMap<java.util.Locale, org.apache.commons.lang3.time.FastDateParser.Strategy>(3);
            } 
            return caches[field];
        }
    }

    private org.apache.commons.lang3.time.FastDateParser.Strategy getLocaleSpecificStrategy(final int field, final java.util.Calendar definingCalendar) {
        final java.util.concurrent.ConcurrentMap<java.util.Locale, org.apache.commons.lang3.time.FastDateParser.Strategy> cache = org.apache.commons.lang3.time.FastDateParser.getCache(field);
        org.apache.commons.lang3.time.FastDateParser.Strategy strategy = cache.get(locale);
        if (strategy == null) {
            strategy = field == (java.util.Calendar.ZONE_OFFSET) ? new org.apache.commons.lang3.time.FastDateParser.TimeZoneStrategy(definingCalendar , locale) : new org.apache.commons.lang3.time.FastDateParser.CaseInsensitiveTextStrategy(field , definingCalendar , locale);
            final org.apache.commons.lang3.time.FastDateParser.Strategy inCache = cache.putIfAbsent(locale, strategy);
            if (inCache != null) {
                return inCache;
            } 
        } 
        return strategy;
    }

    private static class CopyQuotedStrategy extends org.apache.commons.lang3.time.FastDateParser.Strategy {
        private final java.lang.String formatField;

        CopyQuotedStrategy(final java.lang.String formatField) {
            this.formatField = formatField;
        }

        @java.lang.Override
        boolean isNumber() {
            return false;
        }

        @java.lang.Override
        boolean parse(org.apache.commons.lang3.time.FastDateParser parser, java.util.Calendar calendar, java.lang.String source, java.text.ParsePosition pos, int maxWidth) {
            for (int idx = 0 ; idx < (formatField.length()) ; ++idx) {
                int sIdx = ((_arithmeticOperatorHotSpot310.is("PLUS")) ? (idx + (pos.getIndex())) : (_arithmeticOperatorHotSpot310.is("MINUS")) ? (idx - (pos.getIndex())) : (_arithmeticOperatorHotSpot310.is("MUL")) ? (idx * (pos.getIndex())) :  (idx / (pos.getIndex())));
                if (sIdx == (source.length())) {
                    pos.setErrorIndex(sIdx);
                    return false;
                } 
                if ((formatField.charAt(idx)) != (source.charAt(sIdx))) {
                    pos.setErrorIndex(sIdx);
                    return false;
                } 
            }
            pos.setIndex(((_arithmeticOperatorHotSpot311.is("PLUS")) ? (((formatField.length()) + (pos.getIndex()))) : (_arithmeticOperatorHotSpot311.is("MINUS")) ? (((formatField.length()) - (pos.getIndex()))) : (_arithmeticOperatorHotSpot311.is("MUL")) ? (((formatField.length()) * (pos.getIndex()))) :  (((formatField.length()) / (pos.getIndex())))));
            return true;
        }
    }

    private static class CaseInsensitiveTextStrategy extends org.apache.commons.lang3.time.FastDateParser.PatternStrategy {
        private final int field;

        final java.util.Locale locale;

        private final java.util.Map<java.lang.String, java.lang.Integer> lKeyValues = new java.util.HashMap<java.lang.String, java.lang.Integer>();

        CaseInsensitiveTextStrategy(final int field ,final java.util.Calendar definingCalendar ,final java.util.Locale locale) {
            this.field = field;
            this.locale = locale;
            java.lang.StringBuilder regex = new java.lang.StringBuilder();
            regex.append("((?iu)");
            org.apache.commons.lang3.time.FastDateParser.appendDisplayNames(definingCalendar, locale, field, regex, lKeyValues);
            regex.setLength(((regex.length()) - 1));
            regex.append(")");
            createPattern(regex);
        }

        @java.lang.Override
        void setCalendar(org.apache.commons.lang3.time.FastDateParser parser, java.util.Calendar cal, java.lang.String value) {
            final java.lang.Integer iVal = lKeyValues.get(value.toLowerCase(locale));
            cal.set(field, iVal.intValue());
        }
    }

    private static class NumberStrategy extends org.apache.commons.lang3.time.FastDateParser.Strategy {
        private final int field;

        NumberStrategy(final int field) {
            this.field = field;
        }

        @java.lang.Override
        boolean isNumber() {
            return true;
        }

        @java.lang.Override
        boolean parse(org.apache.commons.lang3.time.FastDateParser parser, java.util.Calendar calendar, java.lang.String source, java.text.ParsePosition pos, int maxWidth) {
            int idx = pos.getIndex();
            int last = source.length();
            if (maxWidth == 0) {
                for ( ; idx < last ; ++idx) {
                    char c = source.charAt(idx);
                    if (!(java.lang.Character.isWhitespace(c))) {
                        break;
                    } 
                }
                pos.setIndex(idx);
            } else {
                int end = ((_arithmeticOperatorHotSpot312.is("PLUS")) ? (idx + maxWidth) : (_arithmeticOperatorHotSpot312.is("MINUS")) ? (idx - maxWidth) : (_arithmeticOperatorHotSpot312.is("MUL")) ? (idx * maxWidth) :  (idx / maxWidth));
                if (last > end) {
                    last = end;
                } 
            }
            for ( ; idx < last ; ++idx) {
                char c = source.charAt(idx);
                if (!(java.lang.Character.isDigit(c))) {
                    break;
                } 
            }
            if ((pos.getIndex()) == idx) {
                pos.setErrorIndex(idx);
                return false;
            } 
            int value = java.lang.Integer.parseInt(source.substring(pos.getIndex(), idx));
            pos.setIndex(idx);
            calendar.set(field, modify(parser, value));
            return true;
        }

        int modify(org.apache.commons.lang3.time.FastDateParser parser, final int iValue) {
            return iValue;
        }
    }

    private static final org.apache.commons.lang3.time.FastDateParser.Strategy ABBREVIATED_YEAR_STRATEGY = new org.apache.commons.lang3.time.FastDateParser.NumberStrategy(java.util.Calendar.YEAR) {
        @java.lang.Override
        int modify(org.apache.commons.lang3.time.FastDateParser parser, final int iValue) {
            return iValue < 100 ? parser.adjustYear(iValue) : iValue;
        }
    };

    static class TimeZoneStrategy extends org.apache.commons.lang3.time.FastDateParser.PatternStrategy {
        private static final java.lang.String RFC_822_TIME_ZONE = "[+-]\\d{4}";

        private static final java.lang.String GMT_OPTION = "GMT[+-]\\d{1,2}:\\d{2}";

        private final java.util.Locale locale;

        private final java.util.Map<java.lang.String, java.util.TimeZone> tzNames = new java.util.HashMap<java.lang.String, java.util.TimeZone>();

        private static final int ID = 0;

        TimeZoneStrategy(java.util.Calendar cal ,final java.util.Locale locale) {
            this.locale = locale;
            final java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(((('(' + (RFC_822_TIME_ZONE)) + "|(?iu)") + (GMT_OPTION)));
            final java.lang.String[][] zones = java.text.DateFormatSymbols.getInstance(locale).getZoneStrings();
            for (final java.lang.String[] zoneNames : zones) {
                final java.lang.String tzId = zoneNames[ID];
                if (tzId.equalsIgnoreCase("GMT")) {
                    continue;
                } 
                final java.util.TimeZone tz = java.util.TimeZone.getTimeZone(tzId);
                for (int i = 1 ; i < (zoneNames.length) ; ++i) {
                    java.lang.String zoneName = zoneNames[i];
                    if ((tzNames.put(zoneName.toLowerCase(locale), tz)) == null) {
                        org.apache.commons.lang3.time.FastDateParser.simpleQuote(sb.append('|'), zoneName);
                    } 
                }
            }
            sb.append(")");
            createPattern(sb);
        }

        @java.lang.Override
        void setCalendar(final org.apache.commons.lang3.time.FastDateParser parser, final java.util.Calendar cal, final java.lang.String value) {
            java.util.TimeZone tz;
            if (((value.charAt(0)) == '+') || ((value.charAt(0)) == '-')) {
                tz = java.util.TimeZone.getTimeZone(("GMT" + value));
            } else if (value.regionMatches(true, 0, "GMT", 0, 3)) {
                tz = java.util.TimeZone.getTimeZone(value.toUpperCase());
            } else {
                tz = tzNames.get(value.toLowerCase(locale));
            }
            cal.setTimeZone(tz);
        }
    }

    private static class ISO8601TimeZoneStrategy extends org.apache.commons.lang3.time.FastDateParser.PatternStrategy {
        ISO8601TimeZoneStrategy(java.lang.String pattern) {
            createPattern(pattern);
        }

        @java.lang.Override
        void setCalendar(org.apache.commons.lang3.time.FastDateParser parser, java.util.Calendar cal, java.lang.String value) {
            if (value.equals("Z")) {
                cal.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
            } else {
                cal.setTimeZone(java.util.TimeZone.getTimeZone(("GMT" + value)));
            }
        }

        private static final org.apache.commons.lang3.time.FastDateParser.Strategy ISO_8601_1_STRATEGY = new org.apache.commons.lang3.time.FastDateParser.ISO8601TimeZoneStrategy("(Z|(?:[+-]\\d{2}))");

        private static final org.apache.commons.lang3.time.FastDateParser.Strategy ISO_8601_2_STRATEGY = new org.apache.commons.lang3.time.FastDateParser.ISO8601TimeZoneStrategy("(Z|(?:[+-]\\d{2}\\d{2}))");

        private static final org.apache.commons.lang3.time.FastDateParser.Strategy ISO_8601_3_STRATEGY = new org.apache.commons.lang3.time.FastDateParser.ISO8601TimeZoneStrategy("(Z|(?:[+-]\\d{2}(?::)\\d{2}))");

        static org.apache.commons.lang3.time.FastDateParser.Strategy getStrategy(int tokenLen) {
            switch (tokenLen) {
                case 1 :
                    return ISO_8601_1_STRATEGY;
                case 2 :
                    return ISO_8601_2_STRATEGY;
                case 3 :
                    return ISO_8601_3_STRATEGY;
                default :
                    throw new java.lang.IllegalArgumentException("invalid number of X");
            }
        }
    }

    private static final org.apache.commons.lang3.time.FastDateParser.Strategy NUMBER_MONTH_STRATEGY = new org.apache.commons.lang3.time.FastDateParser.NumberStrategy(java.util.Calendar.MONTH) {
        @java.lang.Override
        int modify(org.apache.commons.lang3.time.FastDateParser parser, final int iValue) {
            return iValue - 1;
        }
    };

    private static final org.apache.commons.lang3.time.FastDateParser.Strategy LITERAL_YEAR_STRATEGY = new org.apache.commons.lang3.time.FastDateParser.NumberStrategy(java.util.Calendar.YEAR);

    private static final org.apache.commons.lang3.time.FastDateParser.Strategy WEEK_OF_YEAR_STRATEGY = new org.apache.commons.lang3.time.FastDateParser.NumberStrategy(java.util.Calendar.WEEK_OF_YEAR);

    private static final org.apache.commons.lang3.time.FastDateParser.Strategy WEEK_OF_MONTH_STRATEGY = new org.apache.commons.lang3.time.FastDateParser.NumberStrategy(java.util.Calendar.WEEK_OF_MONTH);

    private static final org.apache.commons.lang3.time.FastDateParser.Strategy DAY_OF_YEAR_STRATEGY = new org.apache.commons.lang3.time.FastDateParser.NumberStrategy(java.util.Calendar.DAY_OF_YEAR);

    private static final org.apache.commons.lang3.time.FastDateParser.Strategy DAY_OF_MONTH_STRATEGY = new org.apache.commons.lang3.time.FastDateParser.NumberStrategy(java.util.Calendar.DAY_OF_MONTH);

    private static final org.apache.commons.lang3.time.FastDateParser.Strategy DAY_OF_WEEK_IN_MONTH_STRATEGY = new org.apache.commons.lang3.time.FastDateParser.NumberStrategy(java.util.Calendar.DAY_OF_WEEK_IN_MONTH);

    private static final org.apache.commons.lang3.time.FastDateParser.Strategy HOUR_OF_DAY_STRATEGY = new org.apache.commons.lang3.time.FastDateParser.NumberStrategy(java.util.Calendar.HOUR_OF_DAY);

    private static final org.apache.commons.lang3.time.FastDateParser.Strategy HOUR24_OF_DAY_STRATEGY = new org.apache.commons.lang3.time.FastDateParser.NumberStrategy(java.util.Calendar.HOUR_OF_DAY) {
        @java.lang.Override
        int modify(org.apache.commons.lang3.time.FastDateParser parser, final int iValue) {
            return iValue == 24 ? 0 : iValue;
        }
    };

    private static final org.apache.commons.lang3.time.FastDateParser.Strategy HOUR12_STRATEGY = new org.apache.commons.lang3.time.FastDateParser.NumberStrategy(java.util.Calendar.HOUR) {
        @java.lang.Override
        int modify(org.apache.commons.lang3.time.FastDateParser parser, final int iValue) {
            return iValue == 12 ? 0 : iValue;
        }
    };

    private static final org.apache.commons.lang3.time.FastDateParser.Strategy HOUR_STRATEGY = new org.apache.commons.lang3.time.FastDateParser.NumberStrategy(java.util.Calendar.HOUR);

    private static final org.apache.commons.lang3.time.FastDateParser.Strategy MINUTE_STRATEGY = new org.apache.commons.lang3.time.FastDateParser.NumberStrategy(java.util.Calendar.MINUTE);

    private static final org.apache.commons.lang3.time.FastDateParser.Strategy SECOND_STRATEGY = new org.apache.commons.lang3.time.FastDateParser.NumberStrategy(java.util.Calendar.SECOND);

    private static final org.apache.commons.lang3.time.FastDateParser.Strategy MILLISECOND_STRATEGY = new org.apache.commons.lang3.time.FastDateParser.NumberStrategy(java.util.Calendar.MILLISECOND);

    private static final metamutator.Selector _arithmeticOperatorHotSpot310 = metamutator.Selector.of(310,new String[]{"PLUS","MINUS","MUL","DIV"}).id("_arithmeticOperatorHotSpot310");

    private static final metamutator.Selector _arithmeticOperatorHotSpot311 = metamutator.Selector.of(311,new String[]{"PLUS","MINUS","MUL","DIV"}).id("_arithmeticOperatorHotSpot311");

    private static final metamutator.Selector _arithmeticOperatorHotSpot312 = metamutator.Selector.of(312,new String[]{"PLUS","MINUS","MUL","DIV"}).id("_arithmeticOperatorHotSpot312");

    private static final metamutator.Selector _arithmeticOperatorHotSpot313 = metamutator.Selector.of(313,new String[]{"PLUS","MINUS","MUL","DIV"}).id("_arithmeticOperatorHotSpot313");

    private static final metamutator.Selector _arithmeticOperatorHotSpot314 = metamutator.Selector.of(314,new String[]{"MINUS","PLUS","MUL","DIV"}).id("_arithmeticOperatorHotSpot314");

    private static final metamutator.Selector _arithmeticOperatorHotSpot315 = metamutator.Selector.of(315,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_arithmeticOperatorHotSpot315");

    private static final metamutator.Selector _arithmeticOperatorHotSpot316 = metamutator.Selector.of(316,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_arithmeticOperatorHotSpot316");

    private static final metamutator.Selector _arithmeticOperatorHotSpot317 = metamutator.Selector.of(317,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_arithmeticOperatorHotSpot317");
}

