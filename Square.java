
public class Square {

	private double height;
	private double width;
	
	public double area() {
		return height * width;
	}
	
	public double circumference() {
		//technically 2*width + 2*height ;)
		return 4 * height;
	}
}
