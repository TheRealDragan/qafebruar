package main;

import java.util.ArrayList;
import java.util.List;

public class NullExceptionsDemo {

	public static void main(String[] args) {
	  QaPolaznik student = new QaPolaznik();
	  System.out.println(student.grade);
	  System.out.println(student.firstName);
	  
	  Human drasko = new Human("Drasko", "Radovanovic");
	  
	  
	  if (drasko.child!=null) {
		  System.out.println(drasko.child.firstName + " " + drasko.child.lastName);
	  }
	  System.out.println("Stigao sam ovde");
	  
	  marijinoPitanjeDemo();

	}

	
	
	private static void marijinoPitanjeDemo() {
		System.out.println("Usao sam u marijino pitanje demo");
		List<Human> humans= new ArrayList<Human>(); //umesto humans cete imati dohvatanje iz baze
		
       for (Human human : humans) {
    	   if (human.child!=null) {
    		   System.out.println(human.child.firstName + " " + human.child.lastName);
    	   }
       }
	}
}
