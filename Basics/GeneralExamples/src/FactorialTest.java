
public class FactorialTest {

	public static void main(String[] args) {
		System.out.println("The result is: "+factorial(2));
		System.out.println("The result is: "+factorial(1));
		System.out.println("The result is: "+factorial(0));
		System.out.println("The result is: "+factorialRecur(2));
		System.out.println("The result is: "+factorialRecur(1));
		System.out.println("The result is: "+factorialRecur(0));
	}
	
	public static int factorial(int input){
		int result = 0;
		if (input <=0){
			return result;
		} else {
			result = 1;
			for (int i=1;i<=input;i++){
				result= result*i;
			}
		}
		return result;
	}
	public static int factorialRecur(int input){
		int result = 0;
		if (input <=0){
			return result;
		} else if(input == 1){
			return 1;
		}
		return input*factorialRecur(input-1);
	
		
	}

}
