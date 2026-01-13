package StreamApo;

import java.util.Arrays;
import java.util.List;

public class StreamReddyEx {

	public static void main(String[] args) {

		List<Integer> num = Arrays.asList(2,4,5,6,7);
		
		int sum = 0;
		int mulVal = 0;
		for(Integer n : num) {
			if(n%2==0) {
				mulVal=n*2;
				sum+=mulVal;
			}
		}
		System.out.println(sum);
		
		int sumStream = num.stream()
				.filter(i -> i%2==0)
		        .map(n -> n*2)
		        .reduce(0, (j,k)->j+k);
		
		System.out.println(sumStream);
	
	}

}
