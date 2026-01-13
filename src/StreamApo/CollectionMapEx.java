package StreamApo;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class CollectionMapEx {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new Hashtable<String, Integer>();
		map.put("Chetana", 30);
		map.put("Aakash", 33);
		map.put(null, 2);
		
		System.out.println(map);

	}

}
