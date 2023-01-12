package OOP;

/**
 *
 * @author shahariyr reza
 */
public class Teacher {

    String name, gender;
    int id, age;

    Teacher() { // This is a defult constructor as it have no peramiter.
        System.out.println("No Value ");
    }
    
    

    Teacher(int a, String b, String c, int d) {//This is a peramiterised constructor as it have perameter.
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
