package domaci;
import java.util.*;

public class RemoveNumbersLargerThanNFromAList {

	public static void main(String[] args) {
		List<Integer> input = new ArrayList<Integer>();
		input.add(7);
		input.add(15);
		input.add(4);
		input.add(2);
		input.add(33);
		input.add(22);
		input.add(11);
		input.add(10);
		input.add(15);
		input.add(14);
		
		removeNumbersLargerThanN(input, 11);
		
		System.out.println(input);


	}
	
	private static void removeNumbersLargerThanN(List<Integer> list, int n) {
		for (int i=0; i<list.size(); i++) {
			if (list.get(i) > n) {
				list.remove(list.get(i));
			}
		}
	}

}
