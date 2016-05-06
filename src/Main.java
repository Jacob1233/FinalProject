import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<Student> students = new ArrayList<Student>();
		
		for (int i = 0; i < 3; i++) {
			System.out.print("Enter first name: ");
			String f = input.next();
			System.out.print("Enter last name: ");
			String l = input.next();
			Student s = new Student(f, l);
			students.add(s);
		}
		
		Collections.sort(students);
		
		for (int i = 0; i < students.size(); i++) {
			System.out.print(students.get(i).firstName);
			System.out.print(" ");
			System.out.print(students.get(i).lastName);
			System.out.print(" ");
			System.out.print(students.get(i).getID());
			System.out.print("\n");
		}
		
		input.close();
	}

}
