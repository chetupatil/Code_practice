package main.java.program.StringEx.Telstra;

import java.util.Stack;

public class StackBracketEx {

	public static void main(String[] args) {
		
		Stack<Character> stac = new Stack<>();
		String ip = "{[]}";
		char[] c = ip.toCharArray();
		boolean isValid = true;
		
		for(int i=0;i<c.length;i++) {
			if(c[i]=='(') {
				stac.push(')');
			}else if(c[i]=='[') {
				stac.push(']');
			}else if(c[i]=='{') {
				stac.push('}');
			}else if(stac.pop()!=c[i]) {
				isValid = false;
			}
		}
		
		System.out.println(ip + " is valid : "+isValid);

	}

}
