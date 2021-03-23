package main;

public class RecursionDemo {

	public static void main(String[] args) {
		System.out.println(sumUpTo(5));
		System.out.println(factoriel(5));


	}
	
	private static int sumUpTo(int n) {
		if (n==1) {
			return 1;
		}
		return sumUpTo(n -1) + n;
	}
	
	//faktorijel, zapisuje se kao n! je proizvod brojeva od 1 do n
	
	private static int factoriel(int n) {
		if (n <= 1) {
			return 1;
		}
		return factoriel(n-1) * n;
	}

}
