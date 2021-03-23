package main;

import java.util.ArrayList;
import java.util.List;

public class SortingStudents {

	public static void main(String[] args) {
		QaPolaznik polaznik1 = new QaPolaznik("Boris", "Batinic", "110898700000", 9);
		QaPolaznik polaznik2 = new QaPolaznik("Aleksandra", "Milojevic", "110898600000", 10);
		QaPolaznik polaznik3 = new QaPolaznik("Drasko", "Radovanovic", "130898700000", 5);
		QaPolaznik polaznik4 = new QaPolaznik("Dunja", "Ilic", "110598700000", 7);
		QaPolaznik polaznik5 = new QaPolaznik("Ana", "Vladic", "110498700000", 10);
		
		List<QaPolaznik> listOfStudents = new ArrayList<QaPolaznik>();
		listOfStudents.add(polaznik1);
		listOfStudents.add(polaznik2);
		listOfStudents.add(polaznik3);
		listOfStudents.add(polaznik4);
		listOfStudents.add(polaznik5);
		
		
		double averageGrade = calculateAverageGrade(listOfStudents);
		
		for (QaPolaznik student : listOfStudents) {
			if (student.grade < averageGrade) {
				System.out.println(student);
			}
		}
		
		System.out.println(addNumbers(1,2));
		
		int additionResult = Calculator.add(2, 3);
		double pi = Calculator.PI;

	}
	
	private static double calculateAverageGrade(List<QaPolaznik> listOfStudents) {
		int sum = 0;
		for (QaPolaznik student : listOfStudents) {
			sum = sum + student.grade;
		}
		return (double) sum / listOfStudents.size();
	}
	
	public static double addNumbers(double a, double b) {
		return a+b;
	}
	
	//Ova i metoda ispod su primer overloading-a
	public static int addNumbers(int a, int b) {
		return a + b;
	}
	
	public static int addNumbers(int a, int b, int c) {
		return a + b + c;
	}

}
