package StreamApo;


 class mobile{
	 
	  String brand;
	  String price;
	  static String name;
	  
	  void show() {
		  System.out.println(brand +" : "+price+" : "+name);
	  }
	  
	 static void call() {
		 System.out.println(" I am getting call from unknown number : ");
	 }
	
}

public class StaticEx {

	public static void main(String[] args) {
		
		mobile m = new mobile();
		m.brand = "Apple";
		m.price = "2000";
		mobile.name = "Smart Phone";
		
		m.show();
		
		mobile m1 = new mobile();
		m1.brand = "SumSung";
		m1.price = "1000";
		//m1.name = "Smart Phone";
		
		m1.show();
		
		
		
		
		
		mobile.call();

	}

}
