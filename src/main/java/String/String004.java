package String;

/**
 *
 * @author shahariyr reza
 */
public class String004 {

    public static void main(String[] args) {
        String s1 = ("My Name is Shahariyr Reza");
        String s2 = s1.replace('a', 'b'); // b will replace a all over the s1
        System.out.println(s2);

        String[] s3 = s1.split(" "); // split on the basis " ";
        for (String string : s3) { // for each loop
            System.out.println(string);
        }
    }
}
