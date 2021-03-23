package main;

public class VezbeII {

	public static void main(String[] args) {
		System.out.println(5 == 5); //true
		System.out.println(5!=5); //false
		System.out.println(5 == 5 && 5 == 6); //false
		System.out.println(5==5 || 5 == 6); //true

		String bogdan = new String("Bogdan");
		String secondBogdan = new String("Bogdan");
		System.out.println(bogdan);
		System.out.println(secondBogdan);
		System.out.println(bogdan == secondBogdan);
		System.out.println(bogdan.equals(secondBogdan));
		
		Human firstHuman = new Human("Bogdan", "Djuric");
		Human secondHuman = new Human("Bogdan", "Zoki");
		firstHuman.identityNumber="1505988777222";
		secondHuman.identityNumber = "1505988777222";

		System.out.println(firstHuman == secondHuman);
		System.out.println(firstHuman.equals(secondHuman));
		
		ConstructorDemoClass cdc = new ConstructorDemoClass();
		
	}

}
