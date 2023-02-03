package Practice;

import java.util.Scanner;

/**
 *
 * @author shahariyr reza
 * @created (03.03.23)
 */
public class ArrayPractice1 {

    public static void main(String[] args) {

        int n;
        double sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("How Many Information Do you wanna Calclute? :");
        n = input.nextInt();
        double[] info = new double[n];

        for (int i = 0; i < info.length; i++) {
            System.out.println("Please Give the Info number " + (i + 1));
            info[i] = input.nextDouble();

        }

        for (int i = 0; i < info.length; i++) {
            sum = sum + info[i];
        }
        double avg = sum / n;

        System.out.println("The Sum is :" + sum);
        System.out.println("Average value is :" + avg);

    }
}
