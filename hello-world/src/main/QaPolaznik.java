package main;

public class QaPolaznik {

	String firstName;
	String lastName;
	String idNumber;
	int grade;

	public QaPolaznik() {

	}

	public QaPolaznik(String firstName, String lastName, String idNumber, int grade) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
		this.grade = grade;

	}

	boolean hasPassed() {
		if (grade < 6) {
			return false;
		} else {
			return true;
		}
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + grade;
		result = prime * result + ((idNumber == null) ? 0 : idNumber.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
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
		QaPolaznik other = (QaPolaznik) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (grade != other.grade)
			return false;
		if (idNumber == null) {
			if (other.idNumber != null)
				return false;
		} else if (!idNumber.equals(other.idNumber))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "QaPolaznik [firstName=" + firstName + ", lastName=" + lastName + ", idNumber=" + idNumber + ", grade="
				+ grade + "]";
	}
	
	
}
