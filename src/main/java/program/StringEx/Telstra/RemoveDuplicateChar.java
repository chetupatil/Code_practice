package main.java.program.StringEx.Telstra;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		
		String str = "invigilation";
		String finStr = "";
		char[] c = str.toCharArray();
		for(int i=0;i<c.length;i++) {
			String rightStr = c[i]+"";
			if(finStr.contains(rightStr)) {
				
			}else {
				finStr = finStr+rightStr;
			}
		}
		System.out.println("Output : "+finStr);
	}

}
