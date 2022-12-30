
package OOP;

/**
 *
 * @author shaha
 */
public class TestTeacher {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        teacher1.id = 01;
        teacher1.name = "Shahariyr reza";
        teacher1.gender = "male";
        teacher1.age = 23;
        
        System.out.println("id :"+teacher1.id);
        System.out.println("Name :"+teacher1.name);
        System.out.println("Gender :"+teacher1.gender);
        System.out.println("Age :"+teacher1.age);
        
        
        Teacher teacher2 = new Teacher();
        teacher1.id = 02;
        teacher1.name = "Akash Mahmud";
        teacher1.gender = "male";
        teacher1.age = 25;
        
        System.out.println("id :"+teacher2.id);
        System.out.println("Name :"+teacher2.name);
        System.out.println("Gender :"+teacher2.gender);
        System.out.println("Age :"+teacher2.age);
    }
}
