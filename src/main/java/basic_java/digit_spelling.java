package basic_java;

import java.util.Scanner;

/**
 *
 * @author shahariyr reza
 */
public class digit_spelling {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any digit between 0 to 10 :");
            int x;
            x = sc.nextInt();
            
            switch (x) {
                case 0 -> System.out.println("Zero");
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");
                case 10 -> System.out.println("Ten");
                default -> throw new AssertionError();
            }
        }
    }
}
