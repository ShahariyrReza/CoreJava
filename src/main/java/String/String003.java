package String;

/**
 *
 * @author shahariyr reza
 */
public class String003 {

    public static void main(String[] args) {
        String me = "     My Name is Shahariyr Reza";
        System.out.println(me);
        String tr = me.trim();
        System.out.println(tr);
        char ch = me.charAt(20);
        System.out.println("Char at index 15 :" + ch);
        int ind = me.indexOf("is");
        System.out.println("Index of is :" + ind);

    }
}
