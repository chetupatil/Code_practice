package main.java.program.StringEx;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class MissingIntegerEx {

	public static void main(String[] args) {
		
		int[] arr = {1, 3, 6, 4, 1, 2};
		Set<Integer> sArr = new HashSet<>();
		for(int n: arr) {
			if(n>0) {
				sArr.add(n);
			}
		}
		int missNumber = 0;
		for(int i=1;i<=sArr.size()+1;i++) {
			if(!sArr.contains(i)) {
				missNumber = i;
			}
		}
		if(missNumber==0) {
			missNumber = 1;
		}
		System.out.println(missNumber);
	}

}
