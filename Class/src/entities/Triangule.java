package entities;

public class Triangule {
	public double a;
	public double b;
	public double c;
	
	public double calculateTrianguleArea() {
		double p = (a + b + c) / 2.0;
		double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return area;
	}
}
