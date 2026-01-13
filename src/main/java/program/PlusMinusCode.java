package main.java.program;

import java.util.Arrays;
import java.util.List;

public class PlusMinusCode {

	public static void main(String[] args) {
		Integer[] arrL = {-4, 3, -9, 0, 4, 1};
		List<Integer> arr = Arrays.asList(arrL);
		   float pNum=0;
		   float nNum=0;
		   float zNum=0;
	        int n =arr.size();
	    for(int i=0;i<arr.size();i++){
	        if(arr.get(i)>0){
	            pNum++;
	            System.out.println(pNum);
	        }else if(arr.get(i)==0){
	            zNum++;
	        }else if(arr.get(i)<0){
	            nNum++;
	        }
	    }
	    System.out.println(pNum/n);
	    System.out.println(nNum/n);
	    System.out.println(zNum/n);
	}

}
