package advance_java;

import java.util.Scanner;
import javax.xml.transform.OutputKeys;

/**
 *
 * @author shaha
 */
public class ConvertIntoDecimal {

    public static void main(String[] args) {
        System.out.println("For Bianary to Decimal press 1");
        System.out.println("For Octal to Decimal press 2");
        System.out.println("For Hexa to Decimal press 3");

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        switch (x) {
            case 1 -> {
                System.out.println("Enter a Bin number :");
                Scanner index = new Scanner(System.in);
                String Bin = index.nextLine();
                Integer decimal = Integer.parseInt(Bin, 2);
                System.out.println(decimal);
            }
            case 2 -> {
                System.out.println("Enter a Octal number :");
                Scanner index = new Scanner(System.in);
                String oct = index.nextLine();
                Integer decimal = Integer.parseInt(oct, 8);
                System.out.println(decimal);
            }
            case 3 -> {
                System.out.println("Enter a HexaDecimal number :");
                Scanner index = new Scanner(System.in);
                String hex = index.nextLine();
                Integer decimal = Integer.parseInt(hex, 16);
                System.out.println(decimal);
            }
            default -> {
                System.out.println("Not a valid number");
            }
        }
    }
}
