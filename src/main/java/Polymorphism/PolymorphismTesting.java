package Polymorphism;

/**
 *
 * @author shahariyr reza (11.03.23)
 */
public class PolymorphismTesting {

    public static void main(String[] args) {
        
        Person p = new Person();
        p.Display();

        p = new Teacher();
        p.Display();

        p = new Farmer();
        p.Display();
    }
}
