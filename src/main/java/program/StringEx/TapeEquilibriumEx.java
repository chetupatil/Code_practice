package main.java.program.StringEx;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TapeEquilibriumEx {
	
	public static void main(String arg[]) {
		
		int[] arr = {1, 2, 3, 4, 5};
		List<Integer> listA = Arrays.stream(arr)
				.boxed().collect(Collectors.toList());	
		int sumN = 0;
		for(Integer n : listA) {
			sumN+=n;
		}
		int minDiff = Integer.MAX_VALUE;
		int leftCo = 0;
		for(Integer n : listA) {
			leftCo+=n;
			int rightCo = Math.abs(sumN-leftCo);
			int diff = Math.abs(leftCo-rightCo);
			if(diff<minDiff && diff!=0) {
				minDiff = diff;
			}
		}
		
		
		System.out.println(" Min difference Value : "+minDiff);
		
	}

}
