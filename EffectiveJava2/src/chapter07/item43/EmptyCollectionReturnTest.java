package chapter07.item43;

import java.util.ArrayList;
import java.util.List;

public class EmptyCollectionReturnTest {
	
	class Cheese{}
	
	// The right way to return an array from a collection
	private final List<Cheese> cheesesInStock = new ArrayList<Cheese>();
	private static final Cheese[] EMPTY_CHEESE_ARRAY = new Cheese[0];
	
	public Cheese[] getCheeses() {
	return cheesesInStock.toArray(EMPTY_CHEESE_ARRAY);
	}

	public static void main(String[] args) {

	}

}
