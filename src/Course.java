import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Course {
	private String courseName;
	private UUID courseID;
	private Teacher instructor;
	private List<Student> roster = new ArrayList<Student>();
	
	public Course(String courseName, Teacher instructor, List<Student> roster) {
		this.courseName = courseName;
		this.instructor = instructor;
		makeID();
	}
	
	private void makeID() {
		courseID = UUID.randomUUID();
	}
	public String getCourseName(){
		return courseName; 
	}
	public UUID getCourseID(){
		return courseID;
	}
	public Teacher getinstructor(){
		return instructor;
	}

}
