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
                return ((_returnReplacementOperatorHotSpot1738.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1738.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1738.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (0));
            } 
            org.apache.commons.lang3.time.FastDateParser.Strategy nextStrategy = lt.next().strategy;
            lt.previous();
            return ((_returnReplacementOperatorHotSpot1739.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1739.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1739.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (nextStrategy.isNumber() ? width : 0));
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
                return ((_returnReplacementOperatorHotSpot1740.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
            } 
            char c = pattern.charAt(currentIdx);
            if (org.apache.commons.lang3.time.FastDateParser.isFormatLetter(c)) {
                return ((_returnReplacementOperatorHotSpot1741.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (letterPattern(c)));
            } else {
                return ((_returnReplacementOperatorHotSpot1742.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (literal()));
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
            return ((_returnReplacementOperatorHotSpot1743.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.time.FastDateParser.StrategyAndWidth(getStrategy(c, width, definingCalendar) , width)));
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
            return ((_returnReplacementOperatorHotSpot1744.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.time.FastDateParser.StrategyAndWidth(new org.apache.commons.lang3.time.FastDateParser.CopyQuotedStrategy(formatField) , formatField.length())));
        }
    }

    private static boolean isFormatLetter(char c) {
        return ((_returnReplacementOperatorHotSpot1747.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((c >= 'A') && (c <= 'Z')) || ((c >= 'a') && (c <= 'z'))));
    }

    @java.lang.Override
    public java.lang.String getPattern() {
        return ((_returnReplacementOperatorHotSpot1754.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (pattern));
    }

    @java.lang.Override
    public java.util.TimeZone getTimeZone() {
        return ((_returnReplacementOperatorHotSpot1760.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (timeZone));
    }

    @java.lang.Override
    public java.util.Locale getLocale() {
        return ((_returnReplacementOperatorHotSpot1759.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (locale));
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (!(obj instanceof org.apache.commons.lang3.time.FastDateParser)) {
            return ((_returnReplacementOperatorHotSpot1745.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        final org.apache.commons.lang3.time.FastDateParser other = ((org.apache.commons.lang3.time.FastDateParser)(obj));
        return ((_returnReplacementOperatorHotSpot1746.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((pattern.equals(other.pattern)) && (timeZone.equals(other.timeZone))) && (locale.equals(other.locale))));
    }

    @java.lang.Override
    public int hashCode() {
        return ((_returnReplacementOperatorHotSpot1751.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1751.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1751.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : ((pattern.hashCode()) + (13 * ((timeZone.hashCode()) + (13 * (locale.hashCode()))))));
    }

    @java.lang.Override
    public java.lang.String toString() {
        return ((_returnReplacementOperatorHotSpot1755.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((((("FastDateParser[" + (pattern)) + ",") + (locale)) + ",") + (timeZone.getID())) + "]"));
    }

    private void readObject(final java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        in.defaultReadObject();
        final java.util.Calendar definingCalendar = java.util.Calendar.getInstance(timeZone, locale);
        init(definingCalendar);
    }

    @java.lang.Override
    public java.lang.Object parseObject(final java.lang.String source) throws java.text.ParseException {
        return ((_returnReplacementOperatorHotSpot1752.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (parse(source)));
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
        return ((_returnReplacementOperatorHotSpot1757.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (date));
    }

    @java.lang.Override
    public java.lang.Object parseObject(final java.lang.String source, final java.text.ParsePosition pos) {
        return ((_returnReplacementOperatorHotSpot1753.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (parse(source, pos)));
    }

    @java.lang.Override
    public java.util.Date parse(final java.lang.String source, final java.text.ParsePosition pos) {
        final java.util.Calendar cal = java.util.Calendar.getInstance(timeZone, locale);
        cal.clear();
        return ((_returnReplacementOperatorHotSpot1758.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (parse(source, pos, cal) ? cal.getTime() : null));
    }

    public boolean parse(final java.lang.String source, final java.text.ParsePosition pos, final java.util.Calendar calendar) {
        java.util.ListIterator<org.apache.commons.lang3.time.FastDateParser.StrategyAndWidth> lt = patterns.listIterator();
        while (lt.hasNext()) {
            org.apache.commons.lang3.time.FastDateParser.StrategyAndWidth pattern = lt.next();
            int maxWidth = pattern.getMaxWidth(lt);
            if (!(pattern.strategy.parse(this, calendar, source, pos, maxWidth))) {
                return ((_returnReplacementOperatorHotSpot1748.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
            } 
        }
        return ((_returnReplacementOperatorHotSpot1749.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
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
        return ((_returnReplacementOperatorHotSpot1756.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (sb));
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
        return ((_returnReplacementOperatorHotSpot1750.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1750.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1750.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (twoDigitYear >= (startYear) ? trial : trial + 100));
    }

    private abstract static class Strategy {
        boolean isNumber() {
            return ((_returnReplacementOperatorHotSpot1737.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
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
            return ((_returnReplacementOperatorHotSpot1734.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        }

        @java.lang.Override
        boolean parse(org.apache.commons.lang3.time.FastDateParser parser, java.util.Calendar calendar, java.lang.String source, java.text.ParsePosition pos, int maxWidth) {
            java.util.regex.Matcher matcher = pattern.matcher(source.substring(pos.getIndex()));
            if (!(matcher.lookingAt())) {
                pos.setErrorIndex(pos.getIndex());
                return ((_returnReplacementOperatorHotSpot1735.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
            } 
            pos.setIndex(((pos.getIndex()) + (matcher.end(1))));
            setCalendar(parser, calendar, matcher.group(1));
            return ((_returnReplacementOperatorHotSpot1736.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
        }

        abstract void setCalendar(org.apache.commons.lang3.time.FastDateParser parser, java.util.Calendar cal, java.lang.String value);
    }

    private org.apache.commons.lang3.time.FastDateParser.Strategy getStrategy(char f, int width, final java.util.Calendar definingCalendar) {
        switch (f) {
            default :
                throw new java.lang.IllegalArgumentException((("Format '" + f) + "' not supported"));
            case 'D' :
                return ((_returnReplacementOperatorHotSpot1764.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.FastDateParser.DAY_OF_YEAR_STRATEGY));
            case 'E' :
                return ((_returnReplacementOperatorHotSpot1765.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (getLocaleSpecificStrategy(java.util.Calendar.DAY_OF_WEEK, definingCalendar)));
            case 'F' :
                return ((_returnReplacementOperatorHotSpot1766.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.FastDateParser.DAY_OF_WEEK_IN_MONTH_STRATEGY));
            case 'G' :
                return ((_returnReplacementOperatorHotSpot1767.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (getLocaleSpecificStrategy(java.util.Calendar.ERA, definingCalendar)));
            case 'H' :
                return ((_returnReplacementOperatorHotSpot1768.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.FastDateParser.HOUR_OF_DAY_STRATEGY));
            case 'K' :
                return ((_returnReplacementOperatorHotSpot1769.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.FastDateParser.HOUR_STRATEGY));
            case 'M' :
                return ((_returnReplacementOperatorHotSpot1770.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (width >= 3 ? getLocaleSpecificStrategy(java.util.Calendar.MONTH, definingCalendar) : org.apache.commons.lang3.time.FastDateParser.NUMBER_MONTH_STRATEGY));
            case 'S' :
                return ((_returnReplacementOperatorHotSpot1771.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.FastDateParser.MILLISECOND_STRATEGY));
            case 'W' :
                return ((_returnReplacementOperatorHotSpot1772.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.FastDateParser.WEEK_OF_MONTH_STRATEGY));
            case 'a' :
                return ((_returnReplacementOperatorHotSpot1773.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (getLocaleSpecificStrategy(java.util.Calendar.AM_PM, definingCalendar)));
            case 'd' :
                return ((_returnReplacementOperatorHotSpot1774.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.FastDateParser.DAY_OF_MONTH_STRATEGY));
            case 'h' :
                return ((_returnReplacementOperatorHotSpot1775.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.FastDateParser.HOUR12_STRATEGY));
            case 'k' :
                return ((_returnReplacementOperatorHotSpot1776.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.FastDateParser.HOUR24_OF_DAY_STRATEGY));
            case 'm' :
                return ((_returnReplacementOperatorHotSpot1777.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.FastDateParser.MINUTE_STRATEGY));
            case 's' :
                return ((_returnReplacementOperatorHotSpot1778.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.FastDateParser.SECOND_STRATEGY));
            case 'w' :
                return ((_returnReplacementOperatorHotSpot1779.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.FastDateParser.WEEK_OF_YEAR_STRATEGY));
            case 'y' :
                return ((_returnReplacementOperatorHotSpot1780.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (width > 2 ? org.apache.commons.lang3.time.FastDateParser.LITERAL_YEAR_STRATEGY : org.apache.commons.lang3.time.FastDateParser.ABBREVIATED_YEAR_STRATEGY));
            case 'X' :
                return ((_returnReplacementOperatorHotSpot1781.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.FastDateParser.ISO8601TimeZoneStrategy.getStrategy(width)));
            case 'Z' :
                if (width == 2) {
                    return ((_returnReplacementOperatorHotSpot1782.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.FastDateParser.ISO8601TimeZoneStrategy.ISO_8601_3_STRATEGY));
                } 
            case 'z' :
                return ((_returnReplacementOperatorHotSpot1783.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (getLocaleSpecificStrategy(java.util.Calendar.ZONE_OFFSET, definingCalendar)));
        }
    }

    @java.lang.SuppressWarnings(value = "unchecked")
    private static final java.util.concurrent.ConcurrentMap<java.util.Locale, org.apache.commons.lang3.time.FastDateParser.Strategy>[] caches = new java.util.concurrent.ConcurrentMap[java.util.Calendar.FIELD_COUNT];

    private static java.util.concurrent.ConcurrentMap<java.util.Locale, org.apache.commons.lang3.time.FastDateParser.Strategy> getCache(final int field) {
        synchronized(caches) {
            if ((caches[field]) == null) {
                caches[field] = new java.util.concurrent.ConcurrentHashMap<java.util.Locale, org.apache.commons.lang3.time.FastDateParser.Strategy>(3);
            } 
            return ((_returnReplacementOperatorHotSpot1761.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.FastDateParser.caches[field]));
        }
    }

    private org.apache.commons.lang3.time.FastDateParser.Strategy getLocaleSpecificStrategy(final int field, final java.util.Calendar definingCalendar) {
        final java.util.concurrent.ConcurrentMap<java.util.Locale, org.apache.commons.lang3.time.FastDateParser.Strategy> cache = org.apache.commons.lang3.time.FastDateParser.getCache(field);
        org.apache.commons.lang3.time.FastDateParser.Strategy strategy = cache.get(locale);
        if (strategy == null) {
            strategy = field == (java.util.Calendar.ZONE_OFFSET) ? new org.apache.commons.lang3.time.FastDateParser.TimeZoneStrategy(definingCalendar , locale) : new org.apache.commons.lang3.time.FastDateParser.CaseInsensitiveTextStrategy(field , definingCalendar , locale);
            final org.apache.commons.lang3.time.FastDateParser.Strategy inCache = cache.putIfAbsent(locale, strategy);
            if (inCache != null) {
                return ((_returnReplacementOperatorHotSpot1762.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (inCache));
            } 
        } 
        return ((_returnReplacementOperatorHotSpot1763.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (strategy));
    }

    private static class CopyQuotedStrategy extends org.apache.commons.lang3.time.FastDateParser.Strategy {
        private final java.lang.String formatField;

        CopyQuotedStrategy(final java.lang.String formatField) {
            this.formatField = formatField;
        }

        @java.lang.Override
        boolean isNumber() {
            return ((_returnReplacementOperatorHotSpot1723.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        }

        @java.lang.Override
        boolean parse(org.apache.commons.lang3.time.FastDateParser parser, java.util.Calendar calendar, java.lang.String source, java.text.ParsePosition pos, int maxWidth) {
            for (int idx = 0 ; idx < (formatField.length()) ; ++idx) {
                int sIdx = idx + (pos.getIndex());
                if (sIdx == (source.length())) {
                    pos.setErrorIndex(sIdx);
                    return ((_returnReplacementOperatorHotSpot1724.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
                } 
                if ((formatField.charAt(idx)) != (source.charAt(sIdx))) {
                    pos.setErrorIndex(sIdx);
                    return ((_returnReplacementOperatorHotSpot1725.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
                } 
            }
            pos.setIndex(((formatField.length()) + (pos.getIndex())));
            return ((_returnReplacementOperatorHotSpot1726.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
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
            return ((_returnReplacementOperatorHotSpot1730.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
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
                return ((_returnReplacementOperatorHotSpot1731.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
            } 
            int value = java.lang.Integer.parseInt(source.substring(pos.getIndex(), idx));
            pos.setIndex(idx);
            calendar.set(field, modify(parser, value));
            return ((_returnReplacementOperatorHotSpot1732.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
        }

        int modify(org.apache.commons.lang3.time.FastDateParser parser, final int iValue) {
            return ((_returnReplacementOperatorHotSpot1733.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1733.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1733.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (iValue));
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
                    return ((_returnReplacementOperatorHotSpot1727.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.FastDateParser.ISO8601TimeZoneStrategy.ISO_8601_1_STRATEGY));
                case 2 :
                    return ((_returnReplacementOperatorHotSpot1728.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.FastDateParser.ISO8601TimeZoneStrategy.ISO_8601_2_STRATEGY));
                case 3 :
                    return ((_returnReplacementOperatorHotSpot1729.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.FastDateParser.ISO8601TimeZoneStrategy.ISO_8601_3_STRATEGY));
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

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1723 = metamutator.Selector.of(1723,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot1723");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1724 = metamutator.Selector.of(1724,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot1724");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1725 = metamutator.Selector.of(1725,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot1725");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1726 = metamutator.Selector.of(1726,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot1726");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1727 = metamutator.Selector.of(1727,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot1727");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1728 = metamutator.Selector.of(1728,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot1728");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1729 = metamutator.Selector.of(1729,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot1729");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1730 = metamutator.Selector.of(1730,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot1730");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1731 = metamutator.Selector.of(1731,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot1731");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1732 = metamutator.Selector.of(1732,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot1732");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1733 = metamutator.Selector.of(1733,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).id("_returnReplacementOperatorHotSpot1733");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1734 = metamutator.Selector.of(1734,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot1734");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1735 = metamutator.Selector.of(1735,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot1735");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1736 = metamutator.Selector.of(1736,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot1736");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1737 = metamutator.Selector.of(1737,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot1737");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1738 = metamutator.Selector.of(1738,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).id("_returnReplacementOperatorHotSpot1738");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1739 = metamutator.Selector.of(1739,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).id("_returnReplacementOperatorHotSpot1739");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1740 = metamutator.Selector.of(1740,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot1740");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1741 = metamutator.Selector.of(1741,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot1741");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1742 = metamutator.Selector.of(1742,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot1742");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1743 = metamutator.Selector.of(1743,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot1743");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1744 = metamutator.Selector.of(1744,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot1744");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1745 = metamutator.Selector.of(1745,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperatorHotSpot1745");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1746 = metamutator.Selector.of(1746,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperatorHotSpot1746");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1747 = metamutator.Selector.of(1747,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperatorHotSpot1747");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1748 = metamutator.Selector.of(1748,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperatorHotSpot1748");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1749 = metamutator.Selector.of(1749,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperatorHotSpot1749");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1750 = metamutator.Selector.of(1750,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperatorHotSpot1750");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1751 = metamutator.Selector.of(1751,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperatorHotSpot1751");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1752 = metamutator.Selector.of(1752,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperatorHotSpot1752");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1753 = metamutator.Selector.of(1753,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperatorHotSpot1753");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1754 = metamutator.Selector.of(1754,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperatorHotSpot1754");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1755 = metamutator.Selector.of(1755,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperatorHotSpot1755");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1756 = metamutator.Selector.of(1756,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperatorHotSpot1756");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1757 = metamutator.Selector.of(1757,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperatorHotSpot1757");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1758 = metamutator.Selector.of(1758,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperatorHotSpot1758");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1759 = metamutator.Selector.of(1759,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperatorHotSpot1759");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1760 = metamutator.Selector.of(1760,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperatorHotSpot1760");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1761 = metamutator.Selector.of(1761,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperatorHotSpot1761");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1762 = metamutator.Selector.of(1762,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperatorHotSpot1762");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1763 = metamutator.Selector.of(1763,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperatorHotSpot1763");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1764 = metamutator.Selector.of(1764,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperatorHotSpot1764");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1765 = metamutator.Selector.of(1765,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperatorHotSpot1765");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1766 = metamutator.Selector.of(1766,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperatorHotSpot1766");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1767 = metamutator.Selector.of(1767,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperatorHotSpot1767");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1768 = metamutator.Selector.of(1768,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperatorHotSpot1768");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1769 = metamutator.Selector.of(1769,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperatorHotSpot1769");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1770 = metamutator.Selector.of(1770,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperatorHotSpot1770");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1771 = metamutator.Selector.of(1771,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperatorHotSpot1771");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1772 = metamutator.Selector.of(1772,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperatorHotSpot1772");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1773 = metamutator.Selector.of(1773,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperatorHotSpot1773");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1774 = metamutator.Selector.of(1774,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperatorHotSpot1774");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1775 = metamutator.Selector.of(1775,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperatorHotSpot1775");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1776 = metamutator.Selector.of(1776,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperatorHotSpot1776");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1777 = metamutator.Selector.of(1777,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperatorHotSpot1777");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1778 = metamutator.Selector.of(1778,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperatorHotSpot1778");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1779 = metamutator.Selector.of(1779,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperatorHotSpot1779");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1780 = metamutator.Selector.of(1780,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperatorHotSpot1780");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1781 = metamutator.Selector.of(1781,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperatorHotSpot1781");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1782 = metamutator.Selector.of(1782,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperatorHotSpot1782");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1783 = metamutator.Selector.of(1783,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateParser.class).id("_returnReplacementOperatorHotSpot1783");
}

