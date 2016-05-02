import java.util.UUID;

public class Course {
	public String courseName;
	public UUID courseID;
	public Teacher instructor;
	
	public Course(String courseName, Teacher instructor) {
		this.courseName = courseName;
		this.instructor = instructor;
		makeID();
	}
	
	private void makeID() {
		courseID = UUID.randomUUID();
	}

}
