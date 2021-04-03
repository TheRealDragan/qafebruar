package domaci;


	import java.util.ArrayList;
	import java.util.HashSet;
	import java.util.List;
	import java.util.Set;

	public class IntersectionTwoListsOfInteger {

		public static void main(String[] args) {

			List<Integer> firstListOfInteger = new ArrayList<Integer>();
			List<Integer> secondListOfInteger = new ArrayList<Integer>();

			firstListOfInteger.add(11);
			firstListOfInteger.add(12);
			firstListOfInteger.add(13);
			firstListOfInteger.add(14);
			firstListOfInteger.add(15);
			firstListOfInteger.add(16);

			secondListOfInteger.add(12);
			secondListOfInteger.add(14);
			secondListOfInteger.add(16);
			secondListOfInteger.add(18);
			secondListOfInteger.add(20);
			secondListOfInteger.add(22);

			commonElementsOfIntegerLists(firstListOfInteger, secondListOfInteger);

			System.out.println(commonElementsOfIntegerLists(firstListOfInteger, secondListOfInteger));
		}

		public static Set<Integer> commonElementsOfIntegerLists(List<Integer> firstList, List<Integer> secondList) {

			Set<Integer> intersectionFirstAndSecondList = new HashSet<Integer>();
			intersectionFirstAndSecondList.addAll(firstList);
			intersectionFirstAndSecondList.retainAll(secondList);

			return intersectionFirstAndSecondList;

		}

	}


