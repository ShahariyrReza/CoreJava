
package problemSolving;

/**
 *@Date 16.03.23
 * @author Shahariyr reza
 */
public class TestApplication {
    public static void main(String[] args) {
        Shape sh;
        
        sh = new Rectangle(10, 20);
        sh.area();
        
        sh = new Circle(5);
        sh.area();
        
        sh = new Triangle(10, 10);
        sh.area();
    }
}
