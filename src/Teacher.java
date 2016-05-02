import java.util.UUID;

public class Teacher extends AbstractPerson {
	public UUID teacherID;

	public Teacher(String lastName, String firstName) {
		super(lastName, firstName);
		makeID();
	}
	
	private void makeID() {
		teacherID = UUID.randomUUID();
	}

}
