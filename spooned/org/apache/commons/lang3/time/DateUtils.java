package org.apache.commons.lang3.time;


public class DateUtils {
    public static final long MILLIS_PER_SECOND = 1000;

    public static final long MILLIS_PER_MINUTE = 60 * (MILLIS_PER_SECOND);

    public static final long MILLIS_PER_HOUR = 60 * (MILLIS_PER_MINUTE);

    public static final long MILLIS_PER_DAY = 24 * (MILLIS_PER_HOUR);

    public static final int SEMI_MONTH = 1001;

    private static final int[][] fields = new int[][]{ new int[]{ java.util.Calendar.MILLISECOND } , new int[]{ java.util.Calendar.SECOND } , new int[]{ java.util.Calendar.MINUTE } , new int[]{ java.util.Calendar.HOUR_OF_DAY , java.util.Calendar.HOUR } , new int[]{ java.util.Calendar.DATE , java.util.Calendar.DAY_OF_MONTH , java.util.Calendar.AM_PM } , new int[]{ java.util.Calendar.MONTH , SEMI_MONTH } , new int[]{ java.util.Calendar.YEAR } , new int[]{ java.util.Calendar.ERA } };

    public static final int RANGE_WEEK_SUNDAY = 1;

    public static final int RANGE_WEEK_MONDAY = 2;

    public static final int RANGE_WEEK_RELATIVE = 3;

    public static final int RANGE_WEEK_CENTER = 4;

    public static final int RANGE_MONTH_SUNDAY = 5;

    public static final int RANGE_MONTH_MONDAY = 6;

    private enum ModifyType {
TRUNCATE, ROUND, CEILING;    }

    public DateUtils() {
        super();
    }

    public static boolean isSameDay(final java.util.Date date1, final java.util.Date date2) {
        if ((date1 == null) || (date2 == null)) {
            throw new java.lang.IllegalArgumentException("The date must not be null");
        } 
        final java.util.Calendar cal1 = java.util.Calendar.getInstance();
        cal1.setTime(date1);
        final java.util.Calendar cal2 = java.util.Calendar.getInstance();
        cal2.setTime(date2);
        return org.apache.commons.lang3.time.DateUtils.isSameDay(cal1, cal2);
    }

    public static boolean isSameDay(final java.util.Calendar cal1, final java.util.Calendar cal2) {
        if ((cal1 == null) || (cal2 == null)) {
            throw new java.lang.IllegalArgumentException("The date must not be null");
        } 
        return (((cal1.get(java.util.Calendar.ERA)) == (cal2.get(java.util.Calendar.ERA))) && ((cal1.get(java.util.Calendar.YEAR)) == (cal2.get(java.util.Calendar.YEAR)))) && ((cal1.get(java.util.Calendar.DAY_OF_YEAR)) == (cal2.get(java.util.Calendar.DAY_OF_YEAR)));
    }

    public static boolean isSameInstant(final java.util.Date date1, final java.util.Date date2) {
        if ((date1 == null) || (date2 == null)) {
            throw new java.lang.IllegalArgumentException("The date must not be null");
        } 
        return (date1.getTime()) == (date2.getTime());
    }

    public static boolean isSameInstant(final java.util.Calendar cal1, final java.util.Calendar cal2) {
        if ((cal1 == null) || (cal2 == null)) {
            throw new java.lang.IllegalArgumentException("The date must not be null");
        } 
        return (cal1.getTime().getTime()) == (cal2.getTime().getTime());
    }

    public static boolean isSameLocalTime(final java.util.Calendar cal1, final java.util.Calendar cal2) {
        if ((cal1 == null) || (cal2 == null)) {
            throw new java.lang.IllegalArgumentException("The date must not be null");
        } 
        return ((((((((cal1.get(java.util.Calendar.MILLISECOND)) == (cal2.get(java.util.Calendar.MILLISECOND))) && ((cal1.get(java.util.Calendar.SECOND)) == (cal2.get(java.util.Calendar.SECOND)))) && ((cal1.get(java.util.Calendar.MINUTE)) == (cal2.get(java.util.Calendar.MINUTE)))) && ((cal1.get(java.util.Calendar.HOUR_OF_DAY)) == (cal2.get(java.util.Calendar.HOUR_OF_DAY)))) && ((cal1.get(java.util.Calendar.DAY_OF_YEAR)) == (cal2.get(java.util.Calendar.DAY_OF_YEAR)))) && ((cal1.get(java.util.Calendar.YEAR)) == (cal2.get(java.util.Calendar.YEAR)))) && ((cal1.get(java.util.Calendar.ERA)) == (cal2.get(java.util.Calendar.ERA)))) && ((cal1.getClass()) == (cal2.getClass()));
    }

