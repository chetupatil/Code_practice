package StreamApo;

import java.util.Scanner;

class FileCall{

	void mainMethod() throws Exception {
		try {
			method1();
		}catch(ClassNotFoundException e) {
			throw new Exception(e.getMessage());
		}
	}

	void method1() throws ClassNotFoundException {
		Class.forName("Chetana");
	}
}


public class ExceptionEx {

	public static void main(String[] args) throws Exception {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the name");
		
		String name = s.next();
		
		
		System.out.print(name);
		
		try {
			
		}
		catch(ArithmeticException e){
		}
		catch(Exception e){
		}
		finally {
		
			
		}
		
//		FileCall fc = new FileCall();
//		
//		fc.mainMethod();

		//		int i = 0;
		//		int j = 0;
		//		String str = null;
		//		int[] ar = {1,2,3,4,5};
		//
		//		try {
		//			// j = 7/i;
		//	     //  	System.out.println(j);
		//		    System.out.println(ar[2]);
		//		    System.out.println(str.length());
		//		}
		//		catch(ArithmeticException e) {
		//			System.out.println("Got exception : "+e.getMessage());
		//		}catch(ArrayIndexOutOfBoundsException ex) {
		//			System.out.println("Got exception : "+ex.getMessage());
		//		}catch(Exception e) {
		//			System.out.println("Something went wrong : "+e.getMessage());
		//		}


		//		String s = null;
		//		try {
		//			s.length();
		//		}catch(Exception ex) {
		//			throw new MyException(ex.getMessage());
		//			
		//		}

	}

}
