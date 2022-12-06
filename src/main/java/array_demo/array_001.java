package array_demo;

import java.util.Scanner;

/**
 *
 * @author shahariyr reza
 */
public class array_001 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of arg1[9] :");

        int[] arg1 = new int[10];
        arg1[0] = 17;
        arg1[3] = 27;
        arg1[5] = 37;
        arg1[7] = 12;
        arg1[9] = sc.nextInt();

        int len = arg1.length;
        System.out.println("Length is :" + len);

        System.out.println(arg1[5] + arg1[9]);

    }
}
