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
                return ((_returnReplacementOperator1738.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1738.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1738.is("ZERO")) ? ( 0 ) : (0));
            } 
            org.apache.commons.lang3.time.FastDateParser.Strategy nextStrategy = lt.next().strategy;
            lt.previous();
            return ((_returnReplacementOperator1739.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1739.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1739.is("ZERO")) ? ( 0 ) : (nextStrategy.isNumber() ? width : 0));
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
                return ((_returnReplacementOperator1740.is("NULL")) ? ( null ) : (null));
            } 
            char c = pattern.charAt(currentIdx);
            if (org.apache.commons.lang3.time.FastDateParser.isFormatLetter(c)) {
                return ((_returnReplacementOperator1741.is("NULL")) ? ( null ) : (letterPattern(c)));
            } else {
                return ((_returnReplacementOperator1742.is("NULL")) ? ( null ) : (literal()));
            }
        }

        private org.apache.commons.lang3.time.FastDateParser.StrategyAndWidth letterPattern(char c) {
            int begin = currentIdx;
            while ((++(currentIdx)) < (pattern.length())) {
                if ((pattern.charAt(currentIdx)) != c) {
                    break;
                } 
            }
            int width = (currentIdx) - begin;
            return ((_returnReplacementOperator1743.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.time.FastDateParser.StrategyAndWidth(getStrategy(c, width, definingCalendar) , width)));
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
            return ((_returnReplacementOperator1744.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.time.FastDateParser.StrategyAndWidth(new org.apache.commons.lang3.time.FastDateParser.CopyQuotedStrategy(formatField) , formatField.length())));
        }
    }

    private static boolean isFormatLetter(char c) {
        return ((_returnReplacementOperator1747.is("NULL")) ? ( null ) : (((c >= 'A') && (c <= 'Z')) || ((c >= 'a') && (c <= 'z'))));
    }

    @java.lang.Override
    public java.lang.String getPattern() {
        return ((_returnReplacementOperator1754.is("NULL")) ? ( null ) : (pattern));
    }

    @java.lang.Override
    public java.util.TimeZone getTimeZone() {
        return ((_returnReplacementOperator1760.is("NULL")) ? ( null ) : (timeZone));
    }

    @java.lang.Override
    public java.util.Locale getLocale() {
        return ((_returnReplacementOperator1759.is("NULL")) ? ( null ) : (locale));
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (!(obj instanceof org.apache.commons.lang3.time.FastDateParser)) {
            return ((_returnReplacementOperator1745.is("NULL")) ? ( null ) : (false));
        } 
        final org.apache.commons.lang3.time.FastDateParser other = ((org.apache.commons.lang3.time.FastDateParser)(obj));
        return ((_returnReplacementOperator1746.is("NULL")) ? ( null ) : (((pattern.equals(other.pattern)) && (timeZone.equals(other.timeZone))) && (locale.equals(other.locale))));
    }

    @java.lang.Override
    public int hashCode() {
        return ((_returnReplacementOperator1751.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1751.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1751.is("ZERO")) ? ( 0 ) : ((pattern.hashCode()) + (13 * ((timeZone.hashCode()) + (13 * (locale.hashCode()))))));
    }

    @java.lang.Override
    public java.lang.String toString() {
        return ((_returnReplacementOperator1755.is("NULL")) ? ( null ) : (((((("FastDateParser[" + (pattern)) + ",") + (locale)) + ",") + (timeZone.getID())) + "]"));
    }

    private void readObject(final java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        in.defaultReadObject();
        final java.util.Calendar definingCalendar = java.util.Calendar.getInstance(timeZone, locale);
        init(definingCalendar);
    }

    @java.lang.Override
    public java.lang.Object parseObject(final java.lang.String source) throws java.text.ParseException {
        return ((_returnReplacementOperator1752.is("NULL")) ? ( null ) : (parse(source)));
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
        return ((_returnReplacementOperator1757.is("NULL")) ? ( null ) : (date));
    }

    @java.lang.Override
    public java.lang.Object parseObject(final java.lang.String source, final java.text.ParsePosition pos) {
        return ((_returnReplacementOperator1753.is("NULL")) ? ( null ) : (parse(source, pos)));
    }

    @java.lang.Override
    public java.util.Date parse(final java.lang.String source, final java.text.ParsePosition pos) {
        final java.util.Calendar cal = java.util.Calendar.getInstance(timeZone, locale);
        cal.clear();
        return ((_returnReplacementOperator1758.is("NULL")) ? ( null ) : (parse(source, pos, cal) ? cal.getTime() : null));
    }

    public boolean parse(final java.lang.String source, final java.text.ParsePosition pos, final java.util.Calendar calendar) {
        java.util.ListIterator<org.apache.commons.lang3.time.FastDateParser.StrategyAndWidth> lt = patterns.listIterator();
        while (lt.hasNext()) {
            org.apache.commons.lang3.time.FastDateParser.StrategyAndWidth pattern = lt.next();
            int maxWidth = pattern.getMaxWidth(lt);
            if (!(pattern.strategy.parse(this, calendar, source, pos, maxWidth))) {
                return ((_returnReplacementOperator1748.is("NULL")) ? ( null ) : (false));
            } 
        }
        return ((_returnReplacementOperator1749.is("NULL")) ? ( null ) : (true));
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
        return ((_returnReplacementOperator1756.is("NULL")) ? ( null ) : (sb));
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
        final int trial = (century) + twoDigitYear;
        return ((_returnReplacementOperator1750.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1750.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1750.is("ZERO")) ? ( 0 ) : (twoDigitYear >= (startYear) ? trial : trial + 100));
    }

    private abstract static class Strategy {
        boolean isNumber() {
            return ((_returnReplacementOperator1737.is("NULL")) ? ( null ) : (false));
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
            return ((_returnReplacementOperator1734.is("NULL")) ? ( null ) : (false));
        }

        @java.lang.Override
        boolean parse(org.apache.commons.lang3.time.FastDateParser parser, java.util.Calendar calendar, java.lang.String source, java.text.ParsePosition pos, int maxWidth) {
            java.util.regex.Matcher matcher = pattern.matcher(source.substring(pos.getIndex()));
            if (!(matcher.lookingAt())) {
                pos.setErrorIndex(pos.getIndex());
                return ((_returnReplacementOperator1735.is("NULL")) ? ( null ) : (false));
            } 
            pos.setIndex(((pos.getIndex()) + (matcher.end(1))));
            setCalendar(parser, calendar, matcher.group(1));
            return ((_returnReplacementOperator1736.is("NULL")) ? ( null ) : (true));
        }

        abstract void setCalendar(org.apache.commons.lang3.time.FastDateParser parser, java.util.Calendar cal, java.lang.String value);
    }

    private org.apache.commons.lang3.time.FastDateParser.Strategy getStrategy(char f, int width, final java.util.Calendar definingCalendar) {
        switch (f) {
            default :
                throw new java.lang.IllegalArgumentException((("Format '" + f) + "' not supported"));
            case 'D' :
                return ((_returnReplacementOperator1764.is("NULL")) ? ( null ) : (org.apache.commons.lang3.time.FastDateParser.DAY_OF_YEAR_STRATEGY));
            case 'E' :
                return ((_returnReplacementOperator1765.is("NULL")) ? ( null ) : (getLocaleSpecificStrategy(java.util.Calendar.DAY_OF_WEEK, definingCalendar)));
            case 'F' :
                return ((_returnReplacementOperator1766.is("NULL")) ? ( null ) : (org.apache.commons.lang3.time.FastDateParser.DAY_OF_WEEK_IN_MONTH_STRATEGY));
            case 'G' :
                return ((_returnReplacementOperator1767.is("NULL")) ? ( null ) : (getLocaleSpecificStrategy(java.util.Calendar.ERA, definingCalendar)));
            case 'H' :
                return ((_returnReplacementOperator1768.is("NULL")) ? ( null ) : (org.apache.commons.lang3.time.FastDateParser.HOUR_OF_DAY_STRATEGY));
            case 'K' :
                return ((_returnReplacementOperator1769.is("NULL")) ? ( null ) : (org.apache.commons.lang3.time.FastDateParser.HOUR_STRATEGY));
            case 'M' :
                return ((_returnReplacementOperator1770.is("NULL")) ? ( null ) : (width >= 3 ? getLocaleSpecificStrategy(java.util.Calendar.MONTH, definingCalendar) : org.apache.commons.lang3.time.FastDateParser.NUMBER_MONTH_STRATEGY));
            case 'S' :
                return ((_returnReplacementOperator1771.is("NULL")) ? ( null ) : (org.apache.commons.lang3.time.FastDateParser.MILLISECOND_STRATEGY));
            case 'W' :
                return ((_returnReplacementOperator1772.is("NULL")) ? ( null ) : (org.apache.commons.lang3.time.FastDateParser.WEEK_OF_MONTH_STRATEGY));
            case 'a' :
                return ((_returnReplacementOperator1773.is("NULL")) ? ( null ) : (getLocaleSpecificStrategy(java.util.Calendar.AM_PM, definingCalendar)));
            case 'd' :
                return ((_returnReplacementOperator1774.is("NULL")) ? ( null ) : (org.apache.commons.lang3.time.FastDateParser.DAY_OF_MONTH_STRATEGY));
            case 'h' :
                return ((_returnReplacementOperator1775.is("NULL")) ? ( null ) : (org.apache.commons.lang3.time.FastDateParser.HOUR12_STRATEGY));
            case 'k' :
                return ((_returnReplacementOperator1776.is("NULL")) ? ( null ) : (org.apache.commons.lang3.time.FastDateParser.HOUR24_OF_DAY_STRATEGY));
            case 'm' :
                return ((_returnReplacementOperator1777.is("NULL")) ? ( null ) : (org.apache.commons.lang3.time.FastDateParser.MINUTE_STRATEGY));
            case 's' :
                return ((_returnReplacementOperator1778.is("NULL")) ? ( null ) : (org.apache.commons.lang3.time.FastDateParser.SECOND_STRATEGY));
            case 'w' :
                return ((_returnReplacementOperator1779.is("NULL")) ? ( null ) : (org.apache.commons.lang3.time.FastDateParser.WEEK_OF_YEAR_STRATEGY));
            case 'y' :
                return ((_returnReplacementOperator1780.is("NULL")) ? ( null ) : (width > 2 ? org.apache.commons.lang3.time.FastDateParser.LITERAL_YEAR_STRATEGY : org.apache.commons.lang3.time.FastDateParser.ABBREVIATED_YEAR_STRATEGY));
            case 'X' :
                return ((_returnReplacementOperator1781.is("NULL")) ? ( null ) : (org.apache.commons.lang3.time.FastDateParser.ISO8601TimeZoneStrategy.getStrategy(width)));
            case 'Z' :
                if (width == 2) {
                    return ((_returnReplacementOperator1782.is("NULL")) ? ( null ) : (org.apache.commons.lang3.time.FastDateParser.ISO8601TimeZoneStrategy.ISO_8601_3_STRATEGY));
                } 
            case 'z' :
                return ((_returnReplacementOperator1783.is("NULL")) ? ( null ) : (getLocaleSpecificStrategy(java.util.Calendar.ZONE_OFFSET, definingCalendar)));
        }
    }

    @java.lang.SuppressWarnings(value = "unchecked")
    private static final java.util.concurrent.ConcurrentMap<java.util.Locale, org.apache.commons.lang3.time.FastDateParser.Strategy>[] caches = new java.util.concurrent.ConcurrentMap[java.util.Calendar.FIELD_COUNT];

    private static java.util.concurrent.ConcurrentMap<java.util.Locale, org.apache.commons.lang3.time.FastDateParser.Strategy> getCache(final int field) {
        synchronized(caches) {
            if ((caches[field]) == null) {
                caches[field] = new java.util.concurrent.ConcurrentHashMap<java.util.Locale, org.apache.commons.lang3.time.FastDateParser.Strategy>(3);
            } 
            return ((_returnReplacementOperator1761.is("NULL")) ? ( null ) : (org.apache.commons.lang3.time.FastDateParser.caches[field]));
        }
    }

    private org.apache.commons.lang3.time.FastDateParser.Strategy getLocaleSpecificStrategy(final int field, final java.util.Calendar definingCalendar) {
        final java.util.concurrent.ConcurrentMap<java.util.Locale, org.apache.commons.lang3.time.FastDateParser.Strategy> cache = org.apache.commons.lang3.time.FastDateParser.getCache(field);
        org.apache.commons.lang3.time.FastDateParser.Strategy strategy = cache.get(locale);
        if (strategy == null) {
            strategy = field == (java.util.Calendar.ZONE_OFFSET) ? new org.apache.commons.lang3.time.FastDateParser.TimeZoneStrategy(definingCalendar , locale) : new org.apache.commons.lang3.time.FastDateParser.CaseInsensitiveTextStrategy(field , definingCalendar , locale);
            final org.apache.commons.lang3.time.FastDateParser.Strategy inCache = cache.putIfAbsent(locale, strategy);
            if (inCache != null) {
                return ((_returnReplacementOperator1762.is("NULL")) ? ( null ) : (inCache));
            } 
        } 
        return ((_returnReplacementOperator1763.is("NULL")) ? ( null ) : (strategy));
    }

    private static class CopyQuotedStrategy extends org.apache.commons.lang3.time.FastDateParser.Strategy {
        private final java.lang.String formatField;

        CopyQuotedStrategy(final java.lang.String formatField) {
            this.formatField = formatField;
        }

        @java.lang.Override
        boolean isNumber() {
            return ((_returnReplacementOperator1723.is("NULL")) ? ( null ) : (false));
        }

        @java.lang.Override
        boolean parse(org.apache.commons.lang3.time.FastDateParser parser, java.util.Calendar calendar, java.lang.String source, java.text.ParsePosition pos, int maxWidth) {
            for (int idx = 0 ; idx < (formatField.length()) ; ++idx) {
                int sIdx = idx + (pos.getIndex());
                if (sIdx == (source.length())) {
                    pos.setErrorIndex(sIdx);
                    return ((_returnReplacementOperator1724.is("NULL")) ? ( null ) : (false));
                } 
                if ((formatField.charAt(idx)) != (source.charAt(sIdx))) {
                    pos.setErrorIndex(sIdx);
                    return ((_returnReplacementOperator1725.is("NULL")) ? ( null ) : (false));
                } 
            }
            pos.setIndex(((formatField.length()) + (pos.getIndex())));
            return ((_returnReplacementOperator1726.is("NULL")) ? ( null ) : (true));
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
            return ((_returnReplacementOperator1730.is("NULL")) ? ( null ) : (true));
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
                int end = idx + maxWidth;
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
                return ((_returnReplacementOperator1731.is("NULL")) ? ( null ) : (false));
            } 
            int value = java.lang.Integer.parseInt(source.substring(pos.getIndex(), idx));
            pos.setIndex(idx);
            calendar.set(field, modify(parser, value));
            return ((_returnReplacementOperator1732.is("NULL")) ? ( null ) : (true));
        }

        int modify(org.apache.commons.lang3.time.FastDateParser parser, final int iValue) {
            return ((_returnReplacementOperator1733.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1733.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1733.is("ZERO")) ? ( 0 ) : (iValue));
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
                    return ((_returnReplacementOperator1727.is("NULL")) ? ( null ) : (org.apache.commons.lang3.time.FastDateParser.ISO8601TimeZoneStrategy.ISO_8601_1_STRATEGY));
                case 2 :
                    return ((_returnReplacementOperator1728.is("NULL")) ? ( null ) : (org.apache.commons.lang3.time.FastDateParser.ISO8601TimeZoneStrategy.ISO_8601_2_STRATEGY));
                case 3 :
                    return ((_returnReplacementOperator1729.is("NULL")) ? ( null ) : (org.apache.commons.lang3.time.FastDateParser.ISO8601TimeZoneStrategy.ISO_8601_3_STRATEGY));
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

    private static final metamutator.Selector _returnReplacementOperator1723 = metamutator.Selector.of(1723,new String[]{"INIT","NULL"}).id("_returnReplacementOperator1723");

    private static final metamutator.Selector _returnReplacementOperator1724 = metamutator.Selector.of(1724,new String[]{"INIT","NULL"}).id("_returnReplacementOperator1724");

    private static final metamutator.Selector _returnReplacementOperator1725 = metamutator.Selector.of(1725,new String[]{"INIT","NULL"}).id("_returnReplacementOperator1725");

    private static final metamutator.Selector _returnReplacementOperator1726 = metamutator.Selector.of(1726,new String[]{"INIT","NULL"}).id("_returnReplacementOperator1726");

    private static final metamutator.Selector _returnReplacementOperator1727 = metamutator.Selector.of(1727,new String[]{"INIT","NULL"}).id("_returnReplacementOperator1727");

    private static final metamutator.Selector _returnReplacementOperator1728 = metamutator.Selector.of(1728,new String[]{"INIT","NULL"}).id("_returnReplacementOperator1728");

    private static final metamutator.Selector _returnReplacementOperator1729 = metamutator.Selector.of(1729,new String[]{"INIT","NULL"}).id("_returnReplacementOperator1729");

    private static final metamutator.Selector _returnReplacementOperator1730 = metamutator.Selector.of(1730,new String[]{"INIT","NULL"}).id("_returnReplacementOperator1730");

    private static final metamutator.Selector _returnReplacementOperator1731 = metamutator.Selector.of(1731,new String[]{"INIT","NULL"}).id("_returnReplacementOperator1731");

    private static final metamutator.Selector _returnReplacementOperator1732 = metamutator.Selector.of(1732,new String[]{"INIT","NULL"}).id("_returnReplacementOperator1732");

    private static final metamutator.Selector _returnReplacementOperator1733 = metamutator.Selector.of(1733,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).id("_returnReplacementOperator1733");

    private static final metamutator.Selector _returnReplacementOperator1734 = metamutator.Selector.of(1734,new String[]{"INIT","NULL"}).id("_returnReplacementOperator1734");

    private static final metamutator.Selector _returnReplacementOperator1735 = metamutator.Selector.of(1735,new String[]{"INIT","NULL"}).id("_returnReplacementOperator1735");

    private static final metamutator.Selector _returnReplacementOperator1736 = metamutator.Selector.of(1736,new String[]{"INIT","NULL"}).id("_returnReplacementOperator1736");

    private static final metamutator.Selector _returnReplacementOperator1737 = metamutator.Selector.of(1737,new String[]{"INIT","NULL"}).id("_returnReplacementOperator1737");

    private static final metamutator.Selector _returnReplacementOperator1738 = metamutator.Selector.of(1738,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).id("_returnReplacementOperator1738");

    private static final metamutator.Selector _returnReplacementOperator1739 = metamutator.Selector.of(1739,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).id("_returnReplacementOperator1739");

    private static final metamutator.Selector _returnReplacementOperator1740 = metamutator.Selector.of(1740,new String[]{"INIT","NULL"}).id("_returnReplacementOperator1740");

    private static final metamutator.Selector _returnReplacementOperator1741 = metamutator.Selector.of(1741,new String[]{"INIT","NULL"}).id("_returnReplacementOperator1741");

    private static final metamutator.Selector _returnReplacementOperator1742 = metamutator.Selector.of(1742,new String[]{"INIT","NULL"}).id("_returnReplacementOperator1742");

    private static final metamutator.Selector _returnReplacementOperator1743 = metamutator.Selector.of(1743,new String[]{"INIT","NULL"}).id("_returnReplacementOperator1743");

    private static final metamutator.Selector _returnReplacementOperator1744 = metamutator.Selector.of(1744,new String[]{"INIT","NULL"}).id("_returnReplacementOperator1744");

    private static final metamutator.Selector _returnReplacementOperator1745 = metamutator.Selector.of(1745,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperator1745");

    private static final metamutator.Selector _returnReplacementOperator1746 = metamutator.Selector.of(1746,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperator1746");

    private static final metamutator.Selector _returnReplacementOperator1747 = metamutator.Selector.of(1747,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperator1747");

    private static final metamutator.Selector _returnReplacementOperator1748 = metamutator.Selector.of(1748,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperator1748");

    private static final metamutator.Selector _returnReplacementOperator1749 = metamutator.Selector.of(1749,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperator1749");

    private static final metamutator.Selector _returnReplacementOperator1750 = metamutator.Selector.of(1750,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperator1750");

    private static final metamutator.Selector _returnReplacementOperator1751 = metamutator.Selector.of(1751,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperator1751");

    private static final metamutator.Selector _returnReplacementOperator1752 = metamutator.Selector.of(1752,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperator1752");

    private static final metamutator.Selector _returnReplacementOperator1753 = metamutator.Selector.of(1753,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperator1753");

    private static final metamutator.Selector _returnReplacementOperator1754 = metamutator.Selector.of(1754,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperator1754");

    private static final metamutator.Selector _returnReplacementOperator1755 = metamutator.Selector.of(1755,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperator1755");

    private static final metamutator.Selector _returnReplacementOperator1756 = metamutator.Selector.of(1756,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperator1756");

    private static final metamutator.Selector _returnReplacementOperator1757 = metamutator.Selector.of(1757,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperator1757");

    private static final metamutator.Selector _returnReplacementOperator1758 = metamutator.Selector.of(1758,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperator1758");

    private static final metamutator.Selector _returnReplacementOperator1759 = metamutator.Selector.of(1759,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperator1759");

    private static final metamutator.Selector _returnReplacementOperator1760 = metamutator.Selector.of(1760,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperator1760");

    private static final metamutator.Selector _returnReplacementOperator1761 = metamutator.Selector.of(1761,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperator1761");

    private static final metamutator.Selector _returnReplacementOperator1762 = metamutator.Selector.of(1762,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperator1762");

    private static final metamutator.Selector _returnReplacementOperator1763 = metamutator.Selector.of(1763,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperator1763");

    private static final metamutator.Selector _returnReplacementOperator1764 = metamutator.Selector.of(1764,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperator1764");

    private static final metamutator.Selector _returnReplacementOperator1765 = metamutator.Selector.of(1765,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperator1765");

    private static final metamutator.Selector _returnReplacementOperator1766 = metamutator.Selector.of(1766,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperator1766");

    private static final metamutator.Selector _returnReplacementOperator1767 = metamutator.Selector.of(1767,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperator1767");

    private static final metamutator.Selector _returnReplacementOperator1768 = metamutator.Selector.of(1768,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperator1768");

    private static final metamutator.Selector _returnReplacementOperator1769 = metamutator.Selector.of(1769,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperator1769");

    private static final metamutator.Selector _returnReplacementOperator1770 = metamutator.Selector.of(1770,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperator1770");

    private static final metamutator.Selector _returnReplacementOperator1771 = metamutator.Selector.of(1771,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperator1771");

    private static final metamutator.Selector _returnReplacementOperator1772 = metamutator.Selector.of(1772,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperator1772");

    private static final metamutator.Selector _returnReplacementOperator1773 = metamutator.Selector.of(1773,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperator1773");

    private static final metamutator.Selector _returnReplacementOperator1774 = metamutator.Selector.of(1774,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperator1774");

    private static final metamutator.Selector _returnReplacementOperator1775 = metamutator.Selector.of(1775,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperator1775");

    private static final metamutator.Selector _returnReplacementOperator1776 = metamutator.Selector.of(1776,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperator1776");

    private static final metamutator.Selector _returnReplacementOperator1777 = metamutator.Selector.of(1777,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperator1777");

    private static final metamutator.Selector _returnReplacementOperator1778 = metamutator.Selector.of(1778,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperator1778");

    private static final metamutator.Selector _returnReplacementOperator1779 = metamutator.Selector.of(1779,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperator1779");

    private static final metamutator.Selector _returnReplacementOperator1780 = metamutator.Selector.of(1780,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperator1780");

    private static final metamutator.Selector _returnReplacementOperator1781 = metamutator.Selector.of(1781,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperator1781");

    private static final metamutator.Selector _returnReplacementOperator1782 = metamutator.Selector.of(1782,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperator1782");

    private static final metamutator.Selector _returnReplacementOperator1783 = metamutator.Selector.of(1783,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperator1783");
}

