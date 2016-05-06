import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in);
	static List<Student> students = new ArrayList<Student>();
	static List<Teacher> teachers = new ArrayList<Teacher>();
	
	public static void main(String[] args) {
		
		
		createStudents();
		printStudents();
		
		input.close();
	}

	public static void printStudents() {
		for (int i = 0; i < students.size(); i++) {
			System.out.println("Students");
			System.out.print(students.get(i).firstName);
			System.out.print(" ");
			System.out.print(students.get(i).lastName);
			System.out.print("\n");
		}
	}
	
	public static void printTeachers() {
		for (int i = 0; i < teachers.size(); i++) {
			System.out.println("Teachers");
			System.out.print(teachers.get(i).firstName);
			System.out.print(" ");
			System.out.print(teachers.get(i).lastName);
			System.out.print("\n");
		}
	}
	
	public static void createStudents() {
		System.out.print("How many students you like to enter? ");
		int n = input.nextInt();
		
		for (int i = 0; i < n; i ++) {
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
		
		for (int i = 0; i < n; i ++) {
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
		List<Student> availableStudents = new ArrayList<Student>();
		List<Student> chosenStudents = new ArrayList<Student>();
		List<Teacher> availableTeachers = new ArrayList<Teacher>();
		List<Teacher> chosenTeachers = new ArrayList<Teacher>();
	}
	
	
}
