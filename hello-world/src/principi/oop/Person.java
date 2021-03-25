package principi.oop;

public class Person {
	
	private String firstName;
	private String lastName;
	private String identityNumber;
	
	public Person() {
		
	}
	
	public Person(String firstName, String lastName, String identityNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
	}
	
	public void sayHi() {
		System.out.println("Cao ja se zovem "+firstName+" a prezivam "+lastName);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
	

}
