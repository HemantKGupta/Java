package com.hkg.test.format;

import java.text.DecimalFormat;

public class DecimalFormatTest {
	

	  public static void main(String[] args) {

	      customFormat("###,###.###", 123456.789);
	      customFormat("###.##", 123456.789);
	      customFormat("000000.000", 123.78);
	      customFormat("$###,###.###", 12345.67);  
	   }
	   
	   static public void customFormat(String pattern, double value ) {
		     
		      DecimalFormat myFormatter = new DecimalFormat(pattern);
		      String output = myFormatter.format(value);
		      System.out.println(value + "  " + pattern + "  " + output);
	   }
}
