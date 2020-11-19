
public class Circle_10 {

	
	public static void main(String[] args) {
		Circle1 c1 = new Circle1();
		System.out.println("Area of c1 " + c1.getArea() + " perimeter of c1 " + c1.getPerimeter());
		
		Circle1 c2 = new Circle1(5);
		System.out.println("Area of c2 " + c2.getArea() + " perimeter of c1 " + c2.getPerimeter());
		
		c1.setRadius(10);
		System.out.println("Area of c1 " + c1.getArea() + " perimeter of c1 " + c1.getPerimeter());

	}

}
