package domaci;


import java.util.HashSet;
import java.util.Set;

public class HomeWorkNikolaListIntersection {

	public static void main(String[] args) {
		

		 Set<Integer> setOfNumbers1 = new HashSet <Integer>();
		 Set<Integer> setOfNumbers2 = new HashSet <Integer>();
		 
		 setOfNumbers1.add(1);
		 setOfNumbers1.add(2);
		 setOfNumbers1.add(3);
		 setOfNumbers1.add(5);
		 setOfNumbers1.add(6);
		 
		 setOfNumbers2.add(2);
		 setOfNumbers2.add(3);
		 setOfNumbers2.add(8);
		 
		 
		 setOfNumbers1.retainAll(setOfNumbers2);
		 System.out.println(setOfNumbers1);
		 
		
		
		
	}

	 
}
