
package basic_java;

import java.util.Scanner;

/**
 *
 * @author shahariyr reza
 */
public class do_while_loop {
    public static void main(String[] args) {
        System.out.println("this is Do While loop");
        System.out.println("Please input an Int");
        int x;
        Scanner sc = new Scanner(System.in);
        x= sc.nextInt();
        
        do {            
            System.out.println("I am shahariyr");
            x++;
        } while (x<=7);
    }
}
