package main.java.program.StringEx;

public class PalindromeEx {

	public static void main(String[] args) {
		String palStr = "chetana";
		
		char[] palChar = palStr.toCharArray();
		
		String palRev = "";
		for(int i=palChar.length-1;i>=0;i--) {
			palRev+=palChar[i];
		}
		
		if(palStr.equals(palRev)) {
			System.out.println("String is palindrome : "+palStr);
		}else {
			System.out.println("String is not palindrome : "+palStr);
		}

	}

}
