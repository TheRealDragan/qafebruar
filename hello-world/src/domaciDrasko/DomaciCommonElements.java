package domaciDrasko;

import java.util.ArrayList;
import java.util.List;

public class DomaciCommonElements {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(3);
		list1.add(5);
		list1.add(7);
		list1.add(9);
		list1.add(11);

		System.out.println("List 1: " + list1);

		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);

		System.out.println("List 2: " + list2);

		list1.retainAll(list2);

		System.out.println("Common Elements: " + list1);

	}

}