    public static java.util.Date parseDate(final java.lang.String str, final java.lang.String... parsePatterns) throws java.text.ParseException {
        return org.apache.commons.lang3.time.DateUtils.parseDate(str, null, parsePatterns);
    }

    public static java.util.Date parseDate(final java.lang.String str, final java.util.Locale locale, final java.lang.String... parsePatterns) throws java.text.ParseException {
        return org.apache.commons.lang3.time.DateUtils.parseDateWithLeniency(str, locale, parsePatterns, true);
    }

    public static java.util.Date parseDateStrictly(final java.lang.String str, final java.lang.String... parsePatterns) throws java.text.ParseException {
        return org.apache.commons.lang3.time.DateUtils.parseDateStrictly(str, null, parsePatterns);
    }

    public static java.util.Date parseDateStrictly(final java.lang.String str, final java.util.Locale locale, final java.lang.String... parsePatterns) throws java.text.ParseException {
        return org.apache.commons.lang3.time.DateUtils.parseDateWithLeniency(str, null, parsePatterns, false);
    }

    private static java.util.Date parseDateWithLeniency(final java.lang.String str, final java.util.Locale locale, final java.lang.String[] parsePatterns, final boolean lenient) throws java.text.ParseException {
        if ((str == null) || (parsePatterns == null)) {
            throw new java.lang.IllegalArgumentException("Date and Patterns must not be null");
        } 
        final java.util.TimeZone tz = java.util.TimeZone.getDefault();
        final java.util.Locale lcl = locale == null ? java.util.Locale.getDefault() : locale;
        final java.text.ParsePosition pos = new java.text.ParsePosition(0);
        final java.util.Calendar calendar = java.util.Calendar.getInstance(tz, lcl);
        calendar.setLenient(lenient);
        for (final java.lang.String parsePattern : parsePatterns) {
            org.apache.commons.lang3.time.FastDateParser fdp = new org.apache.commons.lang3.time.FastDateParser(parsePattern , tz , lcl);
            calendar.clear();
            try {
                if ((fdp.parse(str, pos, calendar)) && ((pos.getIndex()) == (str.length()))) {
                    return calendar.getTime();
                } 
            } catch (java.lang.IllegalArgumentException ignore) {
            }
            pos.setIndex(0);
        }
        throw new java.text.ParseException(("Unable to parse the date: " + str) , -1);
    }

    public static java.util.Date addYears(final java.util.Date date, final int amount) {
        return org.apache.commons.lang3.time.DateUtils.add(date, java.util.Calendar.YEAR, amount);
    }

    public static java.util.Date addMonths(final java.util.Date date, final int amount) {
        return org.apache.commons.lang3.time.DateUtils.add(date, java.util.Calendar.MONTH, amount);
    }

    public static java.util.Date addWeeks(final java.util.Date date, final int amount) {
        return org.apache.commons.lang3.time.DateUtils.add(date, java.util.Calendar.WEEK_OF_YEAR, amount);
    }

    public static java.util.Date addDays(final java.util.Date date, final int amount) {
        return org.apache.commons.lang3.time.DateUtils.add(date, java.util.Calendar.DAY_OF_MONTH, amount);
    }

    public static java.util.Date addHours(final java.util.Date date, final int amount) {
        return org.apache.commons.lang3.time.DateUtils.add(date, java.util.Calendar.HOUR_OF_DAY, amount);
    }

    public static java.util.Date addMinutes(final java.util.Date date, final int amount) {
        return org.apache.commons.lang3.time.DateUtils.add(date, java.util.Calendar.MINUTE, amount);
    }

    public static java.util.Date addSeconds(final java.util.Date date, final int amount) {
        return org.apache.commons.lang3.time.DateUtils.add(date, java.util.Calendar.SECOND, amount);
    }

    public static java.util.Date addMilliseconds(final java.util.Date date, final int amount) {
        return org.apache.commons.lang3.time.DateUtils.add(date, java.util.Calendar.MILLISECOND, amount);
    }

    private static java.util.Date add(final java.util.Date date, final int calendarField, final int amount) {
        if (date == null) {
            throw new java.lang.IllegalArgumentException("The date must not be null");
        } 
        final java.util.Calendar c = java.util.Calendar.getInstance();
        c.setTime(date);
        c.add(calendarField, amount);
        return c.getTime();
    }

