public class Foo {
	
   		static int x=7;
   		
    	static void changeLocal(int x){
    		x=x+50;
    		System.out.println("x inside change is  :"+x);
    	}
    	
    	static void changeStatic(int x){
    		Foo.x=x+50;
    		System.out.println("x inside change is  :"+Foo.x);
    	}
    	
        public static void main(String[] args) {
        	
	        changeLocal(2);
	        System.out.println("x is :"+x);
	        changeStatic(5);
	        System.out.println("x is :"+x);
    }
}