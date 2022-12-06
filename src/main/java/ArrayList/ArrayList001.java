package ArrayList;

import java.util.ArrayList;

/**
 * some basic fundamental of ArrayList..
 * @author shahariyr reza
 */
public class ArrayList001 {

    public static void main(String[] args) {
        ArrayList<Integer> Al1 = new ArrayList<>();

        Al1.add(5);
        Al1.add(10);
        Al1.add(15);
        Al1.add(20);
        Al1.add(25);

        System.out.println(Al1.size()); // return the size of the ArrayList
        
        Al1.remove(4); // will remove the object at index 4
        System.out.println("after removing Index 4 :" + Al1);
        
        boolean bol = Al1.isEmpty(); // return a boolean value either ArrayList is empty or not
        System.out.println("The array list is empty :" + bol);
        
        boolean cont = Al1.contains(15); // return a boolean value either the object contains or not
        System.out.println("15 is in the list :" + cont);
        
        System.out.println("Index of 20 is :" + Al1.indexOf(20)); // return the index of the object
        
        Al1.set(1, 100); // will set the value 100 at the index number 1
        
        System.out.println(Al1);
        
        System.out.println("Index number one :" + Al1.get(1)); // return the specific indexed value.....

    }
}
