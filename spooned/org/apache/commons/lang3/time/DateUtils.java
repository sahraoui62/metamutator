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
        return ((_returnReplacementOperatorHotSpot1602.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.DateUtils.isSameDay(cal1, cal2)));
    }

    public static boolean isSameDay(final java.util.Calendar cal1, final java.util.Calendar cal2) {
        if ((cal1 == null) || (cal2 == null)) {
            throw new java.lang.IllegalArgumentException("The date must not be null");
        } 
        return ((_returnReplacementOperatorHotSpot1601.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((((cal1.get(java.util.Calendar.ERA)) == (cal2.get(java.util.Calendar.ERA))) && ((cal1.get(java.util.Calendar.YEAR)) == (cal2.get(java.util.Calendar.YEAR)))) && ((cal1.get(java.util.Calendar.DAY_OF_YEAR)) == (cal2.get(java.util.Calendar.DAY_OF_YEAR)))));
    }

    public static boolean isSameInstant(final java.util.Date date1, final java.util.Date date2) {
        if ((date1 == null) || (date2 == null)) {
            throw new java.lang.IllegalArgumentException("The date must not be null");
        } 
        return ((_returnReplacementOperatorHotSpot1604.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((date1.getTime()) == (date2.getTime())));
    }

    public static boolean isSameInstant(final java.util.Calendar cal1, final java.util.Calendar cal2) {
        if ((cal1 == null) || (cal2 == null)) {
            throw new java.lang.IllegalArgumentException("The date must not be null");
        } 
        return ((_returnReplacementOperatorHotSpot1603.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((cal1.getTime().getTime()) == (cal2.getTime().getTime())));
    }

    public static boolean isSameLocalTime(final java.util.Calendar cal1, final java.util.Calendar cal2) {
        if ((cal1 == null) || (cal2 == null)) {
            throw new java.lang.IllegalArgumentException("The date must not be null");
        } 
        return ((_returnReplacementOperatorHotSpot1605.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((((((((cal1.get(java.util.Calendar.MILLISECOND)) == (cal2.get(java.util.Calendar.MILLISECOND))) && ((cal1.get(java.util.Calendar.SECOND)) == (cal2.get(java.util.Calendar.SECOND)))) && ((cal1.get(java.util.Calendar.MINUTE)) == (cal2.get(java.util.Calendar.MINUTE)))) && ((cal1.get(java.util.Calendar.HOUR_OF_DAY)) == (cal2.get(java.util.Calendar.HOUR_OF_DAY)))) && ((cal1.get(java.util.Calendar.DAY_OF_YEAR)) == (cal2.get(java.util.Calendar.DAY_OF_YEAR)))) && ((cal1.get(java.util.Calendar.YEAR)) == (cal2.get(java.util.Calendar.YEAR)))) && ((cal1.get(java.util.Calendar.ERA)) == (cal2.get(java.util.Calendar.ERA)))) && ((cal1.getClass()) == (cal2.getClass()))));
    }

    public static java.util.Date parseDate(final java.lang.String str, final java.lang.String... parsePatterns) throws java.text.ParseException {
        return ((_returnReplacementOperatorHotSpot1626.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.DateUtils.parseDate(str, null, parsePatterns)));
    }

    public static java.util.Date parseDate(final java.lang.String str, final java.util.Locale locale, final java.lang.String... parsePatterns) throws java.text.ParseException {
        return ((_returnReplacementOperatorHotSpot1627.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.DateUtils.parseDateWithLeniency(str, locale, parsePatterns, true)));
    }

    public static java.util.Date parseDateStrictly(final java.lang.String str, final java.lang.String... parsePatterns) throws java.text.ParseException {
        return ((_returnReplacementOperatorHotSpot1628.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.DateUtils.parseDateStrictly(str, null, parsePatterns)));
    }

    public static java.util.Date parseDateStrictly(final java.lang.String str, final java.util.Locale locale, final java.lang.String... parsePatterns) throws java.text.ParseException {
        return ((_returnReplacementOperatorHotSpot1629.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.DateUtils.parseDateWithLeniency(str, null, parsePatterns, false)));
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
                    return ((_returnReplacementOperatorHotSpot1630.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (calendar.getTime()));
                } 
            } catch (java.lang.IllegalArgumentException ignore) {
            }
            pos.setIndex(0);
        }
        throw new java.text.ParseException(("Unable to parse the date: " + str) , -1);
    }

    public static java.util.Date addYears(final java.util.Date date, final int amount) {
        return ((_returnReplacementOperatorHotSpot1622.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.DateUtils.add(date, java.util.Calendar.YEAR, amount)));
    }

    public static java.util.Date addMonths(final java.util.Date date, final int amount) {
        return ((_returnReplacementOperatorHotSpot1619.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.DateUtils.add(date, java.util.Calendar.MONTH, amount)));
    }

    public static java.util.Date addWeeks(final java.util.Date date, final int amount) {
        return ((_returnReplacementOperatorHotSpot1621.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.DateUtils.add(date, java.util.Calendar.WEEK_OF_YEAR, amount)));
    }

    public static java.util.Date addDays(final java.util.Date date, final int amount) {
        return ((_returnReplacementOperatorHotSpot1615.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.DateUtils.add(date, java.util.Calendar.DAY_OF_MONTH, amount)));
    }

    public static java.util.Date addHours(final java.util.Date date, final int amount) {
        return ((_returnReplacementOperatorHotSpot1616.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.DateUtils.add(date, java.util.Calendar.HOUR_OF_DAY, amount)));
    }

    public static java.util.Date addMinutes(final java.util.Date date, final int amount) {
        return ((_returnReplacementOperatorHotSpot1618.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.DateUtils.add(date, java.util.Calendar.MINUTE, amount)));
    }

    public static java.util.Date addSeconds(final java.util.Date date, final int amount) {
        return ((_returnReplacementOperatorHotSpot1620.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.DateUtils.add(date, java.util.Calendar.SECOND, amount)));
    }

    public static java.util.Date addMilliseconds(final java.util.Date date, final int amount) {
        return ((_returnReplacementOperatorHotSpot1617.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.DateUtils.add(date, java.util.Calendar.MILLISECOND, amount)));
    }

    private static java.util.Date add(final java.util.Date date, final int calendarField, final int amount) {
        if (date == null) {
            throw new java.lang.IllegalArgumentException("The date must not be null");
        } 
        final java.util.Calendar c = java.util.Calendar.getInstance();
        c.setTime(date);
        c.add(calendarField, amount);
        return ((_returnReplacementOperatorHotSpot1614.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (c.getTime()));
    }

    public static java.util.Date setYears(final java.util.Date date, final int amount) {
        return ((_returnReplacementOperatorHotSpot1641.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.DateUtils.set(date, java.util.Calendar.YEAR, amount)));
    }

    public static java.util.Date setMonths(final java.util.Date date, final int amount) {
        return ((_returnReplacementOperatorHotSpot1639.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.DateUtils.set(date, java.util.Calendar.MONTH, amount)));
    }

    public static java.util.Date setDays(final java.util.Date date, final int amount) {
        return ((_returnReplacementOperatorHotSpot1635.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.DateUtils.set(date, java.util.Calendar.DAY_OF_MONTH, amount)));
    }

    public static java.util.Date setHours(final java.util.Date date, final int amount) {
        return ((_returnReplacementOperatorHotSpot1636.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.DateUtils.set(date, java.util.Calendar.HOUR_OF_DAY, amount)));
    }

    public static java.util.Date setMinutes(final java.util.Date date, final int amount) {
        return ((_returnReplacementOperatorHotSpot1638.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.DateUtils.set(date, java.util.Calendar.MINUTE, amount)));
    }

    public static java.util.Date setSeconds(final java.util.Date date, final int amount) {
        return ((_returnReplacementOperatorHotSpot1640.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.DateUtils.set(date, java.util.Calendar.SECOND, amount)));
    }

    public static java.util.Date setMilliseconds(final java.util.Date date, final int amount) {
        return ((_returnReplacementOperatorHotSpot1637.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.DateUtils.set(date, java.util.Calendar.MILLISECOND, amount)));
    }

    private static java.util.Date set(final java.util.Date date, final int calendarField, final int amount) {
        if (date == null) {
            throw new java.lang.IllegalArgumentException("The date must not be null");
        } 
        final java.util.Calendar c = java.util.Calendar.getInstance();
        c.setLenient(false);
        c.setTime(date);
        c.set(calendarField, amount);
        return ((_returnReplacementOperatorHotSpot1634.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (c.getTime()));
    }

    public static java.util.Calendar toCalendar(final java.util.Date date) {
        final java.util.Calendar c = java.util.Calendar.getInstance();
        c.setTime(date);
        return ((_returnReplacementOperatorHotSpot1612.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (c));
    }

    public static java.util.Date round(final java.util.Date date, final int field) {
        if (date == null) {
            throw new java.lang.IllegalArgumentException("The date must not be null");
        } 
        final java.util.Calendar gval = java.util.Calendar.getInstance();
        gval.setTime(date);
        org.apache.commons.lang3.time.DateUtils.modify(gval, field, ModifyType.ROUND);
        return ((_returnReplacementOperatorHotSpot1633.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (gval.getTime()));
    }

    public static java.util.Calendar round(final java.util.Calendar date, final int field) {
        if (date == null) {
            throw new java.lang.IllegalArgumentException("The date must not be null");
        } 
        final java.util.Calendar rounded = ((java.util.Calendar)(date.clone()));
        org.apache.commons.lang3.time.DateUtils.modify(rounded, field, ModifyType.ROUND);
        return ((_returnReplacementOperatorHotSpot1611.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (rounded));
    }

    public static java.util.Date round(final java.lang.Object date, final int field) {
        if (date == null) {
            throw new java.lang.IllegalArgumentException("The date must not be null");
        } 
        if (date instanceof java.util.Date) {
            return ((_returnReplacementOperatorHotSpot1631.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.DateUtils.round(((java.util.Date)(date)), field)));
        } else if (date instanceof java.util.Calendar) {
            return ((_returnReplacementOperatorHotSpot1632.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.DateUtils.round(((java.util.Calendar)(date)), field).getTime()));
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
        return ((_returnReplacementOperatorHotSpot1644.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (gval.getTime()));
    }

    public static java.util.Calendar truncate(final java.util.Calendar date, final int field) {
        if (date == null) {
            throw new java.lang.IllegalArgumentException("The date must not be null");
        } 
        final java.util.Calendar truncated = ((java.util.Calendar)(date.clone()));
        org.apache.commons.lang3.time.DateUtils.modify(truncated, field, ModifyType.TRUNCATE);
        return ((_returnReplacementOperatorHotSpot1613.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (truncated));
    }

    public static java.util.Date truncate(final java.lang.Object date, final int field) {
        if (date == null) {
            throw new java.lang.IllegalArgumentException("The date must not be null");
        } 
        if (date instanceof java.util.Date) {
            return ((_returnReplacementOperatorHotSpot1642.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.DateUtils.truncate(((java.util.Date)(date)), field)));
        } else if (date instanceof java.util.Calendar) {
            return ((_returnReplacementOperatorHotSpot1643.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.DateUtils.truncate(((java.util.Calendar)(date)), field).getTime()));
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
        return ((_returnReplacementOperatorHotSpot1625.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (gval.getTime()));
    }

    public static java.util.Calendar ceiling(final java.util.Calendar date, final int field) {
        if (date == null) {
            throw new java.lang.IllegalArgumentException("The date must not be null");
        } 
        final java.util.Calendar ceiled = ((java.util.Calendar)(date.clone()));
        org.apache.commons.lang3.time.DateUtils.modify(ceiled, field, ModifyType.CEILING);
        return ((_returnReplacementOperatorHotSpot1610.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (ceiled));
    }

    public static java.util.Date ceiling(final java.lang.Object date, final int field) {
        if (date == null) {
            throw new java.lang.IllegalArgumentException("The date must not be null");
        } 
        if (date instanceof java.util.Date) {
            return ((_returnReplacementOperatorHotSpot1623.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)(date)), field)));
        } else if (date instanceof java.util.Calendar) {
            return ((_returnReplacementOperatorHotSpot1624.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Calendar)(date)), field).getTime()));
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
            time = time - millisecs;
        } 
        if (field == (java.util.Calendar.SECOND)) {
            done = true;
        } 
        final int seconds = val.get(java.util.Calendar.SECOND);
        if ((!done) && (((ModifyType.TRUNCATE) == modType) || (seconds < 30))) {
            time = time - (seconds * 1000L);
        } 
        if (field == (java.util.Calendar.MINUTE)) {
            done = true;
        } 
        final int minutes = val.get(java.util.Calendar.MINUTE);
        if ((!done) && (((ModifyType.TRUNCATE) == modType) || (minutes < 30))) {
            time = time - (minutes * 60000L);
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
                        offset = (val.get(java.util.Calendar.DATE)) - 1;
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
                offset = (val.get(aField[0])) - min;
                roundUp = offset > ((max - min) / 2);
            } 
            if (offset != 0) {
                val.set(aField[0], ((val.get(aField[0])) - offset));
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
        return ((_returnReplacementOperatorHotSpot1648.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.DateUtils.iterator(gval, rangeStyle)));
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
                        endCutoff = startCutoff - 1;
                        break;
                    case RANGE_WEEK_CENTER :
                        startCutoff = (focus.get(java.util.Calendar.DAY_OF_WEEK)) - 3;
                        endCutoff = (focus.get(java.util.Calendar.DAY_OF_WEEK)) + 3;
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
        return ((_returnReplacementOperatorHotSpot1647.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.time.DateUtils.DateIterator(start , end)));
    }

    public static java.util.Iterator<?> iterator(final java.lang.Object focus, final int rangeStyle) {
        if (focus == null) {
            throw new java.lang.IllegalArgumentException("The date must not be null");
        } 
        if (focus instanceof java.util.Date) {
            return ((_returnReplacementOperatorHotSpot1645.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.DateUtils.iterator(((java.util.Date)(focus)), rangeStyle)));
        } else if (focus instanceof java.util.Calendar) {
            return ((_returnReplacementOperatorHotSpot1646.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.DateUtils.iterator(((java.util.Calendar)(focus)), rangeStyle)));
        } else {
            throw new java.lang.ClassCastException(("Could not iterate based on " + focus));
        }
    }

    public static long getFragmentInMilliseconds(final java.util.Date date, final int fragment) {
        return ((_returnReplacementOperatorHotSpot1656.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.DateUtils.getFragment(date, fragment, java.util.concurrent.TimeUnit.MILLISECONDS)));
    }

    public static long getFragmentInSeconds(final java.util.Date date, final int fragment) {
        return ((_returnReplacementOperatorHotSpot1660.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.DateUtils.getFragment(date, fragment, java.util.concurrent.TimeUnit.SECONDS)));
    }

    public static long getFragmentInMinutes(final java.util.Date date, final int fragment) {
        return ((_returnReplacementOperatorHotSpot1658.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.DateUtils.getFragment(date, fragment, java.util.concurrent.TimeUnit.MINUTES)));
    }

    public static long getFragmentInHours(final java.util.Date date, final int fragment) {
        return ((_returnReplacementOperatorHotSpot1654.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.DateUtils.getFragment(date, fragment, java.util.concurrent.TimeUnit.HOURS)));
    }

    public static long getFragmentInDays(final java.util.Date date, final int fragment) {
        return ((_returnReplacementOperatorHotSpot1652.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.DateUtils.getFragment(date, fragment, java.util.concurrent.TimeUnit.DAYS)));
    }

    public static long getFragmentInMilliseconds(final java.util.Calendar calendar, final int fragment) {
        return ((_returnReplacementOperatorHotSpot1655.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.DateUtils.getFragment(calendar, fragment, java.util.concurrent.TimeUnit.MILLISECONDS)));
    }

    public static long getFragmentInSeconds(final java.util.Calendar calendar, final int fragment) {
        return ((_returnReplacementOperatorHotSpot1659.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.DateUtils.getFragment(calendar, fragment, java.util.concurrent.TimeUnit.SECONDS)));
    }

    public static long getFragmentInMinutes(final java.util.Calendar calendar, final int fragment) {
        return ((_returnReplacementOperatorHotSpot1657.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.DateUtils.getFragment(calendar, fragment, java.util.concurrent.TimeUnit.MINUTES)));
    }

    public static long getFragmentInHours(final java.util.Calendar calendar, final int fragment) {
        return ((_returnReplacementOperatorHotSpot1653.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.DateUtils.getFragment(calendar, fragment, java.util.concurrent.TimeUnit.HOURS)));
    }

    public static long getFragmentInDays(final java.util.Calendar calendar, final int fragment) {
        return ((_returnReplacementOperatorHotSpot1651.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.DateUtils.getFragment(calendar, fragment, java.util.concurrent.TimeUnit.DAYS)));
    }

    private static long getFragment(final java.util.Date date, final int fragment, final java.util.concurrent.TimeUnit unit) {
        if (date == null) {
            throw new java.lang.IllegalArgumentException("The date must not be null");
        } 
        final java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(date);
        return ((_returnReplacementOperatorHotSpot1650.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.DateUtils.getFragment(calendar, fragment, unit)));
    }

    private static long getFragment(final java.util.Calendar calendar, final int fragment, final java.util.concurrent.TimeUnit unit) {
        if (calendar == null) {
            throw new java.lang.IllegalArgumentException("The date must not be null");
        } 
        long result = 0;
        final int offset = unit == (java.util.concurrent.TimeUnit.DAYS) ? 0 : 1;
        switch (fragment) {
            case java.util.Calendar.YEAR :
                result += unit.convert(((calendar.get(java.util.Calendar.DAY_OF_YEAR)) - offset), java.util.concurrent.TimeUnit.DAYS);
                break;
            case java.util.Calendar.MONTH :
                result += unit.convert(((calendar.get(java.util.Calendar.DAY_OF_MONTH)) - offset), java.util.concurrent.TimeUnit.DAYS);
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
        return ((_returnReplacementOperatorHotSpot1649.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (result));
    }

    public static boolean truncatedEquals(final java.util.Calendar cal1, final java.util.Calendar cal2, final int field) {
        return ((_returnReplacementOperatorHotSpot1606.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((org.apache.commons.lang3.time.DateUtils.truncatedCompareTo(cal1, cal2, field)) == 0));
    }

    public static boolean truncatedEquals(final java.util.Date date1, final java.util.Date date2, final int field) {
        return ((_returnReplacementOperatorHotSpot1607.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((org.apache.commons.lang3.time.DateUtils.truncatedCompareTo(date1, date2, field)) == 0));
    }

    public static int truncatedCompareTo(final java.util.Calendar cal1, final java.util.Calendar cal2, final int field) {
        final java.util.Calendar truncatedCal1 = org.apache.commons.lang3.time.DateUtils.truncate(cal1, field);
        final java.util.Calendar truncatedCal2 = org.apache.commons.lang3.time.DateUtils.truncate(cal2, field);
        return ((_returnReplacementOperatorHotSpot1608.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1608.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1608.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (truncatedCal1.compareTo(truncatedCal2)));
    }

    public static int truncatedCompareTo(final java.util.Date date1, final java.util.Date date2, final int field) {
        final java.util.Date truncatedDate1 = org.apache.commons.lang3.time.DateUtils.truncate(date1, field);
        final java.util.Date truncatedDate2 = org.apache.commons.lang3.time.DateUtils.truncate(date2, field);
        return ((_returnReplacementOperatorHotSpot1609.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1609.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1609.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (truncatedDate1.compareTo(truncatedDate2)));
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
            return ((_returnReplacementOperatorHotSpot1599.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (spot.before(endFinal)));
        }

        @java.lang.Override
        public java.util.Calendar next() {
            if (spot.equals(endFinal)) {
                throw new java.util.NoSuchElementException();
            } 
            spot.add(java.util.Calendar.DATE, 1);
            return ((_returnReplacementOperatorHotSpot1600.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((java.util.Calendar)(spot.clone()))));
        }

        @java.lang.Override
        public void remove() {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1599 = metamutator.Selector.of(1599,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot1599");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1600 = metamutator.Selector.of(1600,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot1600");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1601 = metamutator.Selector.of(1601,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1601");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1602 = metamutator.Selector.of(1602,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1602");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1603 = metamutator.Selector.of(1603,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1603");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1604 = metamutator.Selector.of(1604,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1604");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1605 = metamutator.Selector.of(1605,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1605");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1606 = metamutator.Selector.of(1606,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1606");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1607 = metamutator.Selector.of(1607,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1607");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1608 = metamutator.Selector.of(1608,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1608");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1609 = metamutator.Selector.of(1609,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1609");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1610 = metamutator.Selector.of(1610,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1610");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1611 = metamutator.Selector.of(1611,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1611");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1612 = metamutator.Selector.of(1612,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1612");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1613 = metamutator.Selector.of(1613,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1613");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1614 = metamutator.Selector.of(1614,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1614");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1615 = metamutator.Selector.of(1615,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1615");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1616 = metamutator.Selector.of(1616,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1616");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1617 = metamutator.Selector.of(1617,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1617");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1618 = metamutator.Selector.of(1618,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1618");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1619 = metamutator.Selector.of(1619,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1619");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1620 = metamutator.Selector.of(1620,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1620");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1621 = metamutator.Selector.of(1621,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1621");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1622 = metamutator.Selector.of(1622,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1622");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1623 = metamutator.Selector.of(1623,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1623");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1624 = metamutator.Selector.of(1624,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1624");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1625 = metamutator.Selector.of(1625,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1625");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1626 = metamutator.Selector.of(1626,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1626");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1627 = metamutator.Selector.of(1627,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1627");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1628 = metamutator.Selector.of(1628,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1628");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1629 = metamutator.Selector.of(1629,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1629");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1630 = metamutator.Selector.of(1630,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1630");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1631 = metamutator.Selector.of(1631,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1631");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1632 = metamutator.Selector.of(1632,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1632");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1633 = metamutator.Selector.of(1633,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1633");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1634 = metamutator.Selector.of(1634,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1634");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1635 = metamutator.Selector.of(1635,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1635");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1636 = metamutator.Selector.of(1636,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1636");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1637 = metamutator.Selector.of(1637,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1637");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1638 = metamutator.Selector.of(1638,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1638");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1639 = metamutator.Selector.of(1639,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1639");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1640 = metamutator.Selector.of(1640,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1640");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1641 = metamutator.Selector.of(1641,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1641");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1642 = metamutator.Selector.of(1642,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1642");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1643 = metamutator.Selector.of(1643,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1643");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1644 = metamutator.Selector.of(1644,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1644");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1645 = metamutator.Selector.of(1645,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1645");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1646 = metamutator.Selector.of(1646,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1646");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1647 = metamutator.Selector.of(1647,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1647");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1648 = metamutator.Selector.of(1648,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1648");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1649 = metamutator.Selector.of(1649,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1649");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1650 = metamutator.Selector.of(1650,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1650");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1651 = metamutator.Selector.of(1651,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1651");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1652 = metamutator.Selector.of(1652,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1652");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1653 = metamutator.Selector.of(1653,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1653");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1654 = metamutator.Selector.of(1654,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1654");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1655 = metamutator.Selector.of(1655,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1655");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1656 = metamutator.Selector.of(1656,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1656");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1657 = metamutator.Selector.of(1657,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1657");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1658 = metamutator.Selector.of(1658,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1658");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1659 = metamutator.Selector.of(1659,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1659");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1660 = metamutator.Selector.of(1660,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.DateUtils.class).id("_returnReplacementOperatorHotSpot1660");
}

