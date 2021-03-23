package main;

import java.util.*;
public class SetDemo {

	public static void main(String[] args) {
		List<Integer> listOfNumbers = new ArrayList<Integer>();
		Set<Integer> setOfNumbers = new HashSet<Integer>();
		
		listOfNumbers.add(1);
		listOfNumbers.add(1);
		listOfNumbers.add(1);

		setOfNumbers.add(1);
		setOfNumbers.add(1);
		setOfNumbers.add(1);

		System.out.println("Stampam elemente liste:");
		System.out.println(listOfNumbers);
		
		System.out.println("Stampam elemente skupa:");
		System.out.println(setOfNumbers);
		
		QaPolaznik polaznik1 = new QaPolaznik("Boris", "Batinic", "110898700000", 9);
		QaPolaznik polaznik2 = new QaPolaznik("Boris", "Batinic", "110898700000", 9);
		QaPolaznik polaznik3 = new QaPolaznik("Drasko", "Radovanovic", "130898700000", 5);
		QaPolaznik polaznik4 = new QaPolaznik("Dunja", "Ilic", "110598700000", 7);
		QaPolaznik polaznik5 = new QaPolaznik("Ana", "Vladic", "110498700000", 10);
		

		List<QaPolaznik> listOfStudents = new ArrayList<QaPolaznik>();
		Set<QaPolaznik> setOfStudents = new HashSet<QaPolaznik>();

		listOfStudents.add(polaznik1);
		listOfStudents.add(polaznik2);
		listOfStudents.add(polaznik3);
		listOfStudents.add(polaznik4);
		listOfStudents.add(polaznik5);
		
		setOfStudents.add(polaznik1);
		setOfStudents.add(polaznik2);
		setOfStudents.add(polaznik3);
		setOfStudents.add(polaznik4);
		setOfStudents.add(polaznik5);
		
		System.out.println("Stampam elemente liste:");
		System.out.println(listOfStudents);
		
		System.out.println("Stampam elemente skupa:");
		System.out.println(setOfStudents);
		

	}

}
