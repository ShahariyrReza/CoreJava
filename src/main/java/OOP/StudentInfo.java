
package OOP;

/**
 *
 * @author shahariyr reza
 */
public class StudentInfo {
    public static void main(String[] args) {
        Student student1 = new Student();
        
        Student student2 = new Student(101,"Shahariyr");
        student2.DisplayInfo();
        
        Student student3 = new Student(102,"Sagor Islam","Sagor@gmail.com");
        student3.DisplayInfo();
        
    }
}
