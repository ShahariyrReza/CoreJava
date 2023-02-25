package basic_java;

import java.util.Scanner;

/**
 *
 * @author shahariyr reza
 */
public class series {

    public static void main(String[] args) {

        System.out.println("Enter the last number:");
        Scanner input = new Scanner(System.in);
        
        int num, sum = 0;
        num = input.nextInt();

        for (int i = 0; i <= num; i++) {
            sum = sum + i;
            System.out.print(i + "+");
        }
        System.out.println("\nThe sum of given number is :" + sum);

    }
}
