
package basic_java;

/**
 *
 * @author shahariyr reza
 */
public class break_statement {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i=i+2) {
            if (i==12) {
                break; //while the condition satisfiyed ,then break statement works.
            }
            System.out.println(i);
        }
        
        
    }
}
