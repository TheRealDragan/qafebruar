package principi.oop;

public abstract class Triangle {
	
	double a;
	double b;
	double c;
	double alpha;
	double beta;
	double gama;
	
    abstract double calculateArea(double a, double b, double alpha, double beta);
    
    double calculateArea(double a, double b, double c) {
    	double s = a+b+c/2;
    	return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
   
}
