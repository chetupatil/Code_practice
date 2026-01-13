package main.java.program;

import java.util.Arrays;

public class TwoArraysIsEquOrNot {

	public static void main(String[] args) {
		
		int[] arr1 = {2,4,6};
		int[] arr2 = {2,4,6};
		
		boolean r = Arrays.equals(arr1, arr2);
		
		if (r) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
		
		if(arr1.length==arr2.length) {
			int size = arr1.length;
			int index = 0;
			int value = 0;
			while(size>0) {
				if(arr1[index]==arr2[index]) {
					value++;
				}
				index++;
				size--;
			}
			if(value == arr1.length) {
				System.out.println("Provided two arrays is eqaual");
			}else {
				System.out.println("Provided two arrays is not eqaual");
			}
		}else {
			System.out.println("Provided two arrays is not eqaual in size");
		}
	}

}
