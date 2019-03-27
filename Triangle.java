
public class Triangle{
	
   private int a;
   private int b;
   
   public double area() {
	   return  0.5 * a * b;
	   
   }
   
   public double pythagoras() {
		return Math.sqrt(a*a + b*b);
   }
public double circumference() {
	return a + b + pythagoras();
}
}

