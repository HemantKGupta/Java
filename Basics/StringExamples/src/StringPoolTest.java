public class StringPoolTest {

	public static void main(String[] args) {
		
		String s1 = "test";
		String s2 = new String("test");
		String s3 = new String("test");
		
		System.out.println("Test using equals: "+ s1.equals(s2));
		System.out.println("Test using ==: "+ (s1==s2) );
		System.out.println("Test using ==: "+ (s2==s3) );
		
	}
}
