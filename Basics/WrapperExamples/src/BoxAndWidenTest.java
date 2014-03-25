public class BoxAndWidenTest {

	public static void main(String[] args) {
		byte b = 5;
		go(b); // can this byte turn into an Object ?
	}

	static void go(Object o) {
		Byte b2 = (Byte) o;
		System.out.println(b2);
	}
}
