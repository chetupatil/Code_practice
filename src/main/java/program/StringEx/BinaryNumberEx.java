package main.java.program.StringEx;

public class BinaryNumberEx {

	public static void main(String[] args) {
		int N = 529;
		String binSt = Integer.toBinaryString(N);
		System.out.println(binSt);
		char[] binCh = binSt.toCharArray();
		int count = 0;
		int countBaUp = 0;
		boolean isCountFlag = false;
		for(int i=0;i<binCh.length;i++) {
			if(binCh[i]=='1') {
				if(countBaUp<count) {
					countBaUp = count;
				}
				count=0;
				isCountFlag = true;
			}else if(isCountFlag) {
				count++;
			}
		}
		System.out.println("Longest binary gap is : "+countBaUp);
	}
}
