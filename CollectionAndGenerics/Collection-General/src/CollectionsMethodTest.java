import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
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

		String[] words = { "ace", "boom", "crew", "dog", "eon" };
		List<String> wordList = Arrays.asList(words);

		Collections.reverse(wordList);
		System.out.println(wordList);

		List<String> myList = new ArrayList<String>();
		myList.add("java");
		myList.add("c");
		myList.add("c++");
		System.out.println("Initial list:" + myList);
		Collections.addAll(myList, "perl", "php");
		System.out.println("Final list:" + myList);

		List<String> tl = new ArrayList<String>();
		tl.add("job");
		tl.add("oracle");

		boolean isCommon = Collections.disjoint(myList, tl);

		List<String> myEmptyList = Collections.<String> emptyList();

		Enumeration<String> enm = Collections.enumeration(tl);
		while (enm.hasMoreElements()) {
			System.out.println(enm.nextElement());
		}
		
		List<String> ll = new ArrayList<String>();
        ll.add("one");
        ll.add("two");
        ll.add("three");
        ll.add("four");
        ll.add("two");
        ll.add("three");
        ll.add("two");
        ll.add("one");
        System.out.println("Actual list: "+ll);
        System.out.println("Frequency of 'one': "+Collections.frequency(ll, "one"));

	}

}
