
package basic_java;

import java.util.Scanner;

/**
 *
 * @author shahariye reza
 */
public class vowel_or_consonant {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter any letter :");
            char text;
            text=input.next().charAt(0);
            if (text== 'A' || text=='a' || text=='E' || text=='e' || text=='I'|| text=='i'|| text=='O'|| text=='o'|| text=='U'|| text=='u' ) {
                System.out.println("It is a VOWEL");
            } 
            else {
                System.out.println("It is a Consonant");
            }
        }
    }
}
