package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author shahariyr reza
 */
public class ArrayList002 {

    public static void main(String[] args) {
        ArrayList<Integer> AL1 = new ArrayList<>();

        AL1.add(2);
        AL1.add(-12);
        AL1.add(32);
        AL1.add(7);
        AL1.add(45);

        System.out.println("Array List :" + AL1);

        Collections.sort(AL1); // sort the arrayList in ascending order..
        System.out.println("After Asscending Sorting ;" + AL1);

        Collections.sort(AL1, Collections.reverseOrder()); // sort the arrayList in a decending order..
        System.out.println("After Deceding Sorting :" + AL1);
    }
}
