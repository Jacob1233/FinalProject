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
		
		createStudents();
		createTeacher();
		createCourse();
		
		printCourses(courses);

		input.close();
	}

	public static void printStudents(List<Student> students) {
		for (int i = 0; i < students.size(); i++) {
			System.out.print(students.get(i).firstName);
			System.out.print(" ");
			System.out.print(students.get(i).lastName);
			System.out.print(", ");
		}
	}

	public static void printTeachers(List<Teacher> teachers) {
		for (int i = 0; i < teachers.size(); i++) {
			System.out.print(teachers.get(i).firstName);
			System.out.print(" ");
			System.out.print(teachers.get(i).lastName);
			System.out.print(", ");
		}
	}
	
	public static void printCourses(List<Course> courses) {
		for (int i = 0; i < teachers.size(); i++) {
			System.out.print(courses.get(i).getName());
		}
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
			System.out.print("Available Students: ");
			printStudents(availableStudents);
			System.out.println("Choosen Students:");
			printStudents(chosenStudents);

			System.out.println("Enter a student to add:");
			String s = input.nextLine();
			for (int j = 0; j < availableStudents.size(); j++) {
				if (s.equals(availableStudents.get(j).firstName + availableStudents.get(j).lastName)) {
					chosenStudents.add(availableStudents.get(j));
					availableStudents.remove(j);
				}
			}
		}
		
		printTeachers(availableTeachers);
		System.out.print("Pick a teacher to add: ");
		String t = input.nextLine();
		for (int j = 0; j < availableTeachers.size(); j++) {
			if (t.equals(availableTeachers.get(j).firstName + " " + availableTeachers.get(j).lastName)) {
				chosenTeacher = availableTeachers.get(j);
				availableTeachers.remove(j);
			}
		}

		System.out.print("Enter a name for the course: ");
		String cn = input.nextLine();
		
		Course c = new Course(cn, chosenStudents, chosenTeacher);

	}

}
