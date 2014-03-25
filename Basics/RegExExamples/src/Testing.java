import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Testing {

	public static void main(String[] args) {
		
		List<String> input = new ArrayList<String>(); 
		input.add("123-45-6789");
		input.add("9876-5-4321");
		input.add("987-65-4321 (attack)");
		input.add("987-65-4321 ");
		input.add("192-83-7465");
		for (String ssn : input) {
			if (ssn.matches("^(\\d{3}-?\\d{2}-?\\d{4})$")) {
				System.out.println("Found good SSN: " + ssn);
			}
		} 
		
 		String input2 = "I have a cat, but I like my dog better.";
 		Pattern p = Pattern.compile("(mouse|cat|dog|wolf|bear|human)");
 		Matcher m = p.matcher(input2);
 		List<String> animals = new ArrayList<String>(); 
 		while (m.find()) { 
 			System.out.println("Found a " + m.group() + ".");
 			animals.add(m.group());
 		} 
 		
 		String input3 = "User clientId=23421. Some more text clientId=33432. This clientNum=100";
 		Pattern p3 = Pattern.compile("(clientId=)(\\d+)");
 		Matcher m3 = p3.matcher(input3); 		
 		StringBuffer result = new StringBuffer(); 		
 		while (m3.find()) { 			
 			System.out.println("Masking: " + m3.group(2)); 			
 			m3.appendReplacement(result, m3.group(1) + "***masked***"); 		
 		}
 		m3.appendTail(result);
 		System.out.println(result); 
 		
 		String testString = "my dog is blue";
 		if (testString.matches("my dog is (?!(green|red))\\w+")) {
			System.out.println("Found match");
		}
 		
 		String testString2 = "my dog is red";
 		if (testString2.matches("my dog is (?!(green|red))\\w+")) {
			System.out.println("Found match");
		}
 		
 		//at least 8, but at most 12 alphanumeric characters,
 		//and at least two numbers, in any position.
 		List<String> input4 = new ArrayList<String>();
		input4.add("password");
		input4.add("p4ssword");
		input4.add("p4ssw0rd");
		input4.add("p45sword");

		for (String ssn : input4) {
			if (ssn.matches("^(?=.*[0-9].*[0-9])[0-9a-zA-Z]{8,12}$")) {
				System.out.println(ssn + ": matches");
			} else {
				System.out.println(ssn + ": does not match");
			}
		}

	}

}


