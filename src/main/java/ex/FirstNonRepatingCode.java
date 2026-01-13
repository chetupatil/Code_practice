package main.java.ex;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepatingCode {
	public static void main(String[] args) {
		
		String str = "gadag";
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(Character c : str.toCharArray()) {
			map.put(c,map.containsKey(c)? map.get(c)+1:1);
		}
		Integer indexV = -1;
		for(int i=0;i<str.length();i++) {
			if(map.get(str.charAt(i))==1) {
				indexV = i;
				break;
			}
		}
		System.out.println(indexV);
		
	}
}
