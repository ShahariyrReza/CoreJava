package advance_java;

import java.util.Scanner;

/**
 *
 * @author shahariye reza
 */
public class prime_number {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int j = 0; j < 10; j++) { // the loop will continue 10 times..

            System.out.println("Enter any number :");
            int num, count = 0;
            num = input.nextInt();

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("Prime number");
            } else {
                System.out.println(" Not a Prime number");
            }
        }

    }
}
