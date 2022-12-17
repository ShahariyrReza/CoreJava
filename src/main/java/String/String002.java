
package String;

/**
 * In this program I will show some method that are mentioning below.
 * add two string, make uppercase,make lowercase, start with, and end with
 * 
 * @author shahariyr reza
 * BSc in CSE, Northern University of Business and Technology Khulna
 */
public class String002 {
    public static void main(String[] args) {
        String FirstName ="Shahariyr";
        String LastName =" Reza";
        
        String FullName = FirstName.concat(LastName);
        System.out.println("Full Name is :"+FullName);
        
        String UpCase = FirstName.toUpperCase();
        System.out.println("Upper Case :"+UpCase);
        
        String LowCase = FirstName.toLowerCase();
        System.out.println("Upper Case :"+LowCase);
    }
}
