package main.java.program;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO 153  -> 1*1*1 + 5*5*5 + 3*3*3 = yes, armStrong number
		
		
		Integer armNu = 153;
		
		Integer armNuF = armNu;
		
		int count = 3;
		
		Integer totalCount = 0;
		
		while(count>0) {
			
		int armNuRem = armNu % 10;
		
		armNu = armNu/10;
		
		System.out.println(armNuRem);
		
		totalCount+=multipleNum(armNuRem);
		
		count--;
		}
		
		
		if(armNuF.equals(totalCount)) {
			System.out.println(armNuF +" The Number is ArmStrong Number : !!!! "+totalCount);
		}else {
			System.out.println(armNuF +" The Number is Not ArmStrong Number : !!!! "+totalCount);
		}
		
		

	}
	
	static int multipleNum(int armNuRem) {
		
		return armNuRem*armNuRem*armNuRem;
		
	}

}
