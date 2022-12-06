/*
 * in this part i will try to work as short as possible to take input and show output
 * Keywords.. [avg] [arg.length] [sum]
 */
package array_demo;

import java.util.Scanner;

/**
 *
 * @author shahariye reza
 */
public class array_002 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] arg_avg = new double[5];
        double sum = 0, avg, max, min;

        for (int i = 0; i < arg_avg.length; i++) {
            System.out.println("Place Enter Number \s" + (i + 1) + ":");
            arg_avg[i] = input.nextDouble();
        }

        for (int out = 0; out < arg_avg.length; out++) {
            sum = sum + arg_avg[out];
        }

        avg = sum / arg_avg.length;

        max = arg_avg[0];
        min = arg_avg[0];

        for (int i = 1; i < arg_avg.length; i++) {

            if (max < arg_avg[i]) {
                max = arg_avg[i];
            }

            if (min > arg_avg[i]) {
                min = arg_avg[i];
            }
        }
        System.out.println("Minimum number is :" + min);
        System.out.println("Maximum number is :" + max);
        System.out.println("\n");
        System.out.println("Sum is :" + sum);
        System.out.println("Average  value is :" + avg);

    }
}
