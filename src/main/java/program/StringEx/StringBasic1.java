package main.java.program.StringEx;

public class StringBasic1 {
	// print even length words from string
	public static void main(String[] args) {
		
		String str = "I am geeks for geeks and a geek";
		String[] strArr = str.split(" ");
		for(int i=0;i<strArr.length;i++) {
			if(strArr[i].length()%2==0) {
				System.out.println(" Even length word : "+strArr[i]);
			}
		}
	}
}
