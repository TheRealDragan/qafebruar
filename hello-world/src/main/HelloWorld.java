package main;

public class HelloWorld {

	public static void main(String[] args) {

		int intNum1 = 9;
		int intNum2 = 5;

		int intResult = intNum1 / intNum2;

		double num1 = 9;
		double num2 = 5;

		double result = num1 / num2;

		System.out.println(result);

		Human human = new Human();
		Human bogdan = new Human("Bogdan", "Glisic");
		bogdan.sayMyName();
		String bogdansName = bogdan.getFirstName();
		System.out.println(bogdansName);
		
		Child bogdansChild = new Child("Nikola", "Glisic", bogdan);
		
		System.out.println("Podaci o Bogdanovom detetu:");
		
		System.out.println(bogdansChild.firstName);
		System.out.println(bogdansChild.parent.firstName);
		

		int five = 5;
		int fiveAgain = five;
		int fiveAgainAgain = returnFive();
		
	//	int causeError = 5/0;

		//Poziv ispod nema nikakvog smisla
		returnFive();		

		
		int additionResult = addTwoNumbers(2,3);
		int secondAdditionResult = addTwoNumbers(4,6);
		System.out.println(additionResult);
		System.out.println(secondAdditionResult);
		printAdditionResult(5,3);

	}
	
	static int returnFive() {
		System.out.println("Pozvana je metoda return five");
		System.out.println("Eto, jel vidite da stampa sve sto je ovde");
		return 5;
	}
	
	static int addTwoNumbers(int num1, int num2) {

		return num1 + num2;
	}
	
	static void printAdditionResult(int num1, int num2) {
		System.out.println(num1 + num2);
	}

}
