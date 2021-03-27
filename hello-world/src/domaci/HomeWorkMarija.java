package domaci;

import java.util.ArrayList;
import java.util.List;

public class HomeWorkMarija {

	public static void main(String[] args) {
		List<Integer> listOfNumbers1 = new ArrayList<Integer>();
		listOfNumbers1.add(1);
		listOfNumbers1.add(2);
		listOfNumbers1.add(3);
		listOfNumbers1.add(4);
		listOfNumbers1.add(5);
		
		List<Integer> listOfNumbers2 = new ArrayList<Integer>();
		listOfNumbers2.add(2);
		listOfNumbers2.add(4);
		listOfNumbers2.add(6);
		listOfNumbers2.add(8);
		
		
		crossSectionOfTheLists(listOfNumbers1, listOfNumbers2);


	}
	private static void crossSectionOfTheLists (List<Integer> list1, List<Integer> list2) {
		System.out.println("The cross section of the list consists of elements: ");
		boolean cross = false;
		for(Integer element1 : list1) {
			for(Integer element2 : list2) {
				if(element1==element2) {
					cross = true;
					System.out.println(element1);
				}
					
			}
		}
		if (cross==false) {
			System.out.println("there are no elements");
		}

	}

}
