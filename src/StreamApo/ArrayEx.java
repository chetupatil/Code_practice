package StreamApo;

public class ArrayEx {

	public static void main(String[] args) {
		
//		int[] num = {5,6,7};
//		num[1] = 8;
//		
//		for(int i=0;i<num.length;i++) {
//			System.out.println(num[i]);
//		}
//		

		
		int[][] num = new int[3][4];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				num[i][j] = (int) (Math.random()*100);
			}
		}	
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(num[i][j]+" ");
			}
			System.out.println(" ");
		}
		
//		System.out.println(" *************** ");
//		
//		for(int[] n : num) {
//			for(int m : n) {
//				System.out.print(m+" ");
//			}
//			System.out.println(" ");
//		}
		
		// jagged array
        int[][] num1 = new int[3][];
        
        num1[0] = new int[2];
        num1[1] = new int[3];
        num1[2] = new int[5];
		
		for(int i=0;i<num1.length;i++) {
			for(int j=0;j<num1[i].length;j++) {
				num1[i][j] = (int) (Math.random()*100);
			}
		}	
		
		for(int i=0;i<num1.length;i++) {
			for(int j=0;j<num1[i].length;j++) {
				System.out.print(num1[i][j]+" ");
			}
			System.out.println(" ");
		}
	}

}
