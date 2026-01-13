package main.java.program.StringEx.Telstra;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MostFrequentWordEx {

	public static void main(String[] args) {
		String[] list = {"apple", "banana", "apple", "orange", "banana", "apple"};
		
		Map<String,Integer> map = new HashMap<>();
		for(String i : list) {
			Integer value = map.get(i)!=null?map.get(i)+1:1;
			map.put(i, value);
		}
		
		int temp=0;
		String word = "";
		for(Entry<String, Integer> en : map.entrySet()) {
			if(en.getValue()>temp) {
				temp = en.getValue();
				word = en.getKey();
			}
		}
		
		System.out.println("the most frequent word in a list of strings : "+word);
		
	}
}
