package main.java.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SudoCodeProgram {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		String[][] board = {
	            {"5", "3", ".", ".", "7", ".", ".", ".", "."},
	            {"6", ".", ".", "1", "9", "5", ".", ".", "."},
	            {".", "9", "8", ".", ".", ".", ".", "6", "."},
	            {"8", ".", ".", ".", "6", ".", ".", ".", "3"},
	            {"4", ".", ".", "8", ".", "3", ".", ".", "1"},
	            {"7", ".", ".", ".", "2", ".", ".", ".", "6"},
	            {".", "6", ".", ".", ".", ".", "2", "8", "."},
	            {".", ".", ".", "4", "1", "9", ".", ".", "5"},
	            {".", ".", ".", ".", "8", ".", ".", "7", "9"}
	        };
			for(int i=0;i<9; i++) {
				String[] subsetL = board[i];
				for(int j=0;j<subsetL.length;j++) {
					System.out.print(subsetL[j]);
				}
				System.out.println("  ");			
			}
			
//			List<Integer> lnistObj = Arrays.asList(1,2,3,4,5,6,7,8,9);
//			
//			lnistObj = lnistObj.stream()
//				.filter(i -> i%2 == 0).toList();
//			
//			for(int i=0;i<lnistObj.size();i++) {
//				Integer j = lnistObj.get(i);
//				System.out.println(j);
//			}
			
			
			

					
					
	
						

	}

}
