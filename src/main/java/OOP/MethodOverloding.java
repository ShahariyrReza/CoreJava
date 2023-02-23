package OOP;

/**
 *
 * @author shahariyr reza
 */
public class MethodOverloding {

    void add(int a, int b) {

        System.out.println("a+b is equal :" + (a + b));
    }
    
    void add(double a, double b) {

        System.out.println("a+b is equal :" + (a + b));
    }
    
    void add(int a, int b, int c) {

        System.out.println("a+b+c is equal :" + (a + b+c));
    }
    
    void add() {

        System.out.println("Nothing to show here.");
    }
}
