package ex1;
import java.util.Scanner;

public class FinalExam_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double average;
        int daysAbsent;
        boolean exempt = false;
        Scanner reader = new Scanner(System.in);
		System.out.println("This programe will determine if you can get out of the final exam.");
		System.out.println("Please answer the following questions.");
		System.out.println("What is your average in the class?");
		average = reader.nextInt();
		System.out.println("How many class lectures have you missed?");
		daysAbsent = reader.nextInt();
		if (average >= 90) {
			if (daysAbsent <= 3)
				exempt = true;
		} else if (average >= 80) {
			if (daysAbsent <= 0)
				exempt = true;
		}
		if (exempt)
			System.out.println("Congratulatioons! You are exempt from the final exam.");
		else 
			System.out.println("You are not exempt from the final exam.");
		
	}

}
