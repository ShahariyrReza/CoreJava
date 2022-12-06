package basic_java;

import java.util.Scanner;

/**
 *
 * @author shahariyr reza
 */
public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,fact=1; // fact er man 1 theke suru hobe..
        System.out.println("Enter any number :");
        num=input.nextInt();
        
        for (int i = num; i>= 1; i--) { // 1,1 kore kombe input value er man..
            fact = fact*i; // bar bar multiple
            
        }
        System.out.println("Factorial is :"+fact);
    }
}