package org.apache.commons.lang3.time;


public class DurationFormatUtils {
    public DurationFormatUtils() {
        super();
    }

    public static final java.lang.String ISO_EXTENDED_FORMAT_PATTERN = "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.SSS'S'";

    public static java.lang.String formatDurationHMS(final long durationMillis) {
        return org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(durationMillis, "HH:mm:ss.SSS");
    }

    public static java.lang.String formatDurationISO(final long durationMillis) {
        return org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(durationMillis, ISO_EXTENDED_FORMAT_PATTERN, false);
    }

    public static java.lang.String formatDuration(final long durationMillis, final java.lang.String format) {
        return org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(durationMillis, format, true);
    }

    public static java.lang.String formatDuration(final long durationMillis, final java.lang.String format, final boolean padWithZeros) {
        org.apache.commons.lang3.Validate.inclusiveBetween(0, java.lang.Long.MAX_VALUE, durationMillis, "durationMillis must not be negative");
        final org.apache.commons.lang3.time.DurationFormatUtils.Token[] tokens = org.apache.commons.lang3.time.DurationFormatUtils.lexx(format);
        long days = 0;
        long hours = 0;
        long minutes = 0;
        long seconds = 0;
        long milliseconds = durationMillis;
        if (org.apache.commons.lang3.time.DurationFormatUtils.Token.containsTokenWithValue(tokens, d)) {
            days = ((_arithmeticOperatorHotSpot289.is("PLUS")) ? (milliseconds + (org.apache.commons.lang3.time.DateUtils.MILLIS_PER_DAY)) : (_arithmeticOperatorHotSpot289.is("MINUS")) ? (milliseconds - (org.apache.commons.lang3.time.DateUtils.MILLIS_PER_DAY)) : (_arithmeticOperatorHotSpot289.is("MUL")) ? (milliseconds * (org.apache.commons.lang3.time.DateUtils.MILLIS_PER_DAY)) :  (milliseconds / (org.apache.commons.lang3.time.DateUtils.MILLIS_PER_DAY)));
            milliseconds = milliseconds - ((_arithmeticOperatorHotSpot290.is("PLUS")) ? ((days + (org.apache.commons.lang3.time.DateUtils.MILLIS_PER_DAY))) : (_arithmeticOperatorHotSpot290.is("MINUS")) ? ((days - (org.apache.commons.lang3.time.DateUtils.MILLIS_PER_DAY))) : (_arithmeticOperatorHotSpot290.is("MUL")) ? ((days * (org.apache.commons.lang3.time.DateUtils.MILLIS_PER_DAY))) :  ((days / (org.apache.commons.lang3.time.DateUtils.MILLIS_PER_DAY))));
        } 
        if (org.apache.commons.lang3.time.DurationFormatUtils.Token.containsTokenWithValue(tokens, H)) {
            hours = ((_arithmeticOperatorHotSpot291.is("PLUS")) ? (milliseconds + (org.apache.commons.lang3.time.DateUtils.MILLIS_PER_HOUR)) : (_arithmeticOperatorHotSpot291.is("MINUS")) ? (milliseconds - (org.apache.commons.lang3.time.DateUtils.MILLIS_PER_HOUR)) : (_arithmeticOperatorHotSpot291.is("MUL")) ? (milliseconds * (org.apache.commons.lang3.time.DateUtils.MILLIS_PER_HOUR)) :  (milliseconds / (org.apache.commons.lang3.time.DateUtils.MILLIS_PER_HOUR)));
            milliseconds = milliseconds - ((_arithmeticOperatorHotSpot292.is("PLUS")) ? ((hours + (org.apache.commons.lang3.time.DateUtils.MILLIS_PER_HOUR))) : (_arithmeticOperatorHotSpot292.is("MINUS")) ? ((hours - (org.apache.commons.lang3.time.DateUtils.MILLIS_PER_HOUR))) : (_arithmeticOperatorHotSpot292.is("MUL")) ? ((hours * (org.apache.commons.lang3.time.DateUtils.MILLIS_PER_HOUR))) :  ((hours / (org.apache.commons.lang3.time.DateUtils.MILLIS_PER_HOUR))));
        } 
        if (org.apache.commons.lang3.time.DurationFormatUtils.Token.containsTokenWithValue(tokens, m)) {
            minutes = ((_arithmeticOperatorHotSpot293.is("PLUS")) ? (milliseconds + (org.apache.commons.lang3.time.DateUtils.MILLIS_PER_MINUTE)) : (_arithmeticOperatorHotSpot293.is("MINUS")) ? (milliseconds - (org.apache.commons.lang3.time.DateUtils.MILLIS_PER_MINUTE)) : (_arithmeticOperatorHotSpot293.is("MUL")) ? (milliseconds * (org.apache.commons.lang3.time.DateUtils.MILLIS_PER_MINUTE)) :  (milliseconds / (org.apache.commons.lang3.time.DateUtils.MILLIS_PER_MINUTE)));
            milliseconds = milliseconds - ((_arithmeticOperatorHotSpot294.is("PLUS")) ? ((minutes + (org.apache.commons.lang3.time.DateUtils.MILLIS_PER_MINUTE))) : (_arithmeticOperatorHotSpot294.is("MINUS")) ? ((minutes - (org.apache.commons.lang3.time.DateUtils.MILLIS_PER_MINUTE))) : (_arithmeticOperatorHotSpot294.is("MUL")) ? ((minutes * (org.apache.commons.lang3.time.DateUtils.MILLIS_PER_MINUTE))) :  ((minutes / (org.apache.commons.lang3.time.DateUtils.MILLIS_PER_MINUTE))));
        } 
        if (org.apache.commons.lang3.time.DurationFormatUtils.Token.containsTokenWithValue(tokens, s)) {
            seconds = ((_arithmeticOperatorHotSpot295.is("PLUS")) ? (milliseconds + (org.apache.commons.lang3.time.DateUtils.MILLIS_PER_SECOND)) : (_arithmeticOperatorHotSpot295.is("MINUS")) ? (milliseconds - (org.apache.commons.lang3.time.DateUtils.MILLIS_PER_SECOND)) : (_arithmeticOperatorHotSpot295.is("MUL")) ? (milliseconds * (org.apache.commons.lang3.time.DateUtils.MILLIS_PER_SECOND)) :  (milliseconds / (org.apache.commons.lang3.time.DateUtils.MILLIS_PER_SECOND)));
            milliseconds = milliseconds - ((_arithmeticOperatorHotSpot296.is("PLUS")) ? ((seconds + (org.apache.commons.lang3.time.DateUtils.MILLIS_PER_SECOND))) : (_arithmeticOperatorHotSpot296.is("MINUS")) ? ((seconds - (org.apache.commons.lang3.time.DateUtils.MILLIS_PER_SECOND))) : (_arithmeticOperatorHotSpot296.is("MUL")) ? ((seconds * (org.apache.commons.lang3.time.DateUtils.MILLIS_PER_SECOND))) :  ((seconds / (org.apache.commons.lang3.time.DateUtils.MILLIS_PER_SECOND))));
        } 
        return org.apache.commons.lang3.time.DurationFormatUtils.format(tokens, 0, 0, days, hours, minutes, seconds, milliseconds, padWithZeros);
    }

