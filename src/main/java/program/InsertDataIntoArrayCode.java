package main.java.program;

public class InsertDataIntoArrayCode {

	public static void main(String[] args) {
		int[] arr = {3,5,1,2,4,7,8,9};
		int[] arrNew = new int[9];
		int value = 6;
		int index = 2;
		
		for(int i=0;i<=index;i++) {
			arrNew[i]=arr[i];
		}
		arrNew[index] = value;
		for(int i=index;i<arr.length;i++) {
			arrNew[i+1]=arr[i];
		}
		for(int i=0;i<arrNew.length;i++) {
			System.out.print(" "+arrNew[i]);
		}
		System.out.println();
	}

}
