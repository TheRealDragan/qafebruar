package principi.oop;

public class Student extends Person{
	
	private int grade;

	public Student(String firstName, String lastName, String identityNumber) {
		super(firstName, lastName, identityNumber);
	}

	public Student(String firstName, String lastName, String identityNumber, int grade) {
		super(firstName, lastName, identityNumber);
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [grade=" + grade + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	
	

}