    public static java.lang.String formatDurationWords(final long durationMillis, final boolean suppressLeadingZeroElements, final boolean suppressTrailingZeroElements) {
        java.lang.String duration = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(durationMillis, "d' days 'H' hours 'm' minutes 's' seconds'");
        if (suppressLeadingZeroElements) {
            duration = " " + duration;
            java.lang.String tmp = org.apache.commons.lang3.StringUtils.replaceOnce(duration, " 0 days", "");
            if ((tmp.length()) != (duration.length())) {
                duration = tmp;
                tmp = org.apache.commons.lang3.StringUtils.replaceOnce(duration, " 0 hours", "");
                if ((tmp.length()) != (duration.length())) {
                    duration = tmp;
                    tmp = org.apache.commons.lang3.StringUtils.replaceOnce(duration, " 0 minutes", "");
                    duration = tmp;
                    if ((tmp.length()) != (duration.length())) {
                        duration = org.apache.commons.lang3.StringUtils.replaceOnce(tmp, " 0 seconds", "");
                    } 
                } 
            } 
            if ((duration.length()) != 0) {
                duration = duration.substring(1);
            } 
        } 
        if (suppressTrailingZeroElements) {
            java.lang.String tmp = org.apache.commons.lang3.StringUtils.replaceOnce(duration, " 0 seconds", "");
            if ((tmp.length()) != (duration.length())) {
                duration = tmp;
                tmp = org.apache.commons.lang3.StringUtils.replaceOnce(duration, " 0 minutes", "");
                if ((tmp.length()) != (duration.length())) {
                    duration = tmp;
                    tmp = org.apache.commons.lang3.StringUtils.replaceOnce(duration, " 0 hours", "");
                    if ((tmp.length()) != (duration.length())) {
                        duration = org.apache.commons.lang3.StringUtils.replaceOnce(tmp, " 0 days", "");
                    } 
                } 
            } 
        } 
        duration = " " + duration;
        duration = org.apache.commons.lang3.StringUtils.replaceOnce(duration, " 1 seconds", " 1 second");
        duration = org.apache.commons.lang3.StringUtils.replaceOnce(duration, " 1 minutes", " 1 minute");
        duration = org.apache.commons.lang3.StringUtils.replaceOnce(duration, " 1 hours", " 1 hour");
        duration = org.apache.commons.lang3.StringUtils.replaceOnce(duration, " 1 days", " 1 day");
        return duration.trim();
    }

