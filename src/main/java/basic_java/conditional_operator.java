package basic_java;

import java.util.Scanner;

/**
 *
 * @author shahariyr reza
 */
public class conditional_operator {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter two number :");
            int num1,num2,large;
            num1 = input.nextInt();
            num2 = input.nextInt();
            
            large = (num1>num2) ? num1 :num2; // conditional operator. (expression) ? result one : result two... By this wayS
            System.out.println("large number is :"+large);
        }
    }
}
