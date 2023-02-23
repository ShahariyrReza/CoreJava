package OOP;

/**
 *
 * @author shahariyr reza
 */
public class MethodOverloadingTesting {
    public static void main(String[] args) {
        MethodOverloding ob = new MethodOverloding();
        ob.add(5, 8);
        ob.add(5.5, 4.5);
        ob.add(3, 4, 3);
        ob.add();
    }
}
