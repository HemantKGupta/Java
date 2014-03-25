public class AnnonymsInnerClassTest {

	public static void main(String[] args) {
		
		Popcorn p = new Popcorn() {
			public void pop() {
				System.out.println("anonymous popcorn");
			}
		};
		
		p.pop();

	}

}

class Popcorn {
	public void pop() {
		System.out.println("popcorn");
	}
}
