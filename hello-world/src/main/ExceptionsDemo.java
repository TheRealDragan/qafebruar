package main;

public class ExceptionsDemo {

	public static void main(String[] args) {
		String s = "p";
		String p = "5";
		try {
		Human human = new Human();
		System.out.println(human.child.firstName);	
		int i = Integer.parseInt(s);		
		System.out.println(i);	
		
		} catch (NumberFormatException e) {
			System.out.println("Prosledjen je nevalidan string");
		} catch (NullPointerException e) {
			System.out.println("Ovaj covek nema decu!");
		} catch (Exception e) {
			System.out.println("Doslo je do greske - pod razno!");
		}
		
		try {
		int i = Integer.parseInt(s);		
		System.out.println(i);		
		
		} catch (Exception e) {
			System.out.println("Doslo je do greske!");
		}
		
		try {
			int i = Integer.parseInt(p);		
			System.out.println(i);
			
			} catch (RuntimeException e) {
				System.out.println("Prosledjen je nevalidan string");
			} finally {
				System.out.println("Zavrsena obrada za string " + p);
				}
	}

}
