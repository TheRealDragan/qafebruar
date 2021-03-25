package domacialeks;

import java.util.HashSet;
import java.util.Set;

public class Homework {

	public static void main(String[] args) {

		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
        
		Set<Integer> set2 = new HashSet<Integer>();
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);

		//System.out.println(set1);
		//System.out.println(set2);
		
	//	Set<Integer> setS = new HashSet<>(set1);
		set1.retainAll(set2);     //presek
		//set1.addAll(Set2);      //unija
		//set1.removeAll(Set2);   //razlika  

		for (int i : set1) {
			System.out.println(i);
		}

	}

}

