
public class Circle extends Shape {

	private double radius;
	double pi = 3.14;
	
	public double area() {
		
		return pi* radius * radius;
	
}

	public double circumference() {
		return 2* pi * radius;
	}
}