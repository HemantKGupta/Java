import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class SetTest {

	public static void main(String[] args) {
		Set<String> stringSet =  new HashSet<String>();
		
		stringSet.add(null);
		stringSet.add(null);
		for (String string : stringSet) {
			System.out.println(string);
		}
		
		Set<String> stringLinkedHashSet =  new LinkedHashSet<String>();
		Set<String> stringTreeSet =  new TreeSet<String>();
	}

}
