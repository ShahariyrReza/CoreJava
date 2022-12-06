package basic_java;

import java.util.Scanner;

/**
 *
 * @author shahariyr reza
 */
public class even_or_odd {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number :");
        int x;
        x = input.nextInt();
        
        if (x % 2 == 0) {
            System.out.println("This is an even number");
        }
        else  {
            System.out.println("This is a odd number");
        }
        }
    }
}
