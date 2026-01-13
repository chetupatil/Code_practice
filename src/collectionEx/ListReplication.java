package collectionEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListReplication {

	public static void main(String[] args) {
		int repSize = 2;
		List<Integer> finalRepList = new ArrayList<>();
		List<Integer> repList = Arrays.asList(3,4,1);
	
		for(Integer i: repList) {
			System.out.println(i);
		}
		
		
		
		for(Integer re : repList) {
			int count = repSize;
			while(count>0) {
				finalRepList.add(re);
				count--;
			}
			
		}
		
		for(Integer i: finalRepList) {
			System.out.println(i);
		}

	}

}
