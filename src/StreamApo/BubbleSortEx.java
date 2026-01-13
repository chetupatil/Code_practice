package StreamApo;

import java.util.Arrays;
import java.util.List;

public class BubbleSortEx {

	public static void main(String[] args) {
		
		List<Integer> bSort = Arrays.asList(6,5,2,8,9,4);
		
		int count = bSort.size();
		while(count>0) {
			for(int i=0;i<bSort.size()-1;i++) {
				int temp = 0;
				
			    if(bSort.get(i)>bSort.get(i+1)) {
			    	temp = bSort.get(i);
			    	bSort.set(i, bSort.get(i+1));
			    	bSort.set(i+1, temp);
			    }
				
			}
			count--;
		}
		
		for(Integer s : bSort) {
			System.out.print(s+" ");
		}
		System.out.println();
	}

}