    public static java.lang.String formatPeriodISO(final long startMillis, final long endMillis) {
        return org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(startMillis, endMillis, ISO_EXTENDED_FORMAT_PATTERN, false, java.util.TimeZone.getDefault());
    }

    public static java.lang.String formatPeriod(final long startMillis, final long endMillis, final java.lang.String format) {
        return org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(startMillis, endMillis, format, true, java.util.TimeZone.getDefault());
    }

    public static java.lang.String formatPeriod(final long startMillis, final long endMillis, final java.lang.String format, final boolean padWithZeros, final java.util.TimeZone timezone) {
        org.apache.commons.lang3.Validate.isTrue((startMillis <= endMillis), "startMillis must not be greater than endMillis");
        final org.apache.commons.lang3.time.DurationFormatUtils.Token[] tokens = org.apache.commons.lang3.time.DurationFormatUtils.lexx(format);
        final java.util.Calendar start = java.util.Calendar.getInstance(timezone);
        start.setTime(new java.util.Date(startMillis));
        final java.util.Calendar end = java.util.Calendar.getInstance(timezone);
        end.setTime(new java.util.Date(endMillis));
        int milliseconds = ((_arithmeticOperatorHotSpot297.is("PLUS")) ? ((end.get(java.util.Calendar.MILLISECOND)) + (start.get(java.util.Calendar.MILLISECOND))) : (_arithmeticOperatorHotSpot297.is("MINUS")) ? ((end.get(java.util.Calendar.MILLISECOND)) - (start.get(java.util.Calendar.MILLISECOND))) : (_arithmeticOperatorHotSpot297.is("MUL")) ? ((end.get(java.util.Calendar.MILLISECOND)) * (start.get(java.util.Calendar.MILLISECOND))) :  ((end.get(java.util.Calendar.MILLISECOND)) / (start.get(java.util.Calendar.MILLISECOND))));
        int seconds = ((_arithmeticOperatorHotSpot298.is("PLUS")) ? ((end.get(java.util.Calendar.SECOND)) + (start.get(java.util.Calendar.SECOND))) : (_arithmeticOperatorHotSpot298.is("MINUS")) ? ((end.get(java.util.Calendar.SECOND)) - (start.get(java.util.Calendar.SECOND))) : (_arithmeticOperatorHotSpot298.is("MUL")) ? ((end.get(java.util.Calendar.SECOND)) * (start.get(java.util.Calendar.SECOND))) :  ((end.get(java.util.Calendar.SECOND)) / (start.get(java.util.Calendar.SECOND))));
        int minutes = ((_arithmeticOperatorHotSpot299.is("PLUS")) ? ((end.get(java.util.Calendar.MINUTE)) + (start.get(java.util.Calendar.MINUTE))) : (_arithmeticOperatorHotSpot299.is("MINUS")) ? ((end.get(java.util.Calendar.MINUTE)) - (start.get(java.util.Calendar.MINUTE))) : (_arithmeticOperatorHotSpot299.is("MUL")) ? ((end.get(java.util.Calendar.MINUTE)) * (start.get(java.util.Calendar.MINUTE))) :  ((end.get(java.util.Calendar.MINUTE)) / (start.get(java.util.Calendar.MINUTE))));
        int hours = ((_arithmeticOperatorHotSpot300.is("PLUS")) ? ((end.get(java.util.Calendar.HOUR_OF_DAY)) + (start.get(java.util.Calendar.HOUR_OF_DAY))) : (_arithmeticOperatorHotSpot300.is("MINUS")) ? ((end.get(java.util.Calendar.HOUR_OF_DAY)) - (start.get(java.util.Calendar.HOUR_OF_DAY))) : (_arithmeticOperatorHotSpot300.is("MUL")) ? ((end.get(java.util.Calendar.HOUR_OF_DAY)) * (start.get(java.util.Calendar.HOUR_OF_DAY))) :  ((end.get(java.util.Calendar.HOUR_OF_DAY)) / (start.get(java.util.Calendar.HOUR_OF_DAY))));
        int days = ((_arithmeticOperatorHotSpot301.is("PLUS")) ? ((end.get(java.util.Calendar.DAY_OF_MONTH)) + (start.get(java.util.Calendar.DAY_OF_MONTH))) : (_arithmeticOperatorHotSpot301.is("MINUS")) ? ((end.get(java.util.Calendar.DAY_OF_MONTH)) - (start.get(java.util.Calendar.DAY_OF_MONTH))) : (_arithmeticOperatorHotSpot301.is("MUL")) ? ((end.get(java.util.Calendar.DAY_OF_MONTH)) * (start.get(java.util.Calendar.DAY_OF_MONTH))) :  ((end.get(java.util.Calendar.DAY_OF_MONTH)) / (start.get(java.util.Calendar.DAY_OF_MONTH))));
        int months = ((_arithmeticOperatorHotSpot302.is("PLUS")) ? ((end.get(java.util.Calendar.MONTH)) + (start.get(java.util.Calendar.MONTH))) : (_arithmeticOperatorHotSpot302.is("MINUS")) ? ((end.get(java.util.Calendar.MONTH)) - (start.get(java.util.Calendar.MONTH))) : (_arithmeticOperatorHotSpot302.is("MUL")) ? ((end.get(java.util.Calendar.MONTH)) * (start.get(java.util.Calendar.MONTH))) :  ((end.get(java.util.Calendar.MONTH)) / (start.get(java.util.Calendar.MONTH))));
        int years = ((_arithmeticOperatorHotSpot303.is("PLUS")) ? ((end.get(java.util.Calendar.YEAR)) + (start.get(java.util.Calendar.YEAR))) : (_arithmeticOperatorHotSpot303.is("MINUS")) ? ((end.get(java.util.Calendar.YEAR)) - (start.get(java.util.Calendar.YEAR))) : (_arithmeticOperatorHotSpot303.is("MUL")) ? ((end.get(java.util.Calendar.YEAR)) * (start.get(java.util.Calendar.YEAR))) :  ((end.get(java.util.Calendar.YEAR)) / (start.get(java.util.Calendar.YEAR))));
        while (milliseconds < 0) {
            milliseconds += 1000;
            seconds -= 1;
        }
        while (seconds < 0) {
            seconds += 60;
            minutes -= 1;
        }
        while (minutes < 0) {
            minutes += 60;
            hours -= 1;
        }
        while (hours < 0) {
            hours += 24;
            days -= 1;
        }
        if (org.apache.commons.lang3.time.DurationFormatUtils.Token.containsTokenWithValue(tokens, M)) {
            while (days < 0) {
                days += start.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);
                months -= 1;
                start.add(java.util.Calendar.MONTH, 1);
            }
            while (months < 0) {
                months += 12;
                years -= 1;
            }
            if ((!(org.apache.commons.lang3.time.DurationFormatUtils.Token.containsTokenWithValue(tokens, y))) && (years != 0)) {
                while (years != 0) {
                    months += ((_arithmeticOperatorHotSpot304.is("PLUS")) ? (12 + years) : (_arithmeticOperatorHotSpot304.is("MINUS")) ? (12 - years) : (_arithmeticOperatorHotSpot304.is("MUL")) ? (12 * years) :  (12 / years));
                    years = 0;
                }
            } 
        } else {
            if (!(org.apache.commons.lang3.time.DurationFormatUtils.Token.containsTokenWithValue(tokens, y))) {
                int target = end.get(java.util.Calendar.YEAR);
                if (months < 0) {
                    target -= 1;
                } 
                while ((start.get(java.util.Calendar.YEAR)) != target) {
                    days += ((_arithmeticOperatorHotSpot305.is("PLUS")) ? ((start.getActualMaximum(java.util.Calendar.DAY_OF_YEAR)) + (start.get(java.util.Calendar.DAY_OF_YEAR))) : (_arithmeticOperatorHotSpot305.is("MINUS")) ? ((start.getActualMaximum(java.util.Calendar.DAY_OF_YEAR)) - (start.get(java.util.Calendar.DAY_OF_YEAR))) : (_arithmeticOperatorHotSpot305.is("MUL")) ? ((start.getActualMaximum(java.util.Calendar.DAY_OF_YEAR)) * (start.get(java.util.Calendar.DAY_OF_YEAR))) :  ((start.getActualMaximum(java.util.Calendar.DAY_OF_YEAR)) / (start.get(java.util.Calendar.DAY_OF_YEAR))));
                    if (((start instanceof java.util.GregorianCalendar) && ((start.get(java.util.Calendar.MONTH)) == (java.util.Calendar.FEBRUARY))) && ((start.get(java.util.Calendar.DAY_OF_MONTH)) == 29)) {
                        days += 1;
                    } 
                    start.add(java.util.Calendar.YEAR, 1);
                    days += start.get(java.util.Calendar.DAY_OF_YEAR);
                }
                years = 0;
            } 
            while ((start.get(java.util.Calendar.MONTH)) != (end.get(java.util.Calendar.MONTH))) {
                days += start.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);
                start.add(java.util.Calendar.MONTH, 1);
            }
            months = 0;
            while (days < 0) {
                days += start.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);
                months -= 1;
                start.add(java.util.Calendar.MONTH, 1);
            }
        }
        if (!(org.apache.commons.lang3.time.DurationFormatUtils.Token.containsTokenWithValue(tokens, d))) {
            hours += ((_arithmeticOperatorHotSpot306.is("PLUS")) ? (24 + days) : (_arithmeticOperatorHotSpot306.is("MINUS")) ? (24 - days) : (_arithmeticOperatorHotSpot306.is("MUL")) ? (24 * days) :  (24 / days));
            days = 0;
        } 
        if (!(org.apache.commons.lang3.time.DurationFormatUtils.Token.containsTokenWithValue(tokens, H))) {
            minutes += ((_arithmeticOperatorHotSpot307.is("PLUS")) ? (60 + hours) : (_arithmeticOperatorHotSpot307.is("MINUS")) ? (60 - hours) : (_arithmeticOperatorHotSpot307.is("MUL")) ? (60 * hours) :  (60 / hours));
            hours = 0;
        } 
        if (!(org.apache.commons.lang3.time.DurationFormatUtils.Token.containsTokenWithValue(tokens, m))) {
            seconds += ((_arithmeticOperatorHotSpot308.is("PLUS")) ? (60 + minutes) : (_arithmeticOperatorHotSpot308.is("MINUS")) ? (60 - minutes) : (_arithmeticOperatorHotSpot308.is("MUL")) ? (60 * minutes) :  (60 / minutes));
            minutes = 0;
        } 
        if (!(org.apache.commons.lang3.time.DurationFormatUtils.Token.containsTokenWithValue(tokens, s))) {
            milliseconds += ((_arithmeticOperatorHotSpot309.is("PLUS")) ? (1000 + seconds) : (_arithmeticOperatorHotSpot309.is("MINUS")) ? (1000 - seconds) : (_arithmeticOperatorHotSpot309.is("MUL")) ? (1000 * seconds) :  (1000 / seconds));
            seconds = 0;
        } 
        return org.apache.commons.lang3.time.DurationFormatUtils.format(tokens, years, months, days, hours, minutes, seconds, milliseconds, padWithZeros);
    }

    static java.lang.String format(final org.apache.commons.lang3.time.DurationFormatUtils.Token[] tokens, final long years, final long months, final long days, final long hours, final long minutes, final long seconds, final long milliseconds, final boolean padWithZeros) {
        final java.lang.StringBuilder buffer = new java.lang.StringBuilder();
        boolean lastOutputSeconds = false;
        for (final org.apache.commons.lang3.time.DurationFormatUtils.Token token : tokens) {
            final java.lang.Object value = token.getValue();
            final int count = token.getCount();
            if (value instanceof java.lang.StringBuilder) {
                buffer.append(value.toString());
            } else {
                if (value.equals(y)) {
                    buffer.append(org.apache.commons.lang3.time.DurationFormatUtils.paddedValue(years, padWithZeros, count));
                    lastOutputSeconds = false;
                } else if (value.equals(M)) {
                    buffer.append(org.apache.commons.lang3.time.DurationFormatUtils.paddedValue(months, padWithZeros, count));
                    lastOutputSeconds = false;
                } else if (value.equals(d)) {
                    buffer.append(org.apache.commons.lang3.time.DurationFormatUtils.paddedValue(days, padWithZeros, count));
                    lastOutputSeconds = false;
                } else if (value.equals(H)) {
                    buffer.append(org.apache.commons.lang3.time.DurationFormatUtils.paddedValue(hours, padWithZeros, count));
                    lastOutputSeconds = false;
                } else if (value.equals(m)) {
                    buffer.append(org.apache.commons.lang3.time.DurationFormatUtils.paddedValue(minutes, padWithZeros, count));
                    lastOutputSeconds = false;
                } else if (value.equals(s)) {
                    buffer.append(org.apache.commons.lang3.time.DurationFormatUtils.paddedValue(seconds, padWithZeros, count));
                    lastOutputSeconds = true;
                } else if (value.equals(S)) {
                    if (lastOutputSeconds) {
                        final int width = padWithZeros ? java.lang.Math.max(3, count) : 3;
                        buffer.append(org.apache.commons.lang3.time.DurationFormatUtils.paddedValue(milliseconds, true, width));
                    } else {
                        buffer.append(org.apache.commons.lang3.time.DurationFormatUtils.paddedValue(milliseconds, padWithZeros, count));
                    }
                    lastOutputSeconds = false;
                } 
            }
        }
        return buffer.toString();
    }

    private static java.lang.String paddedValue(final long value, final boolean padWithZeros, final int count) {
        final java.lang.String longString = java.lang.Long.toString(value);
        return padWithZeros ? org.apache.commons.lang3.StringUtils.leftPad(longString, count, '0') : longString;
    }

    static final java.lang.Object y = "y";

    static final java.lang.Object M = "M";

    static final java.lang.Object d = "d";

    static final java.lang.Object H = "H";

    static final java.lang.Object m = "m";

    static final java.lang.Object s = "s";

    static final java.lang.Object S = "S";

    static org.apache.commons.lang3.time.DurationFormatUtils.Token[] lexx(final java.lang.String format) {
        final java.util.ArrayList<org.apache.commons.lang3.time.DurationFormatUtils.Token> list = new java.util.ArrayList<org.apache.commons.lang3.time.DurationFormatUtils.Token>(format.length());
        boolean inLiteral = false;
        java.lang.StringBuilder buffer = null;
        org.apache.commons.lang3.time.DurationFormatUtils.Token previous = null;
        for (int i = 0 ; i < (format.length()) ; i++) {
            final char ch = format.charAt(i);
            if (inLiteral && (ch != '\'')) {
                buffer.append(ch);
                continue;
            } 
            java.lang.Object value = null;
            switch (ch) {
                case '\'' :
                    if (inLiteral) {
                        buffer = null;
                        inLiteral = false;
                    } else {
                        buffer = new java.lang.StringBuilder();
                        list.add(new org.apache.commons.lang3.time.DurationFormatUtils.Token(buffer));
                        inLiteral = true;
                    }
                    break;
                case 'y' :
                    value = y;
                    break;
                case 'M' :
                    value = M;
                    break;
                case 'd' :
                    value = d;
                    break;
                case 'H' :
                    value = H;
                    break;
                case 'm' :
                    value = m;
                    break;
                case 's' :
                    value = s;
                    break;
                case 'S' :
                    value = S;
                    break;
                default :
                    if (buffer == null) {
                        buffer = new java.lang.StringBuilder();
                        list.add(new org.apache.commons.lang3.time.DurationFormatUtils.Token(buffer));
                    } 
                    buffer.append(ch);
            }
            if (value != null) {
                if ((previous != null) && (previous.getValue().equals(value))) {
                    previous.increment();
                } else {
                    final org.apache.commons.lang3.time.DurationFormatUtils.Token token = new org.apache.commons.lang3.time.DurationFormatUtils.Token(value);
                    list.add(token);
                    previous = token;
                }
                buffer = null;
            } 
        }
        if (inLiteral) {
            throw new java.lang.IllegalArgumentException(("Unmatched quote in format: " + format));
        } 
        return list.toArray(new org.apache.commons.lang3.time.DurationFormatUtils.Token[list.size()]);
    }

    static class Token {
        static boolean containsTokenWithValue(final org.apache.commons.lang3.time.DurationFormatUtils.Token[] tokens, final java.lang.Object value) {
            for (final org.apache.commons.lang3.time.DurationFormatUtils.Token token : tokens) {
                if ((token.getValue()) == value) {
                    return true;
                } 
            }
            return false;
        }

        private final java.lang.Object value;

        private int count;

        Token(final java.lang.Object value) {
            this.value = value;
            this.count = 1;
        }

        Token(final java.lang.Object value ,final int count) {
            this.value = value;
            this.count = count;
        }

        void increment() {
            (count)++;
        }

        int getCount() {
            return count;
        }

        java.lang.Object getValue() {
            return value;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj2) {
            if (obj2 instanceof org.apache.commons.lang3.time.DurationFormatUtils.Token) {
                final org.apache.commons.lang3.time.DurationFormatUtils.Token tok2 = ((org.apache.commons.lang3.time.DurationFormatUtils.Token)(obj2));
                if ((this.value.getClass()) != (tok2.value.getClass())) {
                    return false;
                } 
                if ((this.count) != (tok2.count)) {
                    return false;
                } 
                if ((this.value) instanceof java.lang.StringBuilder) {
                    return this.value.toString().equals(tok2.value.toString());
                } else if ((this.value) instanceof java.lang.Number) {
                    return this.value.equals(tok2.value);
                } else {
                    return (this.value) == (tok2.value);
                }
            } 
            return false;
        }

        @java.lang.Override
        public int hashCode() {
            return this.value.hashCode();
        }

        @java.lang.Override
        public java.lang.String toString() {
            return org.apache.commons.lang3.StringUtils.repeat(this.value.toString(), this.count);
        }
    }

    private static final metamutator.Selector _arithmeticOperatorHotSpot289 = metamutator.Selector.of(289,new String[]{"DIV","PLUS","MINUS","MUL"}).in(org.apache.commons.lang3.time.DurationFormatUtils.class).id("_arithmeticOperatorHotSpot289");

    private static final metamutator.Selector _arithmeticOperatorHotSpot290 = metamutator.Selector.of(290,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.time.DurationFormatUtils.class).id("_arithmeticOperatorHotSpot290");

    private static final metamutator.Selector _arithmeticOperatorHotSpot291 = metamutator.Selector.of(291,new String[]{"DIV","PLUS","MINUS","MUL"}).in(org.apache.commons.lang3.time.DurationFormatUtils.class).id("_arithmeticOperatorHotSpot291");

    private static final metamutator.Selector _arithmeticOperatorHotSpot292 = metamutator.Selector.of(292,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.time.DurationFormatUtils.class).id("_arithmeticOperatorHotSpot292");

    private static final metamutator.Selector _arithmeticOperatorHotSpot293 = metamutator.Selector.of(293,new String[]{"DIV","PLUS","MINUS","MUL"}).in(org.apache.commons.lang3.time.DurationFormatUtils.class).id("_arithmeticOperatorHotSpot293");

    private static final metamutator.Selector _arithmeticOperatorHotSpot294 = metamutator.Selector.of(294,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.time.DurationFormatUtils.class).id("_arithmeticOperatorHotSpot294");

    private static final metamutator.Selector _arithmeticOperatorHotSpot295 = metamutator.Selector.of(295,new String[]{"DIV","PLUS","MINUS","MUL"}).in(org.apache.commons.lang3.time.DurationFormatUtils.class).id("_arithmeticOperatorHotSpot295");

    private static final metamutator.Selector _arithmeticOperatorHotSpot296 = metamutator.Selector.of(296,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.time.DurationFormatUtils.class).id("_arithmeticOperatorHotSpot296");

    private static final metamutator.Selector _arithmeticOperatorHotSpot297 = metamutator.Selector.of(297,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.time.DurationFormatUtils.class).id("_arithmeticOperatorHotSpot297");

    private static final metamutator.Selector _arithmeticOperatorHotSpot298 = metamutator.Selector.of(298,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.time.DurationFormatUtils.class).id("_arithmeticOperatorHotSpot298");

    private static final metamutator.Selector _arithmeticOperatorHotSpot299 = metamutator.Selector.of(299,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.time.DurationFormatUtils.class).id("_arithmeticOperatorHotSpot299");

    private static final metamutator.Selector _arithmeticOperatorHotSpot300 = metamutator.Selector.of(300,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.time.DurationFormatUtils.class).id("_arithmeticOperatorHotSpot300");

    private static final metamutator.Selector _arithmeticOperatorHotSpot301 = metamutator.Selector.of(301,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.time.DurationFormatUtils.class).id("_arithmeticOperatorHotSpot301");

    private static final metamutator.Selector _arithmeticOperatorHotSpot302 = metamutator.Selector.of(302,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.time.DurationFormatUtils.class).id("_arithmeticOperatorHotSpot302");

    private static final metamutator.Selector _arithmeticOperatorHotSpot303 = metamutator.Selector.of(303,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.time.DurationFormatUtils.class).id("_arithmeticOperatorHotSpot303");

    private static final metamutator.Selector _arithmeticOperatorHotSpot304 = metamutator.Selector.of(304,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.time.DurationFormatUtils.class).id("_arithmeticOperatorHotSpot304");

    private static final metamutator.Selector _arithmeticOperatorHotSpot305 = metamutator.Selector.of(305,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.time.DurationFormatUtils.class).id("_arithmeticOperatorHotSpot305");

    private static final metamutator.Selector _arithmeticOperatorHotSpot306 = metamutator.Selector.of(306,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.time.DurationFormatUtils.class).id("_arithmeticOperatorHotSpot306");

    private static final metamutator.Selector _arithmeticOperatorHotSpot307 = metamutator.Selector.of(307,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.time.DurationFormatUtils.class).id("_arithmeticOperatorHotSpot307");

    private static final metamutator.Selector _arithmeticOperatorHotSpot308 = metamutator.Selector.of(308,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.time.DurationFormatUtils.class).id("_arithmeticOperatorHotSpot308");

    private static final metamutator.Selector _arithmeticOperatorHotSpot309 = metamutator.Selector.of(309,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.time.DurationFormatUtils.class).id("_arithmeticOperatorHotSpot309");
}

