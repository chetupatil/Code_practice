package main.java.program.recursive;

public class RecursiveCode1 {

	public static void main(String[] args) {
		int totalAdd = recursiveAdd(5);
		System.out.println(totalAdd);

	}
	
	
	static int recursiveAdd(int n) {
		if(n==0) {
			return 1;
		}
		return n * recursiveAdd(n-1);
	}

}
