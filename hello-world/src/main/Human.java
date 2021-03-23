package main;

 class Human {
	
	String firstName;
	String lastName;
	String identityNumber;
	Child child;
	
	 Human() {
		int i;
	 }
	 
	 Human(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	

 void sayMyName() {
	System.out.println("My name is " + firstName + " " + lastName);
}
 
 String getFirstName() {
	 return firstName;
 }

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((identityNumber == null) ? 0 : identityNumber.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Human other = (Human) obj;
	if (identityNumber == null) {
		if (other.identityNumber != null)
			return false;
	} else if (!identityNumber.equals(other.identityNumber))
		return false;
	return true;
}




 
 

}
