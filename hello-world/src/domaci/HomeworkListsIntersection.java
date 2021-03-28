package domaci;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeworkListsIntersection {

public static void main(String[] args) {
		
		List <Integer> firstIntegerList = new ArrayList<Integer>();	
		List <Integer> secondIntegerList = new ArrayList<Integer>();
	
	/*** Različit modela dodavanja u listu ***/
	
		firstIntegerList.addAll(Arrays.asList(1, 2, 3, 4, 2, 6));
		secondIntegerList.add(2);
		secondIntegerList.add(3);
		secondIntegerList.add(8);
		secondIntegerList.add(2);
		secondIntegerList.add(1);
		secondIntegerList.add(3);
	
		System.out.println(sameElementsInTwoLists(firstIntegerList, secondIntegerList));
	}

	/***  Set u metodi jer u slučaju duplikata brojeva u listi, neće izbacivati jedinstven presek ako se koristi List  ***/
	/***  Rade i jedna i druga metoda, ova sa Set verovatno brža, ne drlja kroz petlju   ***/
	
/*		public static Set<Integer> sameElementsInTwoLists(List <Integer> l1, List <Integer> l2) {
			
			Set <Integer> intersectionIntegerList = new HashSet<Integer>();
			intersectionIntegerList.addAll(l1);
			intersectionIntegerList.retainAll(l2);
	
			return intersectionIntegerList;		
	}
	
*/	
		public static List<Integer> sameElementsInTwoLists(List <Integer> l1, List <Integer> l2) {
	
		List <Integer> intersectionIntegerList = new ArrayList<Integer>();
		
		for(int i=0; i<l1.size(); i++) {
			for(int j=0; j<l2.size();j++) {
				if (l1.get(i) == l2.get(j) && !intersectionIntegerList.contains(l1.get(i))){		
					intersectionIntegerList.add(l1.get(i));
				}
			}	
		}
		
		return intersectionIntegerList;		
	}
}
