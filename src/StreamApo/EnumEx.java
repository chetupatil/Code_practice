package StreamApo;

enum Status{
	Ready("ready",100),
	inprogress("inprogress",101),
	hold("hold",102),
	success("success",103),
	failed("failed",104);
	
	private  String name;
	private  int value;
	
	Status(String name, int value){
		this.name = name;
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	public int getValue() {
		return value;
	}
	
}

public class EnumEx {

	public static void main(String[] args) {
		int value = Status.hold.getValue();
		
		System.out.println(value);
		
	}

}
