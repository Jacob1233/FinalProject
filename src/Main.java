import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in);
	static List<Student> students = new ArrayList<Student>();
	static List<Teacher> teachers = new ArrayList<Teacher>();
	static List<Course> courses = new ArrayList<Course>();

	public static void main(String[] args) {
		System.out.println("School System 1.0");
		System.out.println("Micheal Uwaeke & Jacob Wilson 2016");
		System.out.println("Type '@quit' anytime to exit.");

		while (true) {
			System.out.println("\nMain menu: \n");
			System.out.println("Choice 1: Create a Student");
			System.out.println("Choice 2: Create a Teacher");
			System.out.println("Choice 3: Create a Course");
			System.out.println("Choice 4: View Student Details");
			System.out.println("Choice 5: View Teacher Details");
			System.out.println("Choice 6: View Course Details \n");
			System.out.print("Entry: ");
			String entry = input.nextLine();

			checkEsc(entry);

			int x;

			try {
				x = Integer.parseInt(entry);
			} catch (Exception e) {
				x = 0;
			}

			switch (x) {
			case 1:
				createStudent();
				break;
			case 2:
				createTeacher();
				break;
			case 3: 
				createCourse();
				break;
			case 4:
				viewStudentDetails();
				break;
			case 5:
				viewTeacherDetails();
				break;
			case 6:
				viewCourseDetails();
				break;
			default:
				System.out.println("Not a valid choice. \n");
				break;
			}
			

		}

	}

	public static void checkEsc(String txt) {
		if (txt.equals("@quit")) {
			System.exit(0);
		}
	}
	
	public static void createStudent() {
		System.out.println("Create a student: \n");
		
		System.out.println("Enter the student's first name. \n");
		System.out.print("Entry: ");
		String fname = input.nextLine();
		checkEsc(fname);
		
		System.out.println("Enter the student's last name. \n");
		System.out.print("Entry: ");
		String lname = input.nextLine();
		checkEsc(fname);
		
		Student s = new Student(fname, lname);
		students.add(s);
		Collections.sort(students);
	}
	
	public static void createTeacher() {
		System.out.println("Create a Teacher: \n");
		
		System.out.println("Enter the teacher's first name. \n");
		System.out.print("Entry: ");
		String fname = input.nextLine();
		checkEsc(fname);
		
		System.out.println("Enter the teacher's last name. \n");
		System.out.print("Entry: ");
		String lname = input.nextLine();
		checkEsc(fname);
		
		Teacher t = new Teacher(fname, lname);
		teachers.add(t);
		Collections.sort(teachers);
	}
	
	public static void viewStudentDetails() {
		System.out.println("View Student Details \n");
		
		for(int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i).firstName + " " + students.get(i).lastName + ": " + students.get(i).getID());
		}
		
	}
	
	public static void viewTeacherDetails() {
		System.out.println("View Student Details \n");
		
		for(int i = 0; i < teachers.size(); i++) {
			System.out.println(teachers.get(i).firstName + " " + teachers.get(i).lastName + ": " + teachers.get(i).getID());
		}
		
	}
	
	public static void createCourse() {
		List<Student> roster = new ArrayList<Student>();
		Teacher t = null;
		System.out.println("Create a course \n");
		System.out.println("How many students are in this course?");
		System.out.print("Entry: ");
		String n = input.nextLine();
		
		checkEsc(n);

		int x;

		try {
			x = Integer.parseInt(n);
		} catch (Exception e) {
			x = 0;
		}
		
		
		
		for(int i = 0; i < x; i++) {
			System.out.println("Enter Student " + i + "'s Last Name:");
			System.out.print("Entry: ");
			String l = input.nextLine();
			checkEsc(l);
			
			for(int k = 0; k < students.size(); k++) {
				if (students.get(k).lastName.equals(l)) {
					roster.add(students.get(k));
				}
			}
		}
		
		System.out.println("Enter a Teacher's Last Name:");
		System.out.print("Entry: ");
		String l = input.nextLine();
		checkEsc(l);
		for(int i = 0; i < teachers.size(); i++) {
			if (teachers.get(i).lastName.equals(l)) {
				t = teachers.get(i);
			}
		}
		
		System.out.println("Enter a name for the course:");
		System.out.print("Entry: ");
		String m = input.nextLine();
		checkEsc(m);
		
		try {
			Course y = new Course(m, roster, t);
			courses.add(y);
		} catch (Exception e) {
			System.out.println("The Course was unable to be made. ");
		}
		
	}
	
	public static void viewCourseDetails() {
		System.out.println("View Course Details: \n");
		for(int i = 0; i < courses.size(); i++) {
			System.out.println(courses.get(i).getName() + " has " + courses.get(i).getRoster().size() + " students.");
		}
	}
}
