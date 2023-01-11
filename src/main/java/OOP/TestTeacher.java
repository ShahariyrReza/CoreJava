package OOP;

/**
 *
 * @author shaha
 */
public class TestTeacher {

    public static void main(String[] args) {

        Teacher teacher1 = new Teacher(1, "shahariyr", "Male", 23);
        teacher1.DisplayInfo();

        Teacher teacher2 = new Teacher(2, "Md Akash", "Male", 25);
        teacher2.DisplayInfo();

        Teacher teacher3 = new Teacher(3, "Catrinaa Kyfe", "Female", 32);
        teacher3.DisplayInfo();
    }
}
