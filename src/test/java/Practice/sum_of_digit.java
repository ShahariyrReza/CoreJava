package Practice;

import java.util.Scanner;

/**
 *
 * @author shahariye reza
 */
public class sum_of_digit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, temp, r, sum = 0;

        System.out.println("Enter Your Number :");
        num = sc.nextInt();

        temp = num;
        while (temp != 0) {
            r = temp % 10;
            sum = sum + r * r * r;
            temp = temp / 10;
        }

        if (sum == num) {
            System.out.println("Armstrong Number ");
        } else {
            System.out.println("Not a Armstrong Number");
        }
    }
}
