package main.java.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MiniMaxSum {

	public static void main(String[] args) {
		Integer[] a = {1,2,3,4,5};
		List<Integer> arr = Arrays.asList(a);
		int iArr = 0;
	     int max = 0;
	     int min = 0;
	     List<Integer> finArr = new ArrayList<>();
	     while(iArr<=arr.size()-1){
	        int temp = 0;
	        for(int i=0;i<arr.size();i++){
	            if(iArr!=i){
	                temp+=arr.get(i);
	            }
	        }
	        finArr.add(temp);
	        iArr++;
	     }
	     min = finArr.get(0);
	     max = min;
	     for(int j=1;j<finArr.size();j++){
	        if(finArr.get(j)>max){
	            max = finArr.get(j);
	        }
	        if(finArr.get(j)<min){
	            min = finArr.get(j);
	        }  
	     }
	     System.out.print(min);
	     System.out.print(" ");
	     System.out.print(max);
	     System.out.println();

	}

}
