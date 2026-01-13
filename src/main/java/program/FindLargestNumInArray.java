package main.java.program;

public class FindLargestNumInArray {

	public static void main(String[] args) {
		
		int[] arr = {2,5,9,3,8};
		int larTemp = findLargestNumInArray(arr);
		int smaTemp = findSmallestNumInArray(arr);
		System.out.println("Largest number in given array : "+larTemp);
		System.out.println("Smallest number in given array : "+smaTemp);
	}
	public static int findLargestNumInArray(int[] arr) {
		int larTemp = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>larTemp) {
				larTemp = arr[i];
			}
		}
		return larTemp;
	}
	public static int findSmallestNumInArray(int[] arr) {
		int smaTemp = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<smaTemp) {
				smaTemp = arr[i];
			}
		}
		return smaTemp;
	}

}
