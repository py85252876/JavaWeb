package com.goldhome.util;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Instant;
import org.joda.time.Months;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * 时间处理共同类
 * Created by yanruilin on 2017/5/13.
 */
public final class TimeUtils {
    /**
     * 秒数.
     */
    public static final int SECOND = 1000;
    /**
     * 中午12点.
     */
    public static final int MIDDLE_HOUR = 12;
    /**
     * 每月15号.
     */
    public static final int MIDDLE_MONTH = 15;
    /**
     * 1天中的秒数.
     */
    public static final int DAY_SECOND = 86400;

    /**
     * 构造方法.
     * @throws Exception 抛出异常
     */
    private TimeUtils() throws Exception {
    }

    /**
     * 设置系统时区.
     *
     * @param zone 时区
     */
    public static void setSystemTimeZone(final String zone) {
        //设置系统时区
        DateTimeZone.setDefault(DateTimeZone.forID(zone));
    }

    /**
     * 判断该UTC时间是否是夏令时.
     *
     * @param utc UTC时间
     * @return 是否是夏令时
     */
    public static boolean isDaylightTime(final long utc) {
        DateTimeZone zone = DateTimeZone.getDefault();
        boolean isStandardOffset = zone.isStandardOffset(utc * SECOND);
        return !isStandardOffset;
    }

    /**
     * 日期转换为UTC时间.
     *
     * @param date    日期
     * @param pattern 日期格式
     * @return utc时间
     */
    public static long dateToUtc(final String date, final String pattern) {
        long utc;

        DateTimeFormatter format = DateTimeFormat.forPattern(pattern);
        DateTime dateTime = DateTime.parse(date, format);

        utc = dateTime.getMillis() / SECOND;
        return utc;
    }

    /**
     * UTC时间转换为日期.
     *
     * @param utc     UTC 时间
     * @param pattern 日期格式
     * @return 日期
     */
    public static String utcToDate(final long utc, final String pattern) {
        DateTime dateTime = new DateTime(utc * SECOND);
        return dateTime.toString(pattern);
    }


    /**
     * 获取当前时间.
     *
     * @param pattern 日期格式
     * @return 当前日期
     */
    public static String getCurrentDate(final String pattern) {
        return Instant.now().toDateTime().toString(pattern);
    }

    /**
     * 获取当前时区偏移量.
     *
     * @param utc UTC时间
     * @return 时区偏移量
     */
    public static int getTimeZoneOffset(final long utc) {
        DateTimeZone zone = DateTimeZone.getDefault();

        int offset = zone.getOffset(utc * SECOND);
        return offset / SECOND;
    }

    /**
     * 如果是夏令时时间，添加上(DST).
     *
     * @param dateStr 日期
     * @param pattern 格式化
     * @return 返回修改后的日期
     */
    public static String dateAddDst(final String dateStr,
                                    final String pattern) {
        long utc = dateToUtc(dateStr, pattern);
        String date = dateStr;
        if (isDaylightTime(utc)) {
            date += "(DST)";
        }

        return date;
    }

    /**
     * 获取天表后缀.
     * 当前时间距离19700101有多少天
     *
     * @param utc UTC时间
     * @return days 返回天数
     */
    public static int getDaySuff(final long utc) {
        DateTime dateTime = new DateTime(utc * SECOND);

        int hour = dateTime.getHourOfDay();
        int diff = MIDDLE_HOUR - hour;

        if (diff > 0) {
            dateTime = dateTime.plusHours(diff);
        } else {
            dateTime = dateTime.minusHours(Math.abs(diff));
        }

        Long days = new Long(DAY_SECOND * SECOND);
        String result = String.valueOf(dateTime.getMillis() / days);

        return Integer.parseInt(result);
    }

    /**
     * 获取月表后缀.
     * 当前时间距离19700101有多少个月
     *
     * @param utc UTC时间
     * @return months 返回月份
     */
    public static int getMonthSuff(final long utc) {

        DateTime startTime = new DateTime(0L);
        DateTime endTime = new DateTime(utc * SECOND);
        int day = MIDDLE_MONTH - endTime.getDayOfMonth();

        if (day > 0) {
            endTime = endTime.plusDays(day);
        } else {
            endTime = endTime.minusDays(Math.abs(day));
        }

        return Months.monthsBetween(startTime, endTime).getMonths();
    }

}
