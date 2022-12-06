
package basic_java;

import java.util.Scanner;

/**
 *
 * @author shahariyar reza
 */
public class triangle_area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base,height,area;
        System.out.println("Enter the Base value :");
        base = sc.nextDouble();
        
        System.out.println("Enter the Height :");
        height = sc.nextDouble();
        
        area = (0.5*base*height); // the area of tringle formula. 
        System.out.println("The area of Triangle is :"+area);
    }
}
