package ex1;

import java.util.Scanner;

public class ColorRange_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Enter a color code ");
      
      Scanner sc = new Scanner(System.in);
      double waveLenght = sc.nextDouble();
      
      String answer;
      if( waveLenght >= 380 && waveLenght < 450 ) {
    	  answer = "The color is Violet";
      } else if( waveLenght >= 450 && waveLenght < 495 ) {
    	  answer = "the color is Blue";
      } else if( waveLenght >= 495 && waveLenght < 570 ) {
    	  answer = "The color is Green";
      } else if( waveLenght >= 570 && waveLenght < 590 ) {
    	  answer = "The color is Yellow";
      } else if( waveLenght >= 590 && waveLenght < 620 ) {
    	  answer = "The color is Orange";
      } else if( waveLenght >= 620 && waveLenght < 750 ) {
    	  answer = "The color is Red";
      } else {
    	  answer = "The entered waveLenght is not part of the visible spectrum";
      }
      
      System.out.println(answer);
      
	}

}
