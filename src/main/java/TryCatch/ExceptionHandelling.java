package TryCatch;

import java.util.Arrays;

/**
 *
 * @author shahariyr Reza
 */
public class ExceptionHandelling {

    public static void main(String[] args) {
        try {
            int x = 10, y = 10, z;
            z = x / y;
            System.out.println("The Result is :" + z);
            
            int [] ex1 = new int[5];
            ex1[1]= 5;
            ex1[5]=10;
            System.out.println("Array is :"+Arrays.toString(ex1));
            
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e1) {
            System.out.println("Exception :" + e1);
        }
        finally{
            
            int[] array_2 = new int[5];
            array_2[0]=0;
            array_2[1]=1;
            array_2[2]=2;
            array_2[3]=3;
            array_2[4]=4;
            array_2[5]=5;
            for (int i = 0; i < array_2.length; i++) {
                int j = array_2[i];
                System.out.println("The Result is :"+j);
                
            }
            
            System.out.println("Shahariyr Reza");
        }
    }
}
