import java.util.UUID;

public class Teacher extends AbstractPerson {
	private UUID teacherID;
	
	public Teacher(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.teacherID = UUID.randomUUID();
	}
	
	public UUID getID(){
		return teacherID;
	}


}