    public static java.util.Date setYears(final java.util.Date date, final int amount) {
        return org.apache.commons.lang3.time.DateUtils.set(date, java.util.Calendar.YEAR, amount);
    }

    public static java.util.Date setMonths(final java.util.Date date, final int amount) {
        return org.apache.commons.lang3.time.DateUtils.set(date, java.util.Calendar.MONTH, amount);
    }

    public static java.util.Date setDays(final java.util.Date date, final int amount) {
        return org.apache.commons.lang3.time.DateUtils.set(date, java.util.Calendar.DAY_OF_MONTH, amount);
    }

    public static java.util.Date setHours(final java.util.Date date, final int amount) {
        return org.apache.commons.lang3.time.DateUtils.set(date, java.util.Calendar.HOUR_OF_DAY, amount);
    }

    public static java.util.Date setMinutes(final java.util.Date date, final int amount) {
        return org.apache.commons.lang3.time.DateUtils.set(date, java.util.Calendar.MINUTE, amount);
    }

    public static java.util.Date setSeconds(final java.util.Date date, final int amount) {
        return org.apache.commons.lang3.time.DateUtils.set(date, java.util.Calendar.SECOND, amount);
    }

    public static java.util.Date setMilliseconds(final java.util.Date date, final int amount) {
        return org.apache.commons.lang3.time.DateUtils.set(date, java.util.Calendar.MILLISECOND, amount);
    }

    private static java.util.Date set(final java.util.Date date, final int calendarField, final int amount) {
        if (date == null) {
            throw new java.lang.IllegalArgumentException("The date must not be null");
        } 
        final java.util.Calendar c = java.util.Calendar.getInstance();
        c.setLenient(false);
        c.setTime(date);
        c.set(calendarField, amount);
        return c.getTime();
    }

    public static java.util.Calendar toCalendar(final java.util.Date date) {
        final java.util.Calendar c = java.util.Calendar.getInstance();
        c.setTime(date);
        return c;
    }

    public static java.util.Date round(final java.util.Date date, final int field) {
        if (date == null) {
            throw new java.lang.IllegalArgumentException("The date must not be null");
        } 
        final java.util.Calendar gval = java.util.Calendar.getInstance();
        gval.setTime(date);
        org.apache.commons.lang3.time.DateUtils.modify(gval, field, ModifyType.ROUND);
        return gval.getTime();
    }

    public static java.util.Calendar round(final java.util.Calendar date, final int field) {
        if (date == null) {
            throw new java.lang.IllegalArgumentException("The date must not be null");
        } 
        final java.util.Calendar rounded = ((java.util.Calendar)(date.clone()));
        org.apache.commons.lang3.time.DateUtils.modify(rounded, field, ModifyType.ROUND);
        return rounded;
    }

    public static java.util.Date round(final java.lang.Object date, final int field) {
        if (date == null) {
            throw new java.lang.IllegalArgumentException("The date must not be null");
        } 
        if (date instanceof java.util.Date) {
            return org.apache.commons.lang3.time.DateUtils.round(((java.util.Date)(date)), field);
        } else if (date instanceof java.util.Calendar) {
            return org.apache.commons.lang3.time.DateUtils.round(((java.util.Calendar)(date)), field).getTime();
        } else {
            throw new java.lang.ClassCastException(("Could not round " + date));
        }
    }

    public static java.util.Date truncate(final java.util.Date date, final int field) {
        if (date == null) {
            throw new java.lang.IllegalArgumentException("The date must not be null");
        } 
        final java.util.Calendar gval = java.util.Calendar.getInstance();
        gval.setTime(date);
        org.apache.commons.lang3.time.DateUtils.modify(gval, field, ModifyType.TRUNCATE);
        return gval.getTime();
    }

    public static java.util.Calendar truncate(final java.util.Calendar date, final int field) {
        if (date == null) {
            throw new java.lang.IllegalArgumentException("The date must not be null");
        } 
        final java.util.Calendar truncated = ((java.util.Calendar)(date.clone()));
        org.apache.commons.lang3.time.DateUtils.modify(truncated, field, ModifyType.TRUNCATE);
        return truncated;
    }

    public static java.util.Date truncate(final java.lang.Object date, final int field) {
        if (date == null) {
            throw new java.lang.IllegalArgumentException("The date must not be null");
        } 
        if (date instanceof java.util.Date) {
            return org.apache.commons.lang3.time.DateUtils.truncate(((java.util.Date)(date)), field);
        } else if (date instanceof java.util.Calendar) {
            return org.apache.commons.lang3.time.DateUtils.truncate(((java.util.Calendar)(date)), field).getTime();
        } else {
            throw new java.lang.ClassCastException(("Could not truncate " + date));
        }
    }

