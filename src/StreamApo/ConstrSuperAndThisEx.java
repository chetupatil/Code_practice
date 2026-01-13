package StreamApo;


class a{
	
	int add(int n1,int n2) {
		return n1+n2;
	}
	
}

class b extends a{
	
	b(){
		super();
	}
	
	int add(int n1,int n2) {
		return n1+n2+1;
	}
	
}

public class ConstrSuperAndThisEx {

	public static void main(String[] args) {
		
		b br = new b();
		System.out.println(br.add(2, 3));
		
	
	}

}
