import java.util.Scanner;


public class ScannerTest {

	public static void main(String[] args) {
		String s = "as sjj lll shyy ss";

		Scanner sc= new Scanner(s).useDelimiter(" ");

		while(sc.hasNext())
			System.out.println(sc.next());
		
		sc.close();
	}

}
