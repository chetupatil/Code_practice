package main.java.ex;

public class DetectDuplicateTransactions {

	public static void main(String[] args) {
		
		String[] trx = {"TXN100","TXN101"};
		
		boolean isDuplicate =false;
		for(int i=0;i<trx.length;i++) {
			for(int j = i+1; j<trx.length; j++) {
				if(trx[i].equals(trx[j])) {
					isDuplicate = true;
					break;
				}
			}
		}
		System.out.println(isDuplicate);

	}

}
