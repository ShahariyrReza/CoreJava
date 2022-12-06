
package basic_java;

/**
 *
 * @author shahariyr reza
 */
public class increment_decrement {
    public static void main(String[] args) {
        int x = 20, y, i=5, j;
        y = x++;
        System.out.println("Y="+y); //Here will print y=20 cz it is post increment..
        
        y = x;
        System.out.println("Y="+y); //Here will print y=21 cz it is post increment...
        
        j = ++i; // Here will print J=6 cz it is pre increment
        System.out.println("J="+j);
        
        // same will happend when we use pre decrement and post decrement in our code as well..
   }
}
