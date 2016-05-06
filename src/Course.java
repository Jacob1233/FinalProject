import java.util.List;

public class Course {
	private String name;
	private List<Student> roster;
	private Teacher teacher;
	
	public Course(String name, List<Student> roster, Teacher teacher) {
		this.name = name;
		this.roster = roster;
		this.teacher = teacher;
		
		for (int i = 0; i < roster.size(); i++) {
			roster.get(i).addCourse(this);
		}
		
		teacher.addCourse(this);
	}
	
	public String getName() {
		return name;
	}
	
	public List<Student> getRoster() {
		return roster;
	}
	
	public Teacher getTeacher() {
		return teacher;
	}
	
	public void addStudent(Student student) {
		roster.add(student);
		student.addCourse(this);
	}
	
	public int compareTo(Course course) {
		Course compareTo = (Course)course;
		if (this.name.compareToIgnoreCase(compareTo.name) < 0) {
			return -1;
		} else if (this.name.compareToIgnoreCase(compareTo.name) > 0) {
			return 1;
		} else {
			return 0;
		}
	}
	
}
