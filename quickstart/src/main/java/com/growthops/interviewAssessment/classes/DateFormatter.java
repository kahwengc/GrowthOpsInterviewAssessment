package com.growthops.interviewAssessment.classes;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateFormatter {
	
	private Date date = new Date();
	private SimpleDateFormat dateFormat = new SimpleDateFormat("E, dd MMM yyy HH:mm:ss z");
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public SimpleDateFormat getDateFormat() {
		return dateFormat;
	}
	public void setDateFormat(SimpleDateFormat dateFormat) {
		this.dateFormat = dateFormat;
	}

	public void displayDate() {
		dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
		System.out.println(dateFormat.format(date));
	}
	
	
}
