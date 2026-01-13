package main.java.ex;

import java.util.HashMap;
import java.util.Map;

public class TopKFrequentTransactions {

	public static void main(String[] args) {
		
		String[] tran = {"TX1","TX2","TX1","TX3","TX2","TX1"};
		
		int k=0;
		
		Map<String,Integer> tranMap = new HashMap<>();
		
		for(String tr :  tran) {
			tranMap.put(tr, tranMap.get(tr) != null?tranMap.get(tr)+1:1);
		}
		
		for(String key :tranMap.keySet()) {
			if(tranMap.get(key)!=1) {
				k++;
			}
		}
		
		System.out.println("Top K Frequent Transactions : "+k);
		

	}

}
