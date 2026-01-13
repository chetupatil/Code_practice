package main.java.program.oop;

public class InheritanceImp {

	public static void main(String[] args) {
		
		superClass sc = new superClass();
		sc.eat();
		sc.speak();
		
		EmployeePersonSubClass esc = new EmployeePersonSubClass();
		esc.eat();
		esc.speak();
		esc.work();
//		
//		employeePersonSubClass1 esc1 = new employeePersonSubClass1();
//		esc1.eat();
//		esc1.speak();
//		esc1.work();
		

	}

}

class superClass{
	 void speak() {
		 System.out.println("Person is speak to everyone...");
	 }
	 void eat() {
		 System.out.println("Person will eat the food");
	 }
	
}
class EmployeePersonSubClass extends superClass{
	
	void work() {
		System.out.println("Person will work in company");
	}
	
	@Override
	void eat() throws RuntimeException{
		 System.out.println("Person will eat the food and vomit");
	}
	
	
}
//class employeePersonSubClass1 extends EmployeePersonSubClass{
//	
//	@Override
//	void eat() {
//		System.out.println("Person will eat the food and vomit and feeling not well");
//	}
//	
//}
