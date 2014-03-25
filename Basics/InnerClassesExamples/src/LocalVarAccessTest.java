public class LocalVarAccessTest {

	public static void main(String[] args) {
		new LocalVarAccessTest().doStuff();
	}

	void doStuff() {
		
		// String z = "local variable"; //Won't Compile!
		final String z = "local variable";
		
		class MyInner {
			public void seeOuter() {
				System.out.println("Local variable z is " + z);
			} 
		} 

		MyInner mi = new MyInner();

		mi.seeOuter();
	}

}
