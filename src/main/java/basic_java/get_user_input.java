
package basic_java;

import java.util.Scanner;

/**
 *
 * @author shahariyr reza
 */
public class get_user_input {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter any intger number:");
         int num = sc.nextInt();
         sc.nextLine(); // sometime when we need to get input string after any int,double,or something else.
         System.out.println("Enter your name :");
         
         String name = sc.nextLine();
         System.out.println("Your value is: "+num);
         System.out.println("Your name is :"+name);
    }
}
