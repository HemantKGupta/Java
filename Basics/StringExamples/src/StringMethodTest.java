

public class StringMethodTest {

	public static void main(String[] args) {
		
		  //char charAt(int index) - Returns the char at  index.
		  String s = "Strings are immutable";
	      char result = s.charAt(8);
	      System.out.println(result);
	      
	      //int compareTo(String str) - Compares this String to another.
		  String str = "Hello World";
	      String anotherString = "hello world";

	      System.out.println( str.compareTo(anotherString) );
	      System.out.println( str.compareToIgnoreCase(anotherString) );
	      
	      //boolean contentEquals(StringBuffer sb) 
	      //Returns true iff this String hsa same sequence of chars.
	      StringBuffer sb = new StringBuffer( "Hello World");
	      System.out.println( str.contentEquals(sb));
	      
	      //static String copyValueOf(char[] data) 
	      //Returns a String of char sequence in the array specified.
	      char [] charArray = {'a','b','c','d'};
	      System.out.println( "Array is:"+ String.copyValueOf(charArray));
	      
	      //void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
	      //Copies chars from this string into the dest character array.
	      char [] charArray2 = new char[10];	      
	      str.getChars(0, 7, charArray2, 0);
	      System.out.println( "Array is:"+ String.copyValueOf(charArray2));
	      
	      //int lastIndexOf(String str) 
	      String strOrig = "Hello world ,Hello Reader";
	      int lastIndex = strOrig.lastIndexOf("Hello");
	      if(lastIndex == - 1){
	         System.out.println("Hello not found");
	      }else{
	         System.out.println("Last occ of Hello is at: "+ lastIndex);
	      }
	      
	      //int indexOf(String str) 
	      strOrig = "Hello readers";
	      int intIndex = strOrig.indexOf("Hello");
	      if(intIndex == - 1){
	         System.out.println("Hello not found");
	      }else{
	         System.out.println("Found Hello at index "
	         + intIndex);
	      }
	      
	      //String replace(char oldChar, char newChar)
	      //Returns a new string resulting from replacing.	      
	      str="Hello World";
	      System.out.println( str.replace( 'H','W' ) );
	      System.out.println( str.replace( "l","") );  // remove method
	      System.out.println( str.replaceFirst("He", "Wa") );
	      System.out.println( str.replaceAll("He", "Ha") );
	      
	      //String[] split(String regex) 
	      //Splits this string around matches of the given reg ex.	      
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
	      System.out.println("starts with jan: "+str.startsWith("jan"));
	      
	      //boolean endsWith(String suffix) 
	      //Tests if this string ends with the specified suffix.
	      System.out.println("starts with march "+str.endsWith("march"));
	      
	      //CharSequence subSequence(int beginIndex, int endIndex)
	      //Returns a new char seq that is a subseq of this sequence.
	      System.out.println(str.subSequence(0, 4));
	      
	      
	      //String substring(int beginIndex)
	      String forSubstring = "0123456789";
	      System.out.println(forSubstring.substring(3));
	      System.out.println(forSubstring.substring(3,7));
	      
	      
	      //char[] toCharArray() 
	      char[] test = str.toCharArray();
	      System.out.println("Array is: "+ String.copyValueOf(test));
	      
	      //String toUpperCase() 
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
	}
	
	
}
