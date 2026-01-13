package main.java.program;

public class XorOperatorCode {

	public static void main(String[] args) {
		String[] arrStr = {"Aakash Deep Hindoddi","Chetana Omkar Aakash Hindoddi","GrandPa"};

		int temp=0;
		String larStr = "";
		for(int i=1;i<arrStr.length;i++) {
			String str = arrStr[i];
			int size = str.toCharArray().length;
			
			if(size>temp) {
				temp = size;
				larStr = str;
			}
			
			
		}
		
		System.out.println("Longest Name : "+larStr);
	}

}
