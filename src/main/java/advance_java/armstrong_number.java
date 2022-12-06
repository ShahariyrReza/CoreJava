package advance_java;

import java.util.Scanner;

/**
 *
 * @author shahariyr reza
 */
public class armstrong_number {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            Scanner input = new Scanner(System.in);

            int num, r, temp, sum = 0;
            System.out.println("Enter any number :");
            num = input.nextInt();

            temp = num;
            while (temp != 0) {
                r = temp % 10;
                sum = sum + r * r * r;
                temp = temp / 10;
            }
            if (sum == num) {
                System.out.println("Armstrong Number");
            } else {
                System.out.println("Not a Armstrong Number");
            }
        }
    }
}
