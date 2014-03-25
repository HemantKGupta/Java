public class AccessSuperClassMethodsTest {

	public static void main(String[] args) {
		MySubclass s = new MySubclass();
        s.printMethod(); 
	}

}

class MySuperclass {

    public void printMethod() {
        System.out.println("Printed in MySuperclass.");
    }
}

class MySubclass extends MySuperclass {
 
    public void printMethod() {
        super.printMethod();
        System.out.println("Printed in MySubclass");
    }
    
}
