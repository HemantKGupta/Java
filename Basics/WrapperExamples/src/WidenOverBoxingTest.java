public class WidenOverBoxingTest {

	public static void main(String[] args) {
		int i = 5;
		go(i); 
	}
	
	static void go(Integer x) {
		System.out.println("Integer");
	}

	static void go(long x) {
		System.out.println("long");
	}
}
