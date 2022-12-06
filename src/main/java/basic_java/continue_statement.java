
package basic_java;

/**
 *
 * @author shahariyr reza
 */
public class continue_statement {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i==5 || i==7) {
                continue;
            }
            System.out.println(i);
        }
    }
}
