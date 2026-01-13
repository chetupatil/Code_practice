package StreamApo;

class human{
	
	private String name;
	private String number;
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getName() {
		return name;
	}
	
	public String getNumber() {
		return number;
	}
}

public class EnscapulaEx {

	public static void main(String[] args) {
		
		human h = new human();
		
		h.setName("Chetana Patil");
		h.setNumber("988999");
		
		System.out.println(h.getName()  + "  "+h.getNumber());
	
	

	}

}
