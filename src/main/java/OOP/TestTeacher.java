
package OOP;

/**
 *
 * @author shaha
 */
public class TestTeacher {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        teacher1.id = 1;
        teacher1.name = "Shahariyr reza";
        teacher1.gender = "male";
        teacher1.age = 23;
        teacher1.DisplayInfo();
        
        
        Teacher teacher2 = new Teacher();
        teacher2.id = 2;
        teacher2.name = "Akash Mahmud";
        teacher2.gender = "male";
        teacher2.age = 25;
        teacher2.DisplayInfo();
    }
}
