package main.java.ex;

import java.util.HashSet;
import java.util.Set;

public class MergeSortedTransactionLogs {

	public static void main(String[] args) {
		int[][] trans = {{1,4,7},{2,5,8},{3,6,9}};
		
		Set<Integer> sortTrans = new HashSet<>();
		
		for(int i=0;i<trans.length;i++) {
			for(int j=0;j<trans[i].length;j++) {
				sortTrans.add(trans[i][j]);
			}
		}
		
		for(Integer in : sortTrans) {
			System.out.print(in +", ");
		}
		System.out.println();

	}

}
