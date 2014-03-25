

public class StringRegexMethods {

	public static void main(String[] args) {
		String str = "This is my small example string which I'm going to use for pattern matching.";
		System.out.println("The string matches: "+str.matches("\\w.*"));
		String[] splitString = (str.split("\\s+"));
		System.out.println("The string split size is : "+splitString.length);
		for (String string : splitString) {
		      System.out.println(string);
		}
		// replace all whitespace with tabs
		System.out.println(str.replaceAll("\\s+", "\t"));
	}

}
