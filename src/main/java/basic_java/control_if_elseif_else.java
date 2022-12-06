
package basic_java;

import java.util.Scanner;

/**
 *
 * @author shahariyr reza
 */
public class control_if_elseif_else {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number");
        int num;
        num = input.nextInt();
        
        if (num>0) {
            System.out.println("It is a positive number");
        }
        else if (num<0) {
            System.out.println("It is a negative number");
        }
        else {
            System.out.println("It is zero");
        }
    }
  }

