package com.beike.otc.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {

//private static final Log logger = LogFactory.getLog(DateUtils.class);


	public static final String YYYYMMDD = "yyyy-MM-dd";


	public static final String YYYYMMDD_ZH = "yyyy年MM月dd日";


	public static final int FIRST_DAY_OF_WEEK = Calendar.MONDAY; // 中国周一是一周的第一天

	/**
	 * 默认时间格式：yyyy-MM-dd HH:mm:ss
	 */
	public static final String DEFAULT_DATETIME_PATTERN = "yyyy-MM-dd HH:mm:ss";


	/**
	 * 生成14位日期
	 * 
	 * @return
	 */
	public static String getCurrentDateTimeString14() {
		Date currentDate = new Date(System.currentTimeMillis());
		return getStringFromDateTime(currentDate, YYYYMMDD);
	}

	/**
	 * 根据日期及格式输出时间
	 * 
	 * @param date
	 * @param format
	 * @return
	 */
	private static String getStringFromDateTime(Date date, String format) {
		try {
			return new SimpleDateFormat(format).format(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
//string 转 date
	public static Date string2date(String date){
		Date parse = null;
		try {
			parse = new SimpleDateFormat(YYYYMMDD).parse(date);
		} catch (ParseException e) {
			e.printStackTrace();

		}
		return parse;
	}

	//date 转 string
	public static String date2string(Date date){
		String parse = null;
		parse = new SimpleDateFormat().format(date);
		return parse;
	}
}
