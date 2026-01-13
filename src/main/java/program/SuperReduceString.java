package main.java.program;

public class SuperReduceString {

	public static void main(String[] args) {
		String redString = "aaabccddd";
		char[] redChar = redString.toCharArray();
		
		for(int i=0; i<redChar.length;i++) {
			
			if(redChar[i]==redChar[i+1]) {
			System.out.println("Removed : "+redChar[i]);
			}
		}

	}

}
