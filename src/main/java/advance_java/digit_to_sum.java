package advance_java;

import java.util.Scanner;

/**
 *
 * @author shahariyr reza
 */
public class digit_to_sum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            int num, r, temp, sum = 0;
            System.out.println("enter your digit :");
            num = input.nextInt();

            temp = num;
            while (temp != 0) {   // joto somy porjontw amra akta vagses na pai..         
                r = temp % 10;  // ekhn a "r" holo vagses..
                sum = sum + r; // vagses ta sum er shaty add korlam..
                temp = temp / 10; // akta vagses pawya mane mail value 10 kome galo.. tai 10 diye vag kore temp a assign korlam

            }
            System.out.println("The sum is :" + sum);

        }
    }
}
