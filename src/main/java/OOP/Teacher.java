package OOP;

/**
 *
 * @author shahariyr reza
 */
public class Teacher {

    String name, gender;
    int id, age;

    void SetInfo(int a, String b, String c, int d) {
        id = a;
        name = b;
        gender = c;
        age = d;

    }

    void DisplayInfo() {

        System.out.println("id :" + id);
        System.out.println("Name :" + name);
        System.out.println("Gender :" + gender);
        System.out.println("Age :" + age);
        System.out.println("\n");
    }
}
