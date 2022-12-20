
package Practice;

import java.util.Scanner;

public class namta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number :");
        
        int N;
        N = sc.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            
            System.out.println(N+" x "+i+"\s = \s "+N*i);
        }
    }
}
