
package basic_java;

import java.util.Scanner;

/**
 *
 * @author shahariyr reza
 */
public class print_even_odd {
    public static void main(String[] args) {
        
        System.out.println("Enter Initial value");
        int m,n;
        Scanner input = new Scanner(System.in);
        m=input.nextInt();
        System.out.println("Enter the End value");
        n=input.nextInt();
        
        /*for (int i = m; i <= n; i++) {
            if (i%2==0) {
                System.out.println(i);
            }
        }*/ //that's all is for even number..
        
        for (int i = m; i <=n; i++) {
            if (i%2 !=0) {
                System.out.println(i);
            }
        } // and that's for odd number..
    }
}
