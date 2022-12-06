package array_demo;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author shahariyr reza
 */
public class array_sorting {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arry1 = new int[5];

        //taking input of the array
        System.out.println("Enter any five number :");
        for (int i = 0; i < arry1.length; i++) {
            arry1[i] = input.nextInt();

        }
        Arrays.sort(arry1);
        
        System.out.println("Assending Shorted Arrays Is :");
        for (int i = 0; i < arry1.length; i++) {
            System.out.print(arry1[i]);
        }
        
        System.out.println("\n \n Decending Shorted Arrays Is :");
        for (int i = 4; i >= 0; i--) {
            System.out.print(arry1[i]);
        }
    }
}
