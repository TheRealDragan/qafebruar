package main;

public class CondtitionalStatements {

	public static void main(String[] args) {
		
		printIfLargerThanFive(4);
		printIfLargerThanFive(5);
		printIfLargerThanFive(6);
		
		printWeekdayForOrdinalNumber(1);
		printWeekdayForOrdinalNumber(2);
		printWeekdayForOrdinalNumber(7);
		printWeekdayForOrdinalNumber(8);
		
		System.out.println("_______________________________________________");
		
		printWeekdayForOrdinalNumberUsingSwitch(1);
		printWeekdayForOrdinalNumberUsingSwitch(2);
		printWeekdayForOrdinalNumberUsingSwitch(7);
		printWeekdayForOrdinalNumberUsingSwitch(8);



	}
	
	private static void printIfLargerThanFive(int param) {
		
		boolean isLargerThanFive = param > 5;
		
		if (isLargerThanFive) {
			System.out.println(param);

		} else {
			System.out.println("Parametar nije veci od broja 5");
		}
	}
	
	private static void printWeekdayForOrdinalNumber(int param) {
		if (param == 1) {
			System.out.println("Monday");
		} else if (param == 2) {
			System.out.println("Tuesday");
		} else if (param == 3) {
			System.out.println("Wednesday");
		} else if (param == 4) {
			System.out.println("Thursday");
		} else 	if (param == 5) {
			System.out.println("Friday");
		} else 	if (param == 6) {
			System.out.println("Saturday");
		} else if (param == 7) {
			System.out.println("Sunday");
		} else {
			System.out.println("Prosledjeni broj nije validan");
		}
	}
	
	private static void printWeekdayForOrdinalNumberUsingSwitch(int param) {
	    switch (param) 	    {
	    	case 1:
	    		System.out.println("Monday");
	    		break;
	    	case 2:
	    		System.out.println("Tuesday");
	    		break;
	    	case 3:
	    		System.out.println("Wednesday");
	    		break;
	    	case 4:
	    		System.out.println("Thursday");
	    		break;
	    	case 5:
	    		System.out.println("Friday");
	    		break;
	    	case 6:
	    		System.out.println("Saturday");
	    		break;
	    	case 7:
	    		System.out.println("Sunday");
	    		break;	    
	    	default:
	    		System.out.println("Prosledjeni broj nije validan");
	    	
	 }
	}

}
