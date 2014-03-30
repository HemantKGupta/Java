import java.io.Console;

public class MyConsoleTest {

	public static void main(String[] args) {
		 Console c = System.console();
	        if (c == null) {
	            System.err.println("No console.");
	            System.exit(1);
	        }

	        String login = c.readLine("Enter your login: ");
	        char [] oldPassword = c.readPassword("Enter your old password: ");
	}
	

}
