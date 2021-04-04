package domaci;

import java.util.ArrayList;
import java.util.List;

public class IntersectionHomeworkDragana {

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(5);
		list1.add(6);
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(2);
		list2.add(3);
		list2.add(8);
		
		List<Integer> intersectionList = intersection(list1, list2);
		
		System.out.println(intersectionList);
		
	}

	public static List<Integer> intersection(List<Integer> list1, List<Integer> list2) {
		list1.retainAll(list2);
	
		return (list1);
		

	}

}
