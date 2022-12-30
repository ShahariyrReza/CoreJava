
package advance_java;

import java.util.Random;

/**
 *
 * @author shahariyr reza
 */
public class RandomNumber {
    public static void main(String[] args) {
        Random rand = new  Random();
        int RandNumber = rand.nextInt(100);
        System.out.println(RandNumber);
    }
}
