
public class AbstractStaticTest {

	public static void main(String[] args) {
		 A b = new B();
		// A c = new C();
		 System.out.println("b.str = " + A.str);
		 System.out.println("b.str = " + B.str);
	//	 System.out.println("b.str = " + C.str);
	}

}
abstract class A{
    static String str;
}

class B extends A{
    public B(){
      // str = "123";
    }
}
class C extends B{
    public C(){
        str = "abc";
    }
}