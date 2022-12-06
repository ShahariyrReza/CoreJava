
package basic_java;

import java.util.Scanner;

/**
 *
 * @author shahariyr reza
 */
public class namta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m,n;
        
        System.out.println("Enter the First number :");
        m = input.nextInt();
        
        System.out.println("Enter the second number :");
        n = input.nextInt();
        System.out.println("\n \n");
        for (int i = m; i <= n; i++) {
            
            for (int j = 1; j <= 10; j++) {
                
                System.out.println(i+"x"+j +"=" + i*j);
            }
            System.out.println("\n \n");
        }
        
    }
}
