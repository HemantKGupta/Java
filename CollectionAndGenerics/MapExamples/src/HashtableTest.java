import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;


public class HashtableTest {

	public static void main(String[] args) {
        Hashtable<String,String> ht = new Hashtable<String,String>();
        ht.put("first", "FIRST INSERTED");
        ht.put("second", "SECOND INSERTED");
        ht.put("third","THIRD INSERTED");
        System.out.println(ht);
        System.out.println("Value of key 'second': "+ht.get("second"));
        System.out.println("Is Hashtable empty? "+ht.isEmpty());
        ht.remove("third");
        System.out.println(ht);
        System.out.println("Size of the Hashtable: "+ht.size());
        
        Set<String> keys = ht.keySet();
        for(String key: keys){
            System.out.println("Value of "+key+" is: "+ht.get(key));
        }
        
        Set<Entry<String, String>> entires = ht.entrySet();
        for(Entry<String,String> ent:entires){
            System.out.println(ent.getKey()+" ==> "+ent.getValue());
        }
        
        Enumeration<String> keys2 = ht.keys();
        while(keys2.hasMoreElements()){
            String key = keys2.nextElement();
            System.out.println("Value of "+key+" is: "+ht.get(key));
        }
        
        HashMap<String, String> subMap = new HashMap<String, String>();
        subMap.put("s1", "S1 VALUE");
        subMap.put("s2", "S2 VALUE");
        ht.putAll(subMap);
        System.out.println(ht);
        
        if(ht.containsKey("first")){
            System.out.println("The Hashtable contains key first");
        }
        
        if(ht.containsValue("SECOND INSERTED")){
            System.out.println("The Hashtable contains value SECOND INSERTED");
        }
        
	}

}
