import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Teacher extends AbstractPerson {
	private UUID teacherID;
//	private List<Course> courses =  new ArrayList<Course>();
	
	public Teacher(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.teacherID = UUID.randomUUID();
	}
	
	public UUID getID(){
		return teacherID;
	}
	
//	public List<Course> getCourses() {
//		return courses;
//	}
	
//	public void addCourse(Course course) {
//		courses.add(course);
//	}

}
