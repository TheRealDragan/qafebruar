package main;

public class Child {
	
	String firstName;
	String lastName;
	Human parent;
	
	public Child() {
		
	}
	
	public Child(String firstName, String lastName, Human parent) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.parent = parent;
	}

	@Override
	public String toString() {
		return "Child [firstName=" + firstName + ", lastName=" + lastName + ", parent=" + parent + "]";
	}
	
	
	

}
