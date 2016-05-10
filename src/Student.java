import java.util.UUID;

public class Student extends AbstractPerson{
	private UUID studentID;
	
	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentID = UUID.randomUUID();
	}
	
	public UUID getID(){
		return studentID;
	}

}
