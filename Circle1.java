

public class Circle1 {

	public double radius;
	
	public Circle1() {
		radius = 1;
	}
	
	public Circle1( double newRadius ) {
		radius = newRadius;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	public double getPerimeter() {
		return Math.PI * radius * 2;
	}
	
	public void setRadius( double newRadius ) {
		radius = newRadius;
	}
}
	
