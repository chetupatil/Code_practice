package main.java.program.StringEx.Telstra;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatingCharEx {

	public static void main(String[] args) {
		Map<Character,Integer> nameCount = new HashMap<>();
		String st = "aaabcc";
		char[] c = st.toCharArray();
		
		
		for(int i=0;i<c.length;i++) {
			Integer value = nameCount.get(c[i])!=null?nameCount.get(c[i])+1:1;
			nameCount.put(c[i], value);
		}
		
//		for(Entry<Character, Integer> s : nameCount.entrySet()) {
//			if(s.getValue()==1) {
//				System.out.println(s.getKey());
//				break;
//			}
//			
//		}
		String comp = "";
		for(Entry<Character, Integer> s : nameCount.entrySet()) {
			comp = comp+s.getKey()+s.getValue();	
		}
		System.out.println(comp);
		
		
		

	}

}
