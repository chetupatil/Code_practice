package StreamApo;


interface aex{
	
	void show();
}

interface bex{
	
	void config();
	
}
class ab implements aex,bex{


	public void config() {
		System.out.println("hello config the code : ");
	}


	public void show() {
		System.out.println("hello show the code : ");
		
	}
	
}


public class InterfaceEx {

	public static void main(String[] args) {
		aex abref = new ab();
		//abref.config();
		abref.show();

	}

}
