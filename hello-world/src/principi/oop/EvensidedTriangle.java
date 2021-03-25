package principi.oop;

public class EvensidedTriangle implements CalculatesArea, Clickable{

	@Override
	public double calculateArea(double r) {
		return r * r * 1.73 / 2;
	}

	@Override
	public void onClick() {
		System.out.println("Kliknuto!");
		
	}

}
