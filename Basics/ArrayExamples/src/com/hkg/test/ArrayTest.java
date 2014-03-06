package com.hkg.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayTest {

	public static void main(String[] args) {
		Integer[] numbers = { 8, 2, 7, 1, 4, 9, 5};
	      int min = (int) Collections.min(Arrays.asList(numbers));
	      int max = (int) Collections.max(Arrays.asList(numbers));
	      System.out.println("Min number: " + min);
	      System.out.println("Max number: " + max);
	      

	      ArrayList objArray = new ArrayList();
	      ArrayList objArray2 = new ArrayList();
	      objArray2.add(0,"common1");
	      objArray2.add(1,"common2");
	      objArray2.add(2,"notcommon");
	      objArray2.add(3,"notcommon1");
	      objArray.add(0,"common1");
	      objArray.add(1,"common2");
	      objArray.add(2,"notcommon2");
	      System.out.println("Array elements of array1" +objArray);
	      System.out.println("Array elements of array2" +objArray2);
	      objArray.removeAll(objArray2);
	      System.out.println("Array1 after removing array2 from array1"+objArray);
	      
	      objArray = new ArrayList();
	      objArray2 = new ArrayList();
	      objArray2.add(0,"common1");
	      objArray2.add(1,"common2");
	      objArray2.add(2,"notcommon");
	      objArray2.add(3,"notcommon1");
	      objArray.add(0,"common1");
	      objArray.add(1,"common2");
	      objArray.add(2,"notcommon2");
	      System.out.println("Array elements of array1"+objArray);
	      System.out.println("Array elements of array2"+objArray2);
	      objArray.retainAll(objArray2);
	      System.out.println("Array1 after retaining common elements of array2 & array1"+objArray);
	      
	}
	
	public static void reverseArray(){
		 ArrayList arrayList = new ArrayList();
	      arrayList.add("A");
	      arrayList.add("B");
	      arrayList.add("C");
	      arrayList.add("D");
	      arrayList.add("E");
	      System.out.println("Before Reverse Order: " + arrayList);
	      Collections.reverse(arrayList);
	      System.out.println("After Reverse Order: " + arrayList);
	}
	
	public static void mergeTwoArrays(){
		 String a[] = { "A", "E", "I" };
	      String b[] = { "O", "U" };
	      List list = new ArrayList(Arrays.asList(a));
	      list.addAll(Arrays.asList(b));
	      Object[] c = list.toArray();
	      System.out.println(Arrays.toString(c));
	}

}
