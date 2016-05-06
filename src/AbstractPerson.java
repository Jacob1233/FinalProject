
public abstract class AbstractPerson implements Comparable<AbstractPerson>{
	protected String firstName;
	protected String lastName;
	
	public int compareTo(AbstractPerson person) {
		AbstractPerson compareTo = (AbstractPerson)person;
		if (this.lastName.compareToIgnoreCase(compareTo.lastName) < 0) {
			return -1;
		} else if (this.lastName.compareToIgnoreCase(compareTo.lastName) > 0) {
			return 1;
		} else {
			return 0;
		}
	}
}
