import java.util.UUID;

public class Student extends AbstractPerson {
	public UUID studentID;

	public Student(String lastName, String firstName) {
		super(lastName, firstName);
		makeID();
	}
	
	private void makeID() {
		studentID = UUID.randomUUID();
	}

}
