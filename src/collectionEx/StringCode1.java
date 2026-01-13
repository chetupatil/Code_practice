package collectionEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringCode1 {

	public static void main(String[] args) {
		
		String input = "aaabccddd";
		String output = "";
		Map<Character, Integer> mapCount = new HashMap<Character, Integer>();
		char[] cin = input.toCharArray();
		for(int i=0;i<cin.length;i++) {
			
			if(mapCount.containsKey(cin[i])) {
				mapCount.put(cin[i], mapCount.get(cin[i])+1);
			}else {
				mapCount.put(cin[i], 1);
			}
		}
		for(Entry<Character, Integer> mapObj :mapCount.entrySet()) {
			if(mapObj.getValue()%2!=0) {
				output+=mapObj.getKey();
			}
		}
		System.out.println("Super Reduced String I/P : "+input);
		
		System.out.println("Super Reduced String O/P : "+output);
		
		
		
		

	}

}
