package StreamApo;

public class InserationSortEx {

	public static void main(String[] args) {
		
		int[] num = {8, 3, 5, 2};
		
		for(int i=1;i<num.length;i++) {
			int key = num[i];
			int j=i-1;
			
			while(j>=0 && num[j]>key) {
				//System.out.println("Inside loop "+num[j]+" "+num[i]);
				num[j+1] = num[j];
				j--;
			}
			num[j+1] = key;
	        	
		}
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		

	}

}
