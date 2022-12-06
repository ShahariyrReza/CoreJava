package array_demo;

/**
 *
 * @author shahariyr reza
 */
public class array_003 {

    public static void main(String[] args) {

        int[][] arg_one = new int[2][3];

        arg_one[0][0] = 15;
        arg_one[0][1] = 16;
        arg_one[0][2] = 17;
        arg_one[1][0] = 18;
        arg_one[1][1] = 19;
        arg_one[1][2] = 10;

        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {

                System.out.print("\s"+arg_one[row][col]);
            }
            System.out.println("");
        }
    }
}
