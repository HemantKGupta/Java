package chapter08.item49;

import java.util.Comparator;

public class BoxedPrimitiveTest {
	
	static Integer i;

	public static void main(String[] args) {
		Integer a = new Integer(42);
		Integer b = new Integer(42);
		System.out.println(naturalOrder1.compare(a,b));
		System.out.println(naturalOrder2.compare(a,b));
		
		if (i == 42)
			System.out.println("Unbelievable");
	}

	// Broken comparator
	public static Comparator<Integer> naturalOrder1 = new Comparator<Integer>() {
		public int compare(Integer first, Integer second) {
			return first < second ? -1 : (first == second ? 0 : 1);
		}
	};

	public static Comparator<Integer> naturalOrder2 = new Comparator<Integer>() {
		public int compare(Integer first, Integer second) {
			int f = first;
			int s = second;
			return f < s ? -1 : (f == s ? 0 : 1);
		}
	};

}
