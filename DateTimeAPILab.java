package com.sandeep.java8.lab;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class DateTimeAPILab {

	public static void main(String[] args) {

		// LocalDate is an immutable date-time object that represents a date, often viewed as year-month-day.
		// LocalTime is an immutable date-time object that represents a time,often viewed as hour-minute-second.Time is represented to nanosecond precision.
		// LocalDateTime is an immutable date-time object that represents a date-time.
		
		LocalDate date = LocalDate.now();
		System.out.println("Current Date : " + date);
		
		LocalTime time = LocalTime.now();
		System.out.println("Current Time : " + time);
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println("Current Date & Time : " + dt);
		
		DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		System.out.println("Formatted Date Time : " + dt.format(dtFormatter));
		
		
		System.out.println("Day of Month : " + dt.getDayOfMonth());
		System.out.println("Day of the Year : " + dt.getDayOfYear());
		System.out.println("Month of the Year : " + dt.getMonthValue());
		System.out.println("Minutes of the Hour : " + dt.getMinute());
		
		LocalDate localDt = LocalDate.of(1999, 10, 26);
		System.out.println("Print Specified Date : " + localDt);
		
		
		ZonedDateTime currentDTZone = ZonedDateTime.now();
		System.out.println("Current Date, Time & Zone : " + currentDTZone);
		System.out.println("Current Time Zone : " + currentDTZone.getZone());
		
		// Getting time zone of specific place we use withZoneSameInstant(): it is used to return a copy of this date-time  
	    // with a different time-zone, retaining the instant. 
		ZoneId tokyo = ZoneId.of("Asia/Tokyo");
		ZonedDateTime tokyoDT = currentDTZone.withZoneSameInstant(tokyo);
		System.out.println("Tokyo (Japan) Current Data & Time : " + tokyoDT);
		
		
		// Find out different between two dates using Period class
		LocalDate todayDate = LocalDate.now();
		LocalDate compareDate = LocalDate.of(1999, 10, 26);
		Period gap = Period.between(compareDate, todayDate);
		System.out.println("gap between dates is a period of : " + gap);
		
		
		// Find out different between two dates using Period class
		LocalTime currentTime = LocalTime.now();
		Duration fiveHours = Duration.ofHours(5);
		// adding five hours to the current time and storing it in time2 
        LocalTime time2 = currentTime.plus(fiveHours); 
  
        Duration timeGap = Duration.between(time2, currentTime); 
        System.out.println("duraion gap between currenttime & time2 is : " + timeGap); 
		
        
        // Use of ChronoUnits Enum
        LocalDate todayDt = LocalDate.now();
        LocalDate todayDt1 = todayDt.plus(2, ChronoUnit.YEARS);
        System.out.println("Added 2 Years in current Year : " + todayDt1);
		
        
        // Function to check date and time according to our requirement
        LocalDate date1 = LocalDate.now();
        
        LocalDate dayOfNextMonth = date1.with(TemporalAdjusters.firstDayOfNextMonth()); 
        System.out.println("First Day Of Next Month : " + dayOfNextMonth );
        
        LocalDate lastDay = date1.with(TemporalAdjusters.lastDayOfMonth()); 
        System.out.println("Last Day Of Month : " + lastDay);         
        
        /*
         * OUTPUT
         * ------
         * 
         *  Current Date : 2020-10-19
			Current Time : 00:24:33.210
			Current Date & Time : 2020-10-19T00:24:33.210
			Formatted Date Time : 19-10-2020 00:24:33
			Day of Month : 19
			Day of the Year : 293
			Month of the Year : 10
			Minutes of the Hour : 24
			Print Specified Date : 1999-10-26
			Current Date, Time & Zone : 2020-10-19T00:24:33.225+05:30[Asia/Calcutta]
			Current Time Zone : Asia/Calcutta
			Tokyo (Japan) Current Data & Time : 2020-10-19T03:54:33.225+09:00[Asia/Tokyo]
			gap between dates is a period of : P20Y11M23D
			duraion gap between currenttime & time2 is : PT-5H
			Added 2 Years in current Year : 2022-10-19
			First Day Of Next Month : 2020-11-01
			Last Day Of Month : 2020-10-31

         * */
        
	}

}