    public static java.util.Date ceiling(final java.util.Date date, final int field) {
        if (date == null) {
            throw new java.lang.IllegalArgumentException("The date must not be null");
        } 
        final java.util.Calendar gval = java.util.Calendar.getInstance();
        gval.setTime(date);
        org.apache.commons.lang3.time.DateUtils.modify(gval, field, ModifyType.CEILING);
        return gval.getTime();
    }

    public static java.util.Calendar ceiling(final java.util.Calendar date, final int field) {
        if (date == null) {
            throw new java.lang.IllegalArgumentException("The date must not be null");
        } 
        final java.util.Calendar ceiled = ((java.util.Calendar)(date.clone()));
        org.apache.commons.lang3.time.DateUtils.modify(ceiled, field, ModifyType.CEILING);
        return ceiled;
    }

    public static java.util.Date ceiling(final java.lang.Object date, final int field) {
        if (date == null) {
            throw new java.lang.IllegalArgumentException("The date must not be null");
        } 
        if (date instanceof java.util.Date) {
            return org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)(date)), field);
        } else if (date instanceof java.util.Calendar) {
            return org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Calendar)(date)), field).getTime();
        } else {
            throw new java.lang.ClassCastException(("Could not find ceiling of for type: " + (date.getClass())));
        }
    }

    private static void modify(final java.util.Calendar val, final int field, final ModifyType modType) {
        if ((val.get(java.util.Calendar.YEAR)) > 280000000) {
            throw new java.lang.ArithmeticException("Calendar value too large for accurate calculations");
        } 
        if (field == (java.util.Calendar.MILLISECOND)) {
            return ;
        } 
        final java.util.Date date = val.getTime();
        long time = date.getTime();
        boolean done = false;
        final int millisecs = val.get(java.util.Calendar.MILLISECOND);
        if (((ModifyType.TRUNCATE) == modType) || (millisecs < 500)) {
            time = ((_arithmeticOperatorHotSpot282.is("PLUS")) ? (time + millisecs) : (_arithmeticOperatorHotSpot282.is("MINUS")) ? (time - millisecs) : (_arithmeticOperatorHotSpot282.is("MUL")) ? (time * millisecs) :  (time / millisecs));
        } 
        if (field == (java.util.Calendar.SECOND)) {
            done = true;
        } 
        final int seconds = val.get(java.util.Calendar.SECOND);
        if ((!done) && (((ModifyType.TRUNCATE) == modType) || (seconds < 30))) {
            time = time - ((_arithmeticOperatorHotSpot283.is("PLUS")) ? ((seconds + 1000L)) : (_arithmeticOperatorHotSpot283.is("MINUS")) ? ((seconds - 1000L)) : (_arithmeticOperatorHotSpot283.is("MUL")) ? ((seconds * 1000L)) :  ((seconds / 1000L)));
        } 
        if (field == (java.util.Calendar.MINUTE)) {
            done = true;
        } 
        final int minutes = val.get(java.util.Calendar.MINUTE);
        if ((!done) && (((ModifyType.TRUNCATE) == modType) || (minutes < 30))) {
            time = time - ((_arithmeticOperatorHotSpot284.is("PLUS")) ? ((minutes + 60000L)) : (_arithmeticOperatorHotSpot284.is("MINUS")) ? ((minutes - 60000L)) : (_arithmeticOperatorHotSpot284.is("MUL")) ? ((minutes * 60000L)) :  ((minutes / 60000L)));
        } 
        if ((date.getTime()) != time) {
            date.setTime(time);
            val.setTime(date);
        } 
        boolean roundUp = false;
        for (final int[] aField : fields) {
            for (final int element : aField) {
                if (element == field) {
                    if ((modType == (ModifyType.CEILING)) || ((modType == (ModifyType.ROUND)) && roundUp)) {
                        if (field == (SEMI_MONTH)) {
                            if ((val.get(java.util.Calendar.DATE)) == 1) {
                                val.add(java.util.Calendar.DATE, 15);
                            } else {
                                val.add(java.util.Calendar.DATE, -15);
                                val.add(java.util.Calendar.MONTH, 1);
                            }
                        } else if (field == (java.util.Calendar.AM_PM)) {
                            if ((val.get(java.util.Calendar.HOUR_OF_DAY)) == 0) {
                                val.add(java.util.Calendar.HOUR_OF_DAY, 12);
                            } else {
                                val.add(java.util.Calendar.HOUR_OF_DAY, -12);
                                val.add(java.util.Calendar.DATE, 1);
                            }
                        } else {
                            val.add(aField[0], 1);
                        }
                    } 
                    return ;
                } 
            }
            int offset = 0;
            boolean offsetSet = false;
            switch (field) {
                case SEMI_MONTH :
                    if ((aField[0]) == (java.util.Calendar.DATE)) {
                        offset = ((_arithmeticOperatorHotSpot285.is("PLUS")) ? ((val.get(java.util.Calendar.DATE)) + 1) : (_arithmeticOperatorHotSpot285.is("MINUS")) ? ((val.get(java.util.Calendar.DATE)) - 1) : (_arithmeticOperatorHotSpot285.is("MUL")) ? ((val.get(java.util.Calendar.DATE)) * 1) :  ((val.get(java.util.Calendar.DATE)) / 1));
                        if (offset >= 15) {
                            offset -= 15;
                        } 
                        roundUp = offset > 7;
                        offsetSet = true;
                    } 
                    break;
                case java.util.Calendar.AM_PM :
                    if ((aField[0]) == (java.util.Calendar.HOUR_OF_DAY)) {
                        offset = val.get(java.util.Calendar.HOUR_OF_DAY);
                        if (offset >= 12) {
                            offset -= 12;
                        } 
                        roundUp = offset >= 6;
                        offsetSet = true;
                    } 
                    break;
                default :
                    break;
            }
            if (!offsetSet) {
                final int min = val.getActualMinimum(aField[0]);
                final int max = val.getActualMaximum(aField[0]);
                offset = ((_arithmeticOperatorHotSpot286.is("PLUS")) ? ((val.get(aField[0])) + min) : (_arithmeticOperatorHotSpot286.is("MINUS")) ? ((val.get(aField[0])) - min) : (_arithmeticOperatorHotSpot286.is("MUL")) ? ((val.get(aField[0])) * min) :  ((val.get(aField[0])) / min));
                roundUp = offset > (((_arithmeticOperatorHotSpot287.is("PLUS")) ? ((max + min)) : (_arithmeticOperatorHotSpot287.is("MINUS")) ? ((max - min)) : (_arithmeticOperatorHotSpot287.is("MUL")) ? ((max * min)) :  ((max / min))) / 2);
            } 
            if (offset != 0) {
                val.set(aField[0], ((_arithmeticOperatorHotSpot288.is("PLUS")) ? (((val.get(aField[0])) + offset)) : (_arithmeticOperatorHotSpot288.is("MINUS")) ? (((val.get(aField[0])) - offset)) : (_arithmeticOperatorHotSpot288.is("MUL")) ? (((val.get(aField[0])) * offset)) :  (((val.get(aField[0])) / offset))));
            } 
        }
        throw new java.lang.IllegalArgumentException((("The field " + field) + " is not supported"));
    }

    public static java.util.Iterator<java.util.Calendar> iterator(final java.util.Date focus, final int rangeStyle) {
        if (focus == null) {
            throw new java.lang.IllegalArgumentException("The date must not be null");
        } 
        final java.util.Calendar gval = java.util.Calendar.getInstance();
        gval.setTime(focus);
        return org.apache.commons.lang3.time.DateUtils.iterator(gval, rangeStyle);
    }

    public static java.util.Iterator<java.util.Calendar> iterator(final java.util.Calendar focus, final int rangeStyle) {
        if (focus == null) {
            throw new java.lang.IllegalArgumentException("The date must not be null");
        } 
        java.util.Calendar start = null;
        java.util.Calendar end = null;
        int startCutoff = java.util.Calendar.SUNDAY;
        int endCutoff = java.util.Calendar.SATURDAY;
        switch (rangeStyle) {
            case RANGE_MONTH_SUNDAY :
            case RANGE_MONTH_MONDAY :
                start = org.apache.commons.lang3.time.DateUtils.truncate(focus, java.util.Calendar.MONTH);
                end = ((java.util.Calendar)(start.clone()));
                end.add(java.util.Calendar.MONTH, 1);
                end.add(java.util.Calendar.DATE, -1);
                if (rangeStyle == (RANGE_MONTH_MONDAY)) {
                    startCutoff = java.util.Calendar.MONDAY;
                    endCutoff = java.util.Calendar.SUNDAY;
                } 
                break;
            case RANGE_WEEK_SUNDAY :
            case RANGE_WEEK_MONDAY :
            case RANGE_WEEK_RELATIVE :
            case RANGE_WEEK_CENTER :
                start = org.apache.commons.lang3.time.DateUtils.truncate(focus, java.util.Calendar.DATE);
                end = org.apache.commons.lang3.time.DateUtils.truncate(focus, java.util.Calendar.DATE);
                switch (rangeStyle) {
                    case RANGE_WEEK_SUNDAY :
                        break;
                    case RANGE_WEEK_MONDAY :
                        startCutoff = java.util.Calendar.MONDAY;
                        endCutoff = java.util.Calendar.SUNDAY;
                        break;
                    case RANGE_WEEK_RELATIVE :
                        startCutoff = focus.get(java.util.Calendar.DAY_OF_WEEK);
                        endCutoff = ((_arithmeticOperatorHotSpot277.is("PLUS")) ? (startCutoff + 1) : (_arithmeticOperatorHotSpot277.is("MINUS")) ? (startCutoff - 1) : (_arithmeticOperatorHotSpot277.is("MUL")) ? (startCutoff * 1) :  (startCutoff / 1));
                        break;
                    case RANGE_WEEK_CENTER :
                        startCutoff = ((_arithmeticOperatorHotSpot278.is("PLUS")) ? ((focus.get(java.util.Calendar.DAY_OF_WEEK)) + 3) : (_arithmeticOperatorHotSpot278.is("MINUS")) ? ((focus.get(java.util.Calendar.DAY_OF_WEEK)) - 3) : (_arithmeticOperatorHotSpot278.is("MUL")) ? ((focus.get(java.util.Calendar.DAY_OF_WEEK)) * 3) :  ((focus.get(java.util.Calendar.DAY_OF_WEEK)) / 3));
                        endCutoff = ((_arithmeticOperatorHotSpot279.is("PLUS")) ? ((focus.get(java.util.Calendar.DAY_OF_WEEK)) + 3) : (_arithmeticOperatorHotSpot279.is("MINUS")) ? ((focus.get(java.util.Calendar.DAY_OF_WEEK)) - 3) : (_arithmeticOperatorHotSpot279.is("MUL")) ? ((focus.get(java.util.Calendar.DAY_OF_WEEK)) * 3) :  ((focus.get(java.util.Calendar.DAY_OF_WEEK)) / 3));
                        break;
                    default :
                        break;
                }
                break;
            default :
                throw new java.lang.IllegalArgumentException((("The range style " + rangeStyle) + " is not valid."));
        }
        if (startCutoff < (java.util.Calendar.SUNDAY)) {
            startCutoff += 7;
        } 
        if (startCutoff > (java.util.Calendar.SATURDAY)) {
            startCutoff -= 7;
        } 
        if (endCutoff < (java.util.Calendar.SUNDAY)) {
            endCutoff += 7;
        } 
        if (endCutoff > (java.util.Calendar.SATURDAY)) {
            endCutoff -= 7;
        } 
        while ((start.get(java.util.Calendar.DAY_OF_WEEK)) != startCutoff) {
            start.add(java.util.Calendar.DATE, -1);
        }
        while ((end.get(java.util.Calendar.DAY_OF_WEEK)) != endCutoff) {
            end.add(java.util.Calendar.DATE, 1);
        }
        return new org.apache.commons.lang3.time.DateUtils.DateIterator(start , end);
    }

    public static java.util.Iterator<?> iterator(final java.lang.Object focus, final int rangeStyle) {
        if (focus == null) {
            throw new java.lang.IllegalArgumentException("The date must not be null");
        } 
        if (focus instanceof java.util.Date) {
            return org.apache.commons.lang3.time.DateUtils.iterator(((java.util.Date)(focus)), rangeStyle);
        } else if (focus instanceof java.util.Calendar) {
            return org.apache.commons.lang3.time.DateUtils.iterator(((java.util.Calendar)(focus)), rangeStyle);
        } else {
            throw new java.lang.ClassCastException(("Could not iterate based on " + focus));
        }
    }

    public static long getFragmentInMilliseconds(final java.util.Date date, final int fragment) {
        return org.apache.commons.lang3.time.DateUtils.getFragment(date, fragment, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    public static long getFragmentInSeconds(final java.util.Date date, final int fragment) {
        return org.apache.commons.lang3.time.DateUtils.getFragment(date, fragment, java.util.concurrent.TimeUnit.SECONDS);
    }

    public static long getFragmentInMinutes(final java.util.Date date, final int fragment) {
        return org.apache.commons.lang3.time.DateUtils.getFragment(date, fragment, java.util.concurrent.TimeUnit.MINUTES);
    }

    public static long getFragmentInHours(final java.util.Date date, final int fragment) {
        return org.apache.commons.lang3.time.DateUtils.getFragment(date, fragment, java.util.concurrent.TimeUnit.HOURS);
    }

    public static long getFragmentInDays(final java.util.Date date, final int fragment) {
        return org.apache.commons.lang3.time.DateUtils.getFragment(date, fragment, java.util.concurrent.TimeUnit.DAYS);
    }

    public static long getFragmentInMilliseconds(final java.util.Calendar calendar, final int fragment) {
        return org.apache.commons.lang3.time.DateUtils.getFragment(calendar, fragment, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    public static long getFragmentInSeconds(final java.util.Calendar calendar, final int fragment) {
        return org.apache.commons.lang3.time.DateUtils.getFragment(calendar, fragment, java.util.concurrent.TimeUnit.SECONDS);
    }

    public static long getFragmentInMinutes(final java.util.Calendar calendar, final int fragment) {
        return org.apache.commons.lang3.time.DateUtils.getFragment(calendar, fragment, java.util.concurrent.TimeUnit.MINUTES);
    }

    public static long getFragmentInHours(final java.util.Calendar calendar, final int fragment) {
        return org.apache.commons.lang3.time.DateUtils.getFragment(calendar, fragment, java.util.concurrent.TimeUnit.HOURS);
    }

    public static long getFragmentInDays(final java.util.Calendar calendar, final int fragment) {
        return org.apache.commons.lang3.time.DateUtils.getFragment(calendar, fragment, java.util.concurrent.TimeUnit.DAYS);
    }

    private static long getFragment(final java.util.Date date, final int fragment, final java.util.concurrent.TimeUnit unit) {
        if (date == null) {
            throw new java.lang.IllegalArgumentException("The date must not be null");
        } 
        final java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(date);
        return org.apache.commons.lang3.time.DateUtils.getFragment(calendar, fragment, unit);
    }

    private static long getFragment(final java.util.Calendar calendar, final int fragment, final java.util.concurrent.TimeUnit unit) {
        if (calendar == null) {
            throw new java.lang.IllegalArgumentException("The date must not be null");
        } 
        long result = 0;
        final int offset = unit == (java.util.concurrent.TimeUnit.DAYS) ? 0 : 1;
        switch (fragment) {
            case java.util.Calendar.YEAR :
                result += unit.convert(((_arithmeticOperatorHotSpot280.is("PLUS")) ? (((calendar.get(java.util.Calendar.DAY_OF_YEAR)) + offset)) : (_arithmeticOperatorHotSpot280.is("MINUS")) ? (((calendar.get(java.util.Calendar.DAY_OF_YEAR)) - offset)) : (_arithmeticOperatorHotSpot280.is("MUL")) ? (((calendar.get(java.util.Calendar.DAY_OF_YEAR)) * offset)) :  (((calendar.get(java.util.Calendar.DAY_OF_YEAR)) / offset))), java.util.concurrent.TimeUnit.DAYS);
                break;
            case java.util.Calendar.MONTH :
                result += unit.convert(((_arithmeticOperatorHotSpot281.is("PLUS")) ? (((calendar.get(java.util.Calendar.DAY_OF_MONTH)) + offset)) : (_arithmeticOperatorHotSpot281.is("MINUS")) ? (((calendar.get(java.util.Calendar.DAY_OF_MONTH)) - offset)) : (_arithmeticOperatorHotSpot281.is("MUL")) ? (((calendar.get(java.util.Calendar.DAY_OF_MONTH)) * offset)) :  (((calendar.get(java.util.Calendar.DAY_OF_MONTH)) / offset))), java.util.concurrent.TimeUnit.DAYS);
                break;
            default :
                break;
        }
        switch (fragment) {
            case java.util.Calendar.YEAR :
            case java.util.Calendar.MONTH :
            case java.util.Calendar.DAY_OF_YEAR :
            case java.util.Calendar.DATE :
                result += unit.convert(calendar.get(java.util.Calendar.HOUR_OF_DAY), java.util.concurrent.TimeUnit.HOURS);
            case java.util.Calendar.HOUR_OF_DAY :
                result += unit.convert(calendar.get(java.util.Calendar.MINUTE), java.util.concurrent.TimeUnit.MINUTES);
            case java.util.Calendar.MINUTE :
                result += unit.convert(calendar.get(java.util.Calendar.SECOND), java.util.concurrent.TimeUnit.SECONDS);
            case java.util.Calendar.SECOND :
                result += unit.convert(calendar.get(java.util.Calendar.MILLISECOND), java.util.concurrent.TimeUnit.MILLISECONDS);
                break;
            case java.util.Calendar.MILLISECOND :
                break;
            default :
                throw new java.lang.IllegalArgumentException((("The fragment " + fragment) + " is not supported"));
        }
        return result;
    }

    public static boolean truncatedEquals(final java.util.Calendar cal1, final java.util.Calendar cal2, final int field) {
        return (org.apache.commons.lang3.time.DateUtils.truncatedCompareTo(cal1, cal2, field)) == 0;
    }

    public static boolean truncatedEquals(final java.util.Date date1, final java.util.Date date2, final int field) {
        return (org.apache.commons.lang3.time.DateUtils.truncatedCompareTo(date1, date2, field)) == 0;
    }

    public static int truncatedCompareTo(final java.util.Calendar cal1, final java.util.Calendar cal2, final int field) {
        final java.util.Calendar truncatedCal1 = org.apache.commons.lang3.time.DateUtils.truncate(cal1, field);
        final java.util.Calendar truncatedCal2 = org.apache.commons.lang3.time.DateUtils.truncate(cal2, field);
        return truncatedCal1.compareTo(truncatedCal2);
    }

    public static int truncatedCompareTo(final java.util.Date date1, final java.util.Date date2, final int field) {
        final java.util.Date truncatedDate1 = org.apache.commons.lang3.time.DateUtils.truncate(date1, field);
        final java.util.Date truncatedDate2 = org.apache.commons.lang3.time.DateUtils.truncate(date2, field);
        return truncatedDate1.compareTo(truncatedDate2);
    }

    static class DateIterator implements java.util.Iterator<java.util.Calendar> {
        private final java.util.Calendar endFinal;

        private final java.util.Calendar spot;

        DateIterator(final java.util.Calendar startFinal ,final java.util.Calendar endFinal) {
            super();
            this.endFinal = endFinal;
            spot = startFinal;
            spot.add(java.util.Calendar.DATE, -1);
        }

        @java.lang.Override
        public boolean hasNext() {
            return spot.before(endFinal);
        }

        @java.lang.Override
        public java.util.Calendar next() {
            if (spot.equals(endFinal)) {
                throw new java.util.NoSuchElementException();
            } 
            spot.add(java.util.Calendar.DATE, 1);
            return ((java.util.Calendar)(spot.clone()));
        }

        @java.lang.Override
        public void remove() {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    private static final metamutator.Selector _arithmeticOperatorHotSpot277 = metamutator.Selector.of(277,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.time.DateUtils.class).id("_arithmeticOperatorHotSpot277");

    private static final metamutator.Selector _arithmeticOperatorHotSpot278 = metamutator.Selector.of(278,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.time.DateUtils.class).id("_arithmeticOperatorHotSpot278");

    private static final metamutator.Selector _arithmeticOperatorHotSpot279 = metamutator.Selector.of(279,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.time.DateUtils.class).id("_arithmeticOperatorHotSpot279");

    private static final metamutator.Selector _arithmeticOperatorHotSpot280 = metamutator.Selector.of(280,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.time.DateUtils.class).id("_arithmeticOperatorHotSpot280");

    private static final metamutator.Selector _arithmeticOperatorHotSpot281 = metamutator.Selector.of(281,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.time.DateUtils.class).id("_arithmeticOperatorHotSpot281");

    private static final metamutator.Selector _arithmeticOperatorHotSpot282 = metamutator.Selector.of(282,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.time.DateUtils.class).id("_arithmeticOperatorHotSpot282");

    private static final metamutator.Selector _arithmeticOperatorHotSpot283 = metamutator.Selector.of(283,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.time.DateUtils.class).id("_arithmeticOperatorHotSpot283");

    private static final metamutator.Selector _arithmeticOperatorHotSpot284 = metamutator.Selector.of(284,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.time.DateUtils.class).id("_arithmeticOperatorHotSpot284");

    private static final metamutator.Selector _arithmeticOperatorHotSpot285 = metamutator.Selector.of(285,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.time.DateUtils.class).id("_arithmeticOperatorHotSpot285");

    private static final metamutator.Selector _arithmeticOperatorHotSpot286 = metamutator.Selector.of(286,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.time.DateUtils.class).id("_arithmeticOperatorHotSpot286");

    private static final metamutator.Selector _arithmeticOperatorHotSpot287 = metamutator.Selector.of(287,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.time.DateUtils.class).id("_arithmeticOperatorHotSpot287");

    private static final metamutator.Selector _arithmeticOperatorHotSpot288 = metamutator.Selector.of(288,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.time.DateUtils.class).id("_arithmeticOperatorHotSpot288");
}

