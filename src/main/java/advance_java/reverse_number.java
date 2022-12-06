/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package advance_java;

import java.util.Scanner;

/**
 *
 * @author shaha
 */
public class reverse_number {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            Scanner input = new Scanner(System.in);

            int num, r, temp, sum = 0;
            System.out.println("Enter any number :");
            num = input.nextInt();

            temp = num;
            while (temp != 0) {
                r = temp % 10;
                sum = sum * 10 + r;
                temp = temp / 10;
            }
            System.out.println("The Reverse number is :" + sum);
        }
    }
}
