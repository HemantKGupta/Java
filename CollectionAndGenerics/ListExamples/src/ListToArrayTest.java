import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ListToArrayTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("mfnew");
		list.add("Vdsfw");
		list.add("Dsfve");
		list.add("vwe");
		
		Object[] arr = list.toArray();
		System.out.println(Arrays.toString(arr));
		
		String[] arr2 = list.toArray(new String[0]);
		System.out.println(Arrays.toString(arr2));
		
	}

}
