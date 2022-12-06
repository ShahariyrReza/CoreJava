package advance_java;

import java.util.Scanner;

/**
 *
 * @author shahariyr reza
 */
public class pattern_001 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row_num;
        System.out.println("Enter the row Number :");
        row_num = input.nextInt();

        for (int row = 1; row <= row_num; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("Altaf \s");
            }
            System.out.println(" ");
        }

    }
}
