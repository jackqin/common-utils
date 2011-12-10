package com.colorcc.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	
	private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	
	private static DateUtil dateUtil;
	
	private DateUtil() {
		
	}
	
	public static DateUtil getInstances() {
		if (dateUtil == null) {
			dateUtil = new DateUtil();
		}
		return dateUtil;
	}
	
	
	public String getDate(Date date) {
		return dateFormat.format(date);
	}
	
	public String getDate(Date date, String format) {
		SimpleDateFormat dateFormat1 = new SimpleDateFormat(format);
		return dateFormat1.format(date);
	}

}
