import java.util.Map;
import java.util.TreeMap;


public class MapDemo {

	public static void main(String[] args) {
		TreeMap<String,Integer> map = new TreeMap<>();
		
		map.put("ram", 2222);
		map.put("mike", 2333);
		map.put("shyam", 4333);
		map.put("amit",2222);
		map.put("amit",4444);
		//System.out.println("Amit Phone "+map.get("amit"));
		//System.out.println(map.remove("ram"));
		// Traverse 
		for(Map.Entry<String, Integer> m : map.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue() );
		}
	}

}
