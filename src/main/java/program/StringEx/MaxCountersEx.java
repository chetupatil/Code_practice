package main.java.program.StringEx;

public class MaxCountersEx {

	public static void main(String[] args) {
		
		int N=5;
		
		int[] counter = new int[N];
		int[] arr = {3, 4, 4, 6, 1, 4, 4};
		int max = 0;
		int base = 0;
	
		for(int n:arr) {
			if(n>=1 && n<=N) {
				counter[n-1] = Math.max(counter[n-1], base)+1;
				max = Math.max(max, counter[n-1]);
			}else {
				base = max;
			}
		}
		for (int i = 0; i < N; i++) {
			counter[i] = Math.max(counter[i], base);
		}
		
		for (int i = 0; i < counter.length; i++) {
			System.out.print(counter[i]+" ");
		}
		System.out.println();
		
		

		
		
	}

}
