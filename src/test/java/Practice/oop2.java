package Practice;

/**
 *
 * @author shaha
 */
public class oop2 {

    public static void main(String[] args) {
        Student s1 = new Student(1, "Tahsan Hasib", "CSE", "tahsanhasib2018@gmail.com");
        s1.DisplayInfo();
        System.out.println("\n");

        Student s2 = new Student(2, "Shahariyr Reza", "CSE", "shahariyr.reza@hotmail.com");
        s2.DisplayInfo();
        System.out.println("\n");

        Student s3 = new Student(3, "Altaf Hossain", "Philosofy", "ahsagor@gmail.com");
        s3.DisplayInfo();

    }

}
