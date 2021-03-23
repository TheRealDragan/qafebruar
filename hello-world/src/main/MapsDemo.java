package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapsDemo {

	public static void main(String[] args) {
		QaPolaznik polaznik1 = new QaPolaznik("Boris", "Batiniccc", "110898700000", 9);
		QaPolaznik polaznik2 = new QaPolaznik("Aleksandra", "Milojevic", "110898600000", 10);
		QaPolaznik polaznik3 = new QaPolaznik("Drasko", "Radovanovic", "130898700000", 5);
		QaPolaznik polaznik4 = new QaPolaznik("Dunja", "Ilic", "110598700000", 7);
		QaPolaznik polaznik5 = new QaPolaznik("Ana", "Vladic", "110498700000", 6);
		QaPolaznik polaznik6 = new QaPolaznik("Zoki", "Bogjave", "110498700000", 6);
		QaPolaznik polaznik7 = new QaPolaznik("Nikola", "Rajakovic", "110498700000", 8);
		QaPolaznik polaznik8 = new QaPolaznik("Zivko", "Bogdanovic", "110498700000", 8);


		List<QaPolaznik> listOfStudents = new ArrayList<QaPolaznik>();
		listOfStudents.add(polaznik1);
		listOfStudents.add(polaznik2);
		listOfStudents.add(polaznik3);
		listOfStudents.add(polaznik4);
		listOfStudents.add(polaznik5);
		listOfStudents.add(polaznik6);
		listOfStudents.add(polaznik7);
		listOfStudents.add(polaznik8);
		
        Map<Integer, Integer> gradeStatsMap = new HashMap<Integer, Integer>();
		
		for (QaPolaznik qaPolaznik : listOfStudents) {
			Integer currentGrade = qaPolaznik.grade;
			Integer countForGrade = gradeStatsMap.get(currentGrade);
			int newCount;
			if (countForGrade == null) {
				newCount = 1;
			} else {
				newCount = countForGrade + 1;
			}
			gradeStatsMap.put(currentGrade, newCount);
		}
		
		System.out.println("OCENU 9 IMA "+ gradeStatsMap.get(9) + " polaznika");
		
		for (Integer grade : gradeStatsMap.keySet()) {
			
			System.out.println("Ocenu " + grade + " ima " + gradeStatsMap.get(grade) + " polaznika");
		}

		
		

	}

}
