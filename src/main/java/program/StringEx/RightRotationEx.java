package main.java.program.StringEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RightRotationEx {

	public static void main(String[] args) {
		
		int[] arr1 = {1, 2, 3, 4};
		List<Integer> arr = Arrays.stream(arr1).boxed().toList();
		List<Integer> revArr = new ArrayList<>();
		int k=2;
		int c = k;
		while(k>0) {
			revArr.add(arr.get(arr.size()-k));
			k--;
		}
		
		for(int j=0;j<(arr.size()-c);j++) {
			revArr.add(arr.get(j));
		}
		for(int l=0;l<revArr.size();l++) {
			System.out.print(revArr.get(l)+"  ");
		}
		System.out.println();
	}
}
