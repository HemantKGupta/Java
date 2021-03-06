import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapOperationsTest {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("first", "FIRST INSERTED");
		hm.put("second", "SECOND INSERTED");
		hm.put("third", "THIRD INSERTED");
		
		System.out.println(hm);
		System.out.println("Value of second: " + hm.get("second"));
		System.out.println("Is HashMap empty? " + hm.isEmpty());
		hm.remove("third");
		System.out.println(hm);
		System.out.println("Size of the HashMap: " + hm.size());
		
		Set<String> keys = hm.keySet();
        for(String key: keys){
            System.out.println("Value of "+key+" is: "+hm.get(key));
        }
        
        Set<Entry<String, String>> entires = hm.entrySet();
        for(Entry<String,String> ent:entires){
            System.out.println(ent.getKey()+" ==> "+ent.getValue());
        }
        
        System.out.println(hm);
        if(hm.containsValue("SECOND INSERTED")){
            System.out.println("The hashmap contains value SECOND INSERTED");
        }
	}

}
