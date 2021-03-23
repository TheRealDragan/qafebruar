package main;

public class QaKurs {

	public static void main(String[] args) {

		QaPolaznik polaznik1 = new QaPolaznik("Boris", "Batinic", "110898700000", 9);
		QaPolaznik polaznik2 = new QaPolaznik("Aleksandra", "Milojevic", "110898600000", 10);
		QaPolaznik polaznik3 = new QaPolaznik("Drasko", "Radovanovic", "130898700000", 5);
		QaPolaznik polaznik4 = new QaPolaznik("Dunja", "Ilic", "110598700000", 7);
		QaPolaznik polaznik5 = new QaPolaznik("Ana", "Vladic", "110498700000", 10);


		int zbirOcena = (polaznik1.grade + polaznik2.grade + polaznik3.grade + polaznik4.grade + polaznik5.grade);

		double prosecnaOcena = (double) zbirOcena / 5;

		System.out.println(prosecnaOcena);

		if (polaznik1.grade >= polaznik2.grade && polaznik1.grade >= polaznik3.grade && polaznik1.grade >= polaznik4.grade
				&& polaznik1.grade >= polaznik5.grade) {

			System.out.println(polaznik1);

		} else if (polaznik2.grade >= polaznik1.grade && polaznik2.grade >= polaznik3.grade
				&& polaznik2.grade >= polaznik4.grade && polaznik2.grade >= polaznik5.grade) {

			System.out.println(polaznik2);

		} else if (polaznik3.grade >= polaznik1.grade && polaznik3.grade >= polaznik2.grade
				&& polaznik3.grade >= polaznik4.grade && polaznik3.grade >= polaznik5.grade) {

			System.out.println(polaznik3);

		} else if (polaznik4.grade >= polaznik1.grade && polaznik4.grade >= polaznik2.grade
				&& polaznik4.grade >= polaznik3.grade && polaznik4.grade >= polaznik5.grade) {

			System.out.println(polaznik4);

		} else if (polaznik5.grade >= polaznik1.grade && polaznik5.grade >= polaznik2.grade
				&& polaznik5.grade >= polaznik3.grade && polaznik5.grade >= polaznik4.grade) {

			System.out.println(polaznik5);

		}

		int counter = 0;
		if (polaznik1.hasPassed()) {
			counter = counter + 1;
		}
		if (polaznik2.hasPassed()) {
			counter = counter + 1;
		}
		if (polaznik3.hasPassed()) {
			counter = counter + 1;
		}
		if (polaznik4.hasPassed()) {
			counter = counter + 1;
		}
		if (polaznik5.hasPassed()) {
			counter = counter + 1;
		}
		System.out.println("polozilo je " + counter + " polaznika");
	}
}