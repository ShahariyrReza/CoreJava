package basic_java;

import java.util.Scanner;

/**
 *
 * @author shahariyr reza
 */
public class small_or_capital {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            
            Scanner input = new Scanner(System.in);
            System.out.println("Enter any letter :");
            char letter;
            letter = input.next().charAt(0);
            
            if (letter >= 'a' && letter <= 'z') {
                System.out.println("This is a small letter.");
            }
            else if (letter >= 'A' && letter <= 'Z') {
                System.out.println("This is a capital letter.");
            }
            else{
                System.out.println("Not a letter.");
            }
        }
    }
}
