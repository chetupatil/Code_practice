package main.java.program.StringEx;

public class FrogJumpEx {

	public static void main(String[] args) {
		int X = 7;
		
		System.out.println(frogJump(X));

	}
	
	public static int frogJump(int x) {
		
		if(x==1) {
			return 0;
		}
		return x+frogJump(x-1)+1;
		

	}

}
