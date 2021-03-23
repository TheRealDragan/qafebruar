package main;

import java.util.*;

public class QaKursVersion2 {

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

		printAverageGrade(listOfStudents);
		printStudentWithTheHighestGrade(listOfStudents);
		printNumberOfStudentsThatHavePassed(listOfStudents);
	}

	private static void printNumberOfStudentsThatHavePassed(List<QaPolaznik> list) {
		int counter = 0;
		for (QaPolaznik qaPolaznik : list) {
			if (qaPolaznik.grade > 5) {
				counter++;
			}
		}
		System.out.println("polozilo je " + counter + " polaznika");
	}

	private static void printStudentWithTheHighestGrade(List<QaPolaznik> list) {
		int maxOcena = 0;
		QaPolaznik studentWithTheHighestGrade = null;
		for (QaPolaznik qaPolaznik : list) {
			if (qaPolaznik.grade > maxOcena) {
				maxOcena = qaPolaznik.grade;
				studentWithTheHighestGrade = qaPolaznik;
			}
		}
		System.out.println(studentWithTheHighestGrade);		
	}

	private static void printAverageGrade(List<QaPolaznik> list) {
		int sum = 0;
		for (QaPolaznik qaPolaznik : list) {
			sum = sum + qaPolaznik.grade;
		}
		double averageGrade = (double) sum / list.size();
		System.out.println(averageGrade);
	}

}
