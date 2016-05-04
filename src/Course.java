import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Course {
	public String courseName;
	public UUID courseID;
	public Teacher instructor;
	public List<Student> roster = new ArrayList<Student>();
	
	public Course(String courseName, Teacher instructor, List<Student> roster) {
		this.courseName = courseName;
		this.instructor = instructor;
		makeID();
	}
	
	private void makeID() {
		courseID = UUID.randomUUID();
	}

}
