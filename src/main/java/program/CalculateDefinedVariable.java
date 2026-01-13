package main.java.program;

public class CalculateDefinedVariable {

	public static void main(String[] args) {
		
		enum number{Chetana,Patil};
		
		int x = 2;
		
		double v = Math.sqrt(x);
		
		double powNum = Math.pow(3, 2);
		
		long time = System.currentTimeMillis();
		
		
		String name = number.Chetana.name();
		
		name = name.trim();
		
		System.out.println(name);
		
		System.out.println(name.compareTo("patil"));
		
		System.out.println(name.substring(2,4));
		
		System.out.println(name.indexOf("ana"));
		
		System.out.println("Time : "+time);
		
		
		System.out.println(Math.sin(x));
		
		System.out.println(Math.exp(x));
		
		System.out.println(Math.random());
		
		
		System.out.println(powerRec(8,3));
		
		System.out.println(v);

		System.out.println(powNum);
	}
	
	
	static double powerRec(int base,int powV) {
		
		if(powV==1) {
			return base;
		}
		return base * powerRec(base,powV-1);
	}
	
	

}
