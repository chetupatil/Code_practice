package JavaExam;

import java.io.Serializable;

public class UserDto implements Serializable{
	
	transient int id;
	String name;
	String email;

}
