public class AnnonymsInnerClassOtherMethodsTest {

	public static void main(String[] args) {
		
		MyPopcorn p = new MyPopcorn() {
			
			public void sizzle() {
				System.out.println("anonymous sizzling popcorn");
			}

			public void pop() {
				sizzle(); // ONLY HERE we can call
				System.out.println("anonymous popcorn");
			}
		};
		
		p.pop();
		// Not Legal! Popcorn does not have sizzle()
		//p.sizzle(); 
		

	}

}

class MyPopcorn {
	public void pop() {
		System.out.println("popcorn");
	}
}

