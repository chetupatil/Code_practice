package main.java.program.StringEx;

import java.util.HashSet;
import java.util.Set;

public class PermCheckEx {

	public static void main(String[] args) {
		int[] arr = {4, 1, 3, 2};
		Set<Integer> sArr = new HashSet<>();
		for(Integer n: arr) {
			if(n>0) {
				sArr.add(n);
			}
			
		}
		int permCheck=1;
		for(int i=1;i<sArr.size()+1;i++) {
			if(!sArr.contains(i)) {
				permCheck =0;
			}
		
		}
		System.out.println(""+permCheck);
	}
}
