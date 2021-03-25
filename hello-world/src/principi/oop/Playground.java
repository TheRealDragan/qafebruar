package principi.oop;

public class Playground {

	public static void main(String[] args) {
		Person person = new Person("Petar", "Novakovic", "Stagod");
		System.out.println(person.getFirstName());
		
		Student student = new Student("Dragana", "Bokun", "Stagod", 10);
		System.out.println(student);
		
		Lecturer lecturer = new Lecturer("Petar", "Novakovic", "Stagod", 1000000);
		System.out.println(lecturer);
		
		student.sayHi();
		lecturer.sayHi();
		
		Person newPerson = new Lecturer(); // - > U memorijsku lokaciju tipa Osoba mozemo upisati bilo kakvu klasu koja nasledjuje osobu
	//	Lecturer newLecturer = new Person(); // -> ovo ne moze jer imamo memorijsku lokaciju tipa Predavac i ona bismo mogli da smestimo osobu
		                                     // koja nije predavac
		

	}

}
