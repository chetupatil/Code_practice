package main.java.program;

import java.util.ArrayList;
import java.util.List;

public class BirthdayCakeCandles {

	public static void main(String[] args) {
		//int[] candles = {4,4,1,2};
		List<Integer> candles = new ArrayList<>();
		candles.add(4);
		candles.add(4);
		candles.add(1);
		candles.add(2);
//		int temp=0;
//		for(int i=0;i<candles.length;i++) {
//			if(candles[i]>temp) {
//				temp = candles[i];
//			}
//			
//		}
//		int count = 0;
//		for(int i=0;i<candles.length;i++) {
//			if(temp == candles[i]) {
//				count++;
//			}
//		}
		
		int max = Integer.MIN_VALUE;
	       for(int i = 0 ;i<candles.size();i++){
	             if(max<candles.get(i)){
	                 max = candles.get(i); 
	                 i=0; 
	                 }
		        if(max>candles.get(i)){
		             candles.remove(i); 
	                 i=0; 
	                 }
		        
			} 
		
		System.out.println("Highest Cake Candles : "+candles.size());
	}

}
