package Inheritance;

/**
 *
 * @author Shahariyr Reza
 */
public class TestOverriding {

    public static void main(String[] args) {
        PersonOverriding p1 = new PersonOverriding();
        p1.setName("Shahariyr Reza", 23);
        p1.DisplayInfo();
        
        TeacherOverriding t1 = new  TeacherOverriding();
        t1.teacherName(1, "Physics Teacher");
        t1.DisplayInfo();
    }
}
