package advance_java;

import java.util.Scanner;

/**
 *
 * @author shahariyr reza
 */
public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many number do you want to show :");
        int n, fir_num = 0, sec_number = 1, fibo_number;
        n = sc.nextInt();

        System.out.println("0");
        System.out.println("1");

        for (int i = 3; i <= n; i++) {
            fibo_number = fir_num + sec_number;
            System.out.println(fibo_number);
            fir_num = sec_number;
            sec_number = fibo_number; // here the second number 
        }
    }
}
