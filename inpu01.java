package h;

import javax.swing.JOptionPane;

public class inpu01 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog( "What is your name");
		System.out.println(name);
		int number = Integer.parseInt ( JOptionPane.showInputDialog("Input a number"));
				number++;
				System.out.println(number);
		
	}

}
