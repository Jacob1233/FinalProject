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
		start();
		menu();

		input.close();
	}

	public static void printStudents(List<Student> students) {
		for (int i = 0; i < students.size(); i++) {
			System.out.print(students.get(i).firstName);
			System.out.print(" ");
			System.out.print(students.get(i).lastName);
			System.out.print(", ");
		}
		System.out.print("\n");
	}

	public static void printTeachers(List<Teacher> teachers) {
		for (int i = 0; i < teachers.size(); i++) {
			System.out.print(teachers.get(i).firstName);
			System.out.print(" ");
			System.out.print(teachers.get(i).lastName);
			System.out.print(", ");
		}
		System.out.print("\n");
	}

	public static void printCourses(List<Course> courses) {
		for (int i = 0; i < teachers.size(); i++) {
			System.out.print(courses.get(i).getName());
		}
		System.out.print("\n");
	}

	public static void createStudents() {
		System.out.print("How many students you like to enter? ");
		int n = input.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter student " + (i + 1) + " info:");
			System.out.print("Enter the first name: ");
			String f = input.next();
			System.out.print("Enter the last name: ");
			String l = input.next();
			Student s = new Student(f, l);
			students.add(s);
		}
	}

	public static void createTeacher() {
		System.out.print("How many teachers you like to enter? ");
		int n = input.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter teacher " + (i + 1) + " info:");
			System.out.print("Enter the first name: ");
			String f = input.next();
			System.out.print("Enter the last name: ");
			String l = input.next();
			Teacher s = new Teacher(f, l);
			teachers.add(s);
		}
	}

	public static void createCourse() {
		List<Student> availableStudents = students;
		List<Student> chosenStudents = new ArrayList<Student>();
		List<Teacher> availableTeachers = teachers;
		Teacher chosenTeacher = null;

		System.out.print("How many students would you like to add? ");
		int n = input.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Available Students: ");
			printStudents(availableStudents);
			System.out.println("Choosen Students:");
			printStudents(chosenStudents);

			System.out.println("Enter a student last name to add:");
			String s = input.next();
			for (int j = 0; j < availableStudents.size(); j++) {
				if (s.equals(availableStudents.get(j).lastName)) {
					chosenStudents.add(availableStudents.get(j));
					availableStudents.remove(j);
				}
			}
		}

		System.out.println("Pick a teacher last name to add: ");
		printTeachers(availableTeachers);
		String t = input.next();
		for (int j = 0; j < availableTeachers.size(); j++) {
			if (t.equals(availableTeachers.get(j).lastName)) {
				chosenTeacher = availableTeachers.get(j);
				availableTeachers.remove(j);
			}
		}

		System.out.print("Enter a name for the course: ");
		String cn = input.next();

		Course c = new Course(cn, chosenStudents, chosenTeacher);
		courses.add(c);
	}

	public static void start() {
		System.out.println("School System 1.0");
		System.out.println("Micheal Uwaeke & Jacob Wilson");
		System.out.println("");
	}

	public static void menu() {
		boolean stop = false;

		while (stop == false) {
			System.out.println("What would you like to do?");
			System.out.println("1 - Create a Student");
			System.out.println("2 - Create a Teacher");
			System.out.println("3 - Create a Class");
			System.out.println("4 - View Students");
			System.out.println("5 - View Course");
			int choice = input.nextInt();

			switch (choice) {
			case 1:
				createStudents();
				break;
			case 2:
				createTeacher();
				break;
			case 3:
				createCourse();
				break;
			case 4:
				printStudents(students);
				break;
			case 5:
				printCourses(courses);
				break;
			default:
				System.out.println("Not a valid choice.");
				break;
			}

		}
	}

}
