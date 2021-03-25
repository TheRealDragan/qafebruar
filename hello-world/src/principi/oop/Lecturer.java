package principi.oop;

public class Lecturer extends Person {
	
	private int hourlyRate;
	
	public Lecturer() {
		
	}

	public Lecturer(String firstName, String lastName, String identityNumber) {
		super(firstName, lastName, identityNumber);
		// TODO Auto-generated constructor stub
	}

	public Lecturer(String firstName, String lastName, String identityNumber, int hourlyRate) {
		super(firstName, lastName, identityNumber);
		this.hourlyRate = hourlyRate;
	}

	@Override
	public String toString() {
		return "Lecturer [hourlyRate=" + hourlyRate + ", getFirstName()=" + getFirstName() + ", getLastName()="
				+ getLastName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	
	
	

}
