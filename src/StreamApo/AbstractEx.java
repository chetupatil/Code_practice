package StreamApo;


abstract class car{
	
	//abstract void drive();
	
	void playMusic() {
		System.out.println("Play music");
	}
}

class toyota extends car
{
	void drive() {
		System.out.println(" I am driving ...... ");
	}
	
}

public class AbstractEx {

	public static void main(String[] args) {
		car c = new toyota();
		
//	c.drive();

	}

}
