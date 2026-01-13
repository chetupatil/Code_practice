package StreamApo;

import java.util.Arrays;
import java.util.List;

public class SelectionSortEx {

	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(3,1,6,2,4,5);

	    int maxIndex;
	    
		for(int i=0;i<=l.size()-1;i++) {
			maxIndex = i;
			for(int j=i+1;j<l.size();j++) {
				if(l.get(maxIndex)>l.get(j)) {
					
				}
				

			}
		}


		for(Integer j : l) {
			System.out.print(j+" ");
		}
		System.out.println();

	}

}
