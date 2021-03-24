package domaciBoris;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Common_Element {

	public static void main(String[] args) {

		List<Integer> myList = new ArrayList<Integer>();

		myList.add(6);
		myList.add(4);
		myList.add(8);
		myList.add(9);

		List<Integer> mySecondList = new ArrayList<Integer>();

		mySecondList.add(6);
		mySecondList.add(4);
		mySecondList.add(10);
		mySecondList.add(11);

		myList.retainAll(mySecondList);

		System.out.println(myList);

		System.out.println("Druga metoda");

		List<Integer> result = myList.stream().distinct().filter(mySecondList::contains).collect(Collectors.toList());

		result.forEach(System.out::print);

	}

}
