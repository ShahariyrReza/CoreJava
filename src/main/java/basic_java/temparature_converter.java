
package basic_java;

import java.util.Scanner;

/**
 *
 * @author shahariyr reza
 */
public class temparature_converter {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            
        System.out.println("\n \n");
        System.out.println("For Celcious to Farenhight press 1");
        System.out.println("For Celcious to Kelvin     press 2");
        System.out.println("For Farenhight to Celcious press 3");
        System.out.println("For Farenhight to Kelvin   press 4");
        System.out.println("For Kelvin to Celcious     press 5");
        System.out.println("For Kelvin to farenhight   press 6");
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        switch (x) {
            case 1 ->                 {
                    System.out.println("Enter the Celcious value :");
                    Scanner input = new Scanner(System.in);
                    double cel,far;
                    cel = input.nextDouble();
                    far = 1.8 * cel + 32;
                    System.out.println("Farenhight value is :"+far);
                }
            case 2 ->                 {
                    System.out.println("Enter the Celcious value :");
                    Scanner input = new Scanner(System.in);
                    double cel,kel;
                    cel = input.nextDouble();
                    kel = cel + 273.15;
                    System.out.println("Kelvin value is :"+kel);
                }
            case 3 ->                 {
                    System.out.println("Enter the Farenhight value :");
                    Scanner input = new Scanner(System.in);
                    double far,cel;
                    far = input.nextDouble();
                    cel = 0.5555555556 * (far - 32);
                    System.out.println("Celcious value is :"+cel);
                }
            case 4 ->                 {
                    System.out.println("Enter the Farenhight value :");
                    Scanner input = new Scanner(System.in);
                    double far,kel;
                    far = input.nextDouble();
                    kel = (far - 32)* 0.5555555555555556 +273.15; //(far − 32) * 5/9 + 273.15;
                    System.out.println("Kelvin value is :"+kel);
                }
            case 5 ->                 {
                    System.out.println("Enter the Kelvin value :");
                    Scanner input = new Scanner(System.in);
                    double kel,cel;
                    kel = input.nextDouble();
                    cel = kel - 273.15;
                    System.out.println("Celcious value is :"+cel);
                }
            case 6 ->                 {
                    System.out.println("Enter the Kelvin value :");
                    Scanner input = new Scanner(System.in);
                    double kel,far;
                    kel = input.nextDouble();
                    far = (kel - 273.15) * 1.8 + 32;
                    System.out.println("Farenhight value is :"+far);
                }
            
            default -> {
                   
            }
        }
        }
    }
}
