package main.java.program;

public class PrincipalSumCode {

	public static void main(String[] args) {
	   int[][] matrixArr = {{6,7,3,4},{8,9,2,1},{1,2,9,6},{6,5,7,2}};
	   int principalDiggonal = 0;
	   int secondaryDiggonal = 0;
	   for(int i=0;i<matrixArr.length;i++) {
		   for(int j=0;j<matrixArr.length;j++) {
			   if(i==j) {
				   principalDiggonal+=matrixArr[i][j];
			   }
		   }
	   }
	   
	   System.out.println("Principal Diagonal : "+principalDiggonal);
	   
	   for(int i=0;i<matrixArr.length;i++) {
		   for(int j=0;j<matrixArr.length;j++) {
			   if((i+j)==matrixArr.length-1) {
				   secondaryDiggonal+=matrixArr[i][j];
			   }
		   }
	   }
	   System.out.println("Secondary Diagonal : "+secondaryDiggonal);
	   
	   int size = matrixArr.length/2;
	   for(int i=1;i<=size; i++) {
		   for(int j=1;j<=size;j++) {
			   System.out.print(" "+matrixArr[i][j]);
		   }
		   System.out.println();
	   }
	   
	}

}
