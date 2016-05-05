import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		List<AbstractPerson> people = new ArrayList<AbstractPerson>();

	for (int i = 0;i < 2; i++) {
		System.out.print("First name: ");
		String fname = input.next();
		System.out.print("Last name: ");
		String lname = input.next();
		Student j = new Student(lname, fname);
		people.add(j);
	}
	
	Teacher k = new Teacher("joe", "harry");
	
	Course c = new Course("course one", k, people);
	
	
	
	System.out.print(c.getCourseName());
		
	}

}
