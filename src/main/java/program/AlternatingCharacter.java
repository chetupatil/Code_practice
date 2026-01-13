package main.java.program;

public class AlternatingCharacter {

	public static void main(String[] args) {
		String name = "AAABBA";
	//	char[] naCh = name.toCharArray();
		int deletionCount = 0;
		String temp = "";
		int index = 0;
		while(index>=0) {
			char[] naCh = null;
			if(temp!="") {
				naCh = temp.toCharArray();
				temp = "";
			}else {
				naCh = name.toCharArray();
			}
			for(int j=1;j<naCh.length;j++) {
				if(naCh[0]==naCh[j]) {
					deletionCount++;
					//index--;
				}else {
					temp+= naCh[j];
					//index++;	
				}
			}
			
			if(temp=="") {
				index = -1;
			}else {
				index++;
			}
			
			
		}
		//System.out.println(temp);
		System.out.println(deletionCount);
	}

}
