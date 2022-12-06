package advance_java;

import java.util.Scanner;

/**
 *
 * @author shahariyr reza
 */
public class pattern_002 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row_num;
        System.out.println("Enter the Row number :");
        row_num = sc.nextInt();

        for (int row = row_num; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}
