import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ArraysClassTest {

	public static void main(String[] args) {
		
		  Integer[] numbers = { 8, 2, 7, 1, 4, 9, 5};
	      int min = (int) Collections.min(Arrays.asList(numbers));
	      int max = (int) Collections.max(Arrays.asList(numbers));
	      System.out.println("Min number: " + min);
	      System.out.println("Max number: " + max);
	      
	      Double[] myList3 = { 1.9, 2.9, 3.4, 3.5 };
	      printArray(myList3);  
	      
	      System.out.println("The search result is; "+Arrays.binarySearch(myList3,3.4));
	      
		  Double[] myList4 =   Arrays.copyOf(myList3, 3);
		  
		  printArray(myList4);
		  
		  Double[] myList5 = new Double[5];
		    
		  Arrays.fill(myList5, 3.6);
		  
		  printArray(myList5);
		  
		  Arrays.sort(myList3);
		  
		  printArray(myList3);

	}
	public static<T> void printArray(T[] array){
		 for (T element : array) {
				System.out.println("The element is: " + element);
			}
		
	}
	

}
