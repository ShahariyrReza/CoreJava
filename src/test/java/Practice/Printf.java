
package Practice;

import java.util.Scanner;

/**
 *
 * @author shaha
 */
public class Printf {
    public static void main(String[] args) {
        int x;
        String y="Shaha";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X:");
        x = sc.nextInt();
        
        
        System.out.printf("%-5d %10s ",x,y);
    }
}
