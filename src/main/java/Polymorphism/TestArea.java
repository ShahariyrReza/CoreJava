package Polymorphism;

/**
 *
 * @author shahariyr reza
 */
public class TestArea {

    public static void main(String[] args) {

        Area s1 = new Area();
        s1.area();
        
        Area s2 = new  Tringle(10, 10);
        System.out.println(s2.area());
        
        Area s3 = new Rectangle(10,3);
        double x = s3.area();
        System.out.println("X :"+x);
        
    }
}
