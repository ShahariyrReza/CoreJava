package Practice;

/**
 *
 * @author shahariyr reza
 */
public class Student {

    int id;
    String name, dept, email;

    Student(int I, String N, String D, String E) // constructor. when the name of method is equal of the class.
    {

        id = I;
        name = N;
        dept = D;
        email = E;

    }

    void DisplayInfo() {

        System.out.println("ID:" + id);
        System.out.println("Name:" + name);
        System.out.println("Department:" + dept);
        System.out.println("Email:" + email);
    }
}
