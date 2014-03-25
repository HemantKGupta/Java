package com.hkg.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class GeneralTest {

	public static void main(String[] args) {
		//System.out.printf("%s%n", DayOfWeek.MONDAY.plus(3));
		//System.out.printf("%d%n", Month.FEBRUARY.maxLength());
		//LocalDate date = LocalDate.of(2000, Month.NOVEMBER, 20);
		DateFormat df = new SimpleDateFormat("dd/MM/yy");
		String formattedDate = df.format(new Date()); 
		//System.out.println(formattedDate);
		
		Calendar cal1 = new GregorianCalendar();
		 System.out.println("Year: " + cal1.get(Calendar.YEAR));
		    System.out.println("Month: " + (cal1.get(Calendar.MONTH) + 1));
		    System.out.println("Days: " + cal1.get(Calendar.DAY_OF_MONTH));
		    cal1.add(Calendar.DAY_OF_MONTH, -5);
		    System.out.println("added "+ cal1.get(Calendar.DAY_OF_MONTH ));
		    		
		   // stringToDate();
		   // writeActualDate();
	}
	
	// Convert from String to date
	  private static void stringToDate() {
	    
	    try {
	      Date date1;
	      date1 = new SimpleDateFormat("MM/dd/yy").parse("05/18/05");
	      System.out.println(date1);
	      Date date2 = new SimpleDateFormat("MM/dd/yyyy").parse("02/01/1980");
	      System.out.println(date2);
	    } catch (ParseException e) {
	      e.printStackTrace();
	    }
	  }
	  
	  private static void writeActualDate(){
		    Calendar cal = new GregorianCalendar();
		    Date creationDate = cal.getTime();
		    SimpleDateFormat date_format = new SimpleDateFormat("MMM dd,yyyy HH:mm");
		    System.out.println(date_format.format(creationDate));
		  }
//
}
