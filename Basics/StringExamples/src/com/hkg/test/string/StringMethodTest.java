package com.hkg.test.string;

public class StringMethodTest {

	public static void main(String[] args) {
		
		  //char charAt(int index) 
		  //Returns the character at the specified index.
		  String s = "Strings are immutable";
	      char result = s.charAt(8);
	      System.out.println(result);
	      
	      //int compareTo(Object o) 
	      //Compares this String to another Object.
	      
		  String str = "Hello World";
	      String anotherString = "hello world";
	      Object objStr = str;

	      System.out.println( str.compareTo(anotherString) );
	      System.out.println( str.compareToIgnoreCase(anotherString) );
	      System.out.println( str.compareTo(objStr.toString()));
	      
	      //boolean contentEquals(StringBuffer sb) 
	      //Returns true if and only if this String represents the same sequence of characters as the specified StringBuffer.
	      StringBuffer sb = new StringBuffer( "Hello World");
	      System.out.println( str.contentEquals(sb));
	      
	      //static String copyValueOf(char[] data) 
	      //Returns a String that represents the character sequence in the array specified.
	      char [] charArray = {'a','b','c','d'};
	      System.out.println( "The charArray is string is:"+ String.copyValueOf(charArray));
	      
	      //void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
	      //Copies characters from this string into the destination character array.
	      char [] charArray2 = new char[10];	      
	      str.getChars(0, 7, charArray2, 0);
	      System.out.println( "The charArray is string is:"+ String.copyValueOf(charArray2));
	      
	      //int lastIndexOf(int ch) 
	      //Returns the index within this string of the last occurrence of the specified character.
	      String strOrig = "Hello world ,Hello Reader";
	      int lastIndex = strOrig.lastIndexOf("Hello");
	      if(lastIndex == - 1){
	         System.out.println("Hello not found");
	      }else{
	         System.out.println("Last occurrence of Hello is at index "+ lastIndex);
	      }
	      
	      //int indexOf(int ch) 
	      //Returns the index within this string of the first occurrence of the specified character.
	      strOrig = "Hello readers";
	      int intIndex = strOrig.indexOf("Hello");
	      if(intIndex == - 1){
	         System.out.println("Hello not found");
	      }else{
	         System.out.println("Found Hello at index "
	         + intIndex);
	      }
	      
	      //String replace(char oldChar, char newChar)
	      //Returns a new string resulting from replacing all occurrences of oldChar in this string with newChar.
	      
	      str="Hello World";
	      System.out.println( str.replace( 'H','W' ) );
	      System.out.println( str.replace( "l","") );  // use as remove method
	      System.out.println( str.replaceFirst("He", "Wa") );
	      System.out.println( str.replaceAll("He", "Ha") );
	      
	      //String[] split(String regex) 
	      //Splits this string around matches of the given regular expression.
	      
	      str = "jan-feb-march";
	      String[] temp;
	      String delimeter = "-";
	      temp = str.split(delimeter);
	      for(int i =0; i < temp.length ; i++){
	         System.out.println(temp[i]);
	         System.out.println("");
	         
	      }
	      str = "jan.feb.march";
	      delimeter = "\\.";
	      temp = str.split(delimeter);
	      for(int i =0; i < temp.length ; i++){
	         System.out.println(temp[i]);
	         System.out.println("");
	         
	      }
	      
	      //boolean startsWith(String prefix)
	      //Tests if this string starts with the specified prefix.
	      System.out.println("The string starts with jan: "+str.startsWith("jan"));
	      
	      //boolean endsWith(String suffix) 
	      //Tests if this string ends with the specified suffix.
	      System.out.println("The string starts with march "+str.endsWith("march"));
	      
	      //CharSequence subSequence(int beginIndex, int endIndex)
	      //Returns a new character sequence that is a subsequence of this sequence.
	      System.out.println(str.subSequence(0, 4));
	      
	      
	      //String substring(int beginIndex)
	      //Returns a new string that is a substring of this string.
	      String forSubstring = "0123456789";
	      System.out.println(forSubstring.substring(3));
	      System.out.println(forSubstring.substring(3,7));
	      
	      
	      //char[] toCharArray() 
	      //Converts this string to a new character array.
	      char[] test = str.toCharArray();
	      System.out.println("Converted to char array: "+ String.copyValueOf(test));
	      
	      //String toUpperCase() 
	      //Converts all of the characters in this String to upper case using the rules of the default locale.
	      str = "string abc touppercase ";
	      String strUpper = str.toUpperCase();
	      System.out.println("Original String: " + str);
	      System.out.println("String changed to upper case: "
	      + strUpper);
	      
	      //boolean regionMatches(int toffset, String other, int ooffset, int len)
	      //Tests if two string regions are equal.	      
	      String first_str = "Welcome to Microsoft";
	      String second_str = "I work with Microsoft";
	      boolean match = first_str.regionMatches(11, second_str, 12, 9);
	      System.out.println("first_str[11 -19] == "+ "second_str[12 - 21]:-"+ match);
	}
	
	
}
