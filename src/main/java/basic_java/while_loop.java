
package basic_java;

import java.util.Scanner;

/**
 *
 * @author shahariyr reza
 */
public class while_loop {
    public static void main(String[] args) {
        System.out.println("Practiceing the while loop");
        
        System.out.println("Enter any int number");
        Scanner sc = new Scanner(System.in);
        int x;
        x= sc.nextInt();
        
        while (x<=5) {            
            System.out.println("The number is Five");
            x++;
        }
        
    }
}
