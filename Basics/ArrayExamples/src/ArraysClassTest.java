import java.util.Arrays;
import java.util.List;


public class ArraysClassTest {

	public static void main(String[] args) {
		
		  Integer[] numbers = { 8, 2, 7, 1, 4, 9, 5};
		  
		  System.out.println(Arrays.toString(numbers));
		  
		  List<Integer> list = Arrays.asList(numbers);
		  
		  System.out.println(list);		  
			      
	      Double[] myList3 = { 1.9, 2.9, 3.4, 3.5 };	    
	      
	      System.out.println(Arrays.binarySearch(myList3,3.4));
	      
		  Double[] myList4 =   Arrays.copyOf(myList3, 3);
		  
		  System.out.println(Arrays.toString(myList4));
		  
		  Double[] myList5 = new Double[5];
		    
		  Arrays.fill(myList5, 3.6);
		  
		  System.out.println(Arrays.toString(myList5));
		  
		  Arrays.sort(myList3);
		  
		  System.out.println(Arrays.toString(myList3));
	}
}
