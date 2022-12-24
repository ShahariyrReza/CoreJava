/*
 * In this class I will show how to convert a String into a premetive data
 * and also a premetive data to a String
 */
package String;

/**
 *
 * @author shahariyr reza
 */
public class StringConverting {

    public static void main(String[] args) {
        int i = 100;
        double d = 100.25;
        boolean b = true;

        String s1 = Integer.toString(i);
        String s2 = Double.toString(d);
        String s3 = Boolean.toString(b);

        System.out.println(s1 + " " + s2 + " " + s3);

        //Again Sting to premetive data
        int k = Integer.parseInt(s1);
        double l = Double.parseDouble(s2);
        boolean m = Boolean.parseBoolean(s3);

        System.out.println(k + " " + l + " " + m);
    }
}
