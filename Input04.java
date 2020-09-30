package h;

import java.util.Scanner;

public class Input04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(Input04.class.getResourceAsStream("input04text.txt"));      
        
        //Edit these lines to advance the scanner
        sc.nextLine();
        sc.nextLine();
        sc.nextLine();
        
        sc.findInLine("BlueBumper");
       
        int x = sc.nextInt();
        int y = sc.nextInt();
        //Does this line contain "BlueBumper"?

        System.out.println("X: " + x +", Y: " + y );
        sc.close();
    }    
}
