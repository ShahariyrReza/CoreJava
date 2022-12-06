package Practice;

import java.util.Scanner;


/**
 * @thats just for practice purpose .. 
 * @author shahariyr reza
 */
public class Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, count = 0;
        
        for (int j = 0; j <= 100; j++) {
            
        
        System.out.println("Enter any number :");
        n = sc.nextInt();
        for (int i = 2; i < n; i++) {
            if (n%i ==0) {
                count ++;
                break;
            }
        }
        if (count ==0) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime Number");
        }
        
     }
  }

}
