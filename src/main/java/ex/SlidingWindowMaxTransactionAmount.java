package main.java.ex;

import java.util.ArrayList;
import java.util.List;

public class SlidingWindowMaxTransactionAmount {

	public static void main(String[] args) {
		
		List<Integer> finalTransAmt = new ArrayList<>();
		int[] tranAmt = {100,200,300,150,400};
		int k = 3;
		for (int i = 0; i <= tranAmt.length - k; i++) {
            int temp = tranAmt[i];
            for (int j = i; j < i + k; j++) {
                if (tranAmt[j] > temp) {
                    temp = tranAmt[j];
                }
            }
            finalTransAmt.add(temp);
        }
        System.out.println(finalTransAmt); 
		
		
		

	}

}
