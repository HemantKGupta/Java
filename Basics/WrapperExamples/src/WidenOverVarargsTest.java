public class WidenOverVarargsTest {

	public static void main(String[] args) {
		byte b = 5;
		go(b, b);
	}

	static void go(int x, int y) {
		System.out.println("int,int");
	}

	static void go(byte... x) {
		System.out.println("byte ... ");
	}
}
