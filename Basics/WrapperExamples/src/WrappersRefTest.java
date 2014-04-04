public class WrappersRefTest {

	public static void main(String[] args) {
		Integer i3 = 10;
		Integer i4 = 10;
		int i = 10;
		if (i3 == i4)
			System.out.println("same object");
		if (i3.equals(i4))
			System.out.println("meaningfully equal");
		if (i3==i)
			System.out.println("ref for Wrapper and primitive");
		if (i3.equals(i))
			System.out.println("equals for wrapper and primitive");
	}

}
