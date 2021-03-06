package chapter08.item53;

import java.util.Set;

public class ReflectiveInstantiation {

	public static void main(String[] args) {
		// Translate the class name into a Class object
		Class<?> cl = null;
		try {
			cl = Class.forName("java.util.TreeSet");
		} catch (ClassNotFoundException e) {
			System.err.println("Class not found.");
			System.exit(1);
		}
		// Instantiate the class
		Set<String> s = null;
		try {
			s = (Set<String>) cl.newInstance();
		} catch (IllegalAccessException e) {
			System.err.println("Class not accessible.");
			System.exit(1);
		} catch (InstantiationException e) {
			System.err.println("Class not instantiable.");
			System.exit(1);
		}
		// Exercise the set
		s.add("skos");
		s.add("axcs");
		System.out.println(s);
	}

}
