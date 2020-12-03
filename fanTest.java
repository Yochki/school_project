package first;

public class fanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fan fan1 = new fan();
		fan1.setSpeed(fan.FAST);
		fan1.setRadius(10);
		fan1.setSwitchedOn(true);
		fan1.setColor("yellow");
		
		fan fan2 = new fan();
		fan2.setSpeed(fan.MEDIUM);
		
		System.out.println(fan1.toString());
		System.out.println(fan2.toString());

	}

}
