package array_demo;

import java.util.Scanner;

/**
 *
 * @author shahariyr reza
 */
public class matrix_addition {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] A = new int[2][3];
        int[][] B = new int[2][3];
        int[][] C = new int[2][3];
        

        // taking input for the array [A]
        System.out.println("Enter A Value :");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                // System.out.printf("A[&d][&d]",row,col); // printf() function uses,Formate Specifire..(not working)
                A[row][col] = input.nextInt();
            }
        }

        // taking input for the array [B]
        System.out.println("Enter B Value :");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                // System.out.printf("B[&d][&d]",row,col); // printf() function uses,Formate Specifire..(not working)
                B[row][col] = input.nextInt();
            }
        }

        //showing output for the array [A]
        System.out.println("A :");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {  
                System.out.print(" " + A[row][col]);
            }
            System.out.println();
        }

        //showing output for the array [B]
        System.out.println("b :");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" " + B[row][col]);
            }
            System.out.println();
        }
        
        
        System.out.println("\n A+B : \n");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                C[row][col] = A[row][col] + B[row][col];
                System.out.print(" " + C[row][col]);
            }   
            System.out.println("");
        }
    }
}
