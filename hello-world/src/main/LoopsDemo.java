package main;

import java.util.ArrayList;
import java.util.List;

public class LoopsDemo {

	public static void main(String[] args) {
		printSumOfNumbersFromOneToHundred();
		
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
		
	//	printAllStudents(listOfStudents);
		
	//	printStudentsUpToTheFirstOneWithAPerfectScore(listOfStudents);
		
		infiniteLoopDemo();
		
		demonstrateDifferenceBetweenWhileAndDoWhile();

	}
	
	private static void demonstrateDifferenceBetweenWhileAndDoWhile () {
		int i = 100;
		
		while (i<100) {
			System.out.println("Usao sam u while petlju");
		}
		
		do {
			System.out.println("Usao sam u do-while petlju");
		} while (i < 100);
	}
	
	private static void infiniteLoopDemo() {
		int i = 1;
		while (i <= 100) {
			System.out.println(i);
			i = i + 1;
		}
	}

	private static void printStudentsUpToTheFirstOneWithAPerfectScore(List<QaPolaznik> listOfStudents) {
		boolean foundStudentWithAPerfectScore = false;
		int i =0;		
		
		while (!foundStudentWithAPerfectScore) {
			QaPolaznik currentStudent = listOfStudents.get(i);
			System.out.println(currentStudent);
			if (currentStudent.grade == 10) {
				foundStudentWithAPerfectScore = true;
			}
			i++;
		}
		
	}
	

	private static void printAllStudents(List<QaPolaznik> listOfStudents) {
		for (int i=0; i < listOfStudents.size(); i++) {
			System.out.println(listOfStudents.get(i));
		}
		
	}

	private static void printSumOfNumbersFromOneToHundred() {
		int sum = 0;
		for (int i=1; i<=100; i++) {
			sum = sum+i;
		}
		System.out.println(sum);
		
	}

}
