import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Student extends AbstractPerson{
	private UUID studentID;
	private List<Course> courses =  new ArrayList<Course>();
	
	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentID = UUID.randomUUID();
	}
	
	public UUID getID(){
		return studentID;
	}
	
	public List<Course> getCourses() {
		return courses;
	}
	
	public void addCourse(Course course) {
		courses.add(course);
	}

}
