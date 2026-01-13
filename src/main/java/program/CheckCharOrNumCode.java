package main.java.program;

import java.util.Scanner;

public class CheckCharOrNumCode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String Value to check Char Count : ");
		String str = sc.nextLine();
		char[] strCh = str.toCharArray();
		String tempStr = "";
		for(int i=0;i<strCh.length;i++) {
			if((strCh[i]>='a' && strCh[i]<='z') || (strCh[i]>='A' && strCh[i]<='Z')) {
				String temp = strCh[i]+"";
				if(!tempStr.contains(temp)) {
				tempStr += ""+strCh[i];
				}
			}
		}
		
		System.out.println("Final String : "+tempStr);
	}
}
