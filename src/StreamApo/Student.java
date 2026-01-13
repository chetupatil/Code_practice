package StreamApo;

public class Student implements Comparable<Student> {
	
	private String name;
	private String colleageName;
	private Integer id;
	
	
	
	@Override
	public int compareTo(Student o) {
		
		if(o.id>id) {
			return 1;
		}
		
		
		return -1;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getColleageName() {
		return colleageName;
	}



	public void setColleageName(String colleageName) {
		this.colleageName = colleageName;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}
	

}
