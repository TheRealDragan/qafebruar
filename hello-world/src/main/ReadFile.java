package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
	  public static void main(String[] args) {
		  System.out.println("Pozivam metodu koja pravi pauzu od deset sekundi");
		  checkedExceptionDemo();
		  System.out.println("Izasao sam iz metode koja pravi pauzu od deset sekundi");
		  List<QaPolaznik> polaznici = new ArrayList<QaPolaznik>();
		      try (BufferedReader br = new BufferedReader(
		         new FileReader("students.txt"))) { 
		         
		         String sCurrentLine;
		         while ((sCurrentLine = br.readLine()) != null) {
						String[] parts = sCurrentLine.split(" ");
						String ime = parts[0];
						String prezime = parts[1];
						String jmbg = parts[2];
						String ocena = parts[3];
						
						validateJmbg(jmbg);
						validateGrade(ocena);
						
						QaPolaznik current = new QaPolaznik(ime, prezime, jmbg, Integer.parseInt(ocena));
						polaznici.add(current);

					} 
		      } catch (IOException e) {
		         e.printStackTrace();
		      } 
		      
		 for (QaPolaznik polaznik : polaznici) {
			 System.out.println(polaznik);
		 }
		   
		}
	  
	  private static void validateJmbg(String jmbg) {
		  if (jmbg.length() != 13 ) {
			  throw new RuntimeException("Prosledjeni jmbg nije predvidjene duzine");
		  }
	  }
	  
	  private static void validateGrade(String grade) {
		  Integer convertedGrade = Integer.parseInt(grade);
		  if (convertedGrade < 5 || convertedGrade > 10) {
			  throw new RuntimeException("Prosledjena je nevalidna ocena!!!");
		  }
	  }
	  
	  private static void checkedExceptionDemo() {
		  try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
}
