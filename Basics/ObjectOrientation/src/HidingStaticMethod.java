public class HidingStaticMethod {

	public static void main(String[] args) {
		
	    MyCat myCat = new MyCat();
        MyAnimal myAnimal = myCat;
        MyAnimal.testClassMethod();
        myAnimal.testInstanceMethod();
	}

}

class MyAnimal {
	
    public static void testClassMethod() {
        System.out.println("The static method in MyAnimal");
    }
    
    public void testInstanceMethod() {
        System.out.println("The instance method in MyAnimal");
    }
}

class MyCat extends MyAnimal {
	
    public static void testClassMethod() {
        System.out.println("The static method in MyCat");
    }
    
    public void testInstanceMethod() {
        System.out.println("The instance method in MyCat");
    }
   
}

