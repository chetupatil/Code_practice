package StreamApo;

class calculator{
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	
	public double add(double a, int b) {
		return a+b;
	}
}

public class TestEx {

	public static void main(String[] args) {
		
		calculator cal = new calculator();
		int sum = cal.add(2, 3);	
		System.out.println(sum);
		int sum1 = cal.add(2, 3,4);	
		System.out.println(sum1);
		double sum2 = cal.add(2.5, 3);	
		System.out.println(sum2);
		
		
	}

}
