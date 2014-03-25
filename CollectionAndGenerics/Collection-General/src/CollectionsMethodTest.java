import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsMethodTest {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("mfnew");
		list.add("Vdsfw");
		list.add("Dsfve");
		list.add("vwe");
		
		Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
		System.out.println(list);
		
		Comparator<String> comp = Collections.reverseOrder();
		Collections.sort(list, comp);
		System.out.println(list);
		
		String[] words = {"ace", "boom", "crew", "dog", "eon"};
		List<String> wordList = Arrays.asList(words);
		
		Collections.reverse(wordList);
		System.out.println(wordList);
		
		
	}

}
