package StaticVariable;

/**
 * @work making a static variable.
 * @author shahariyr reza 12.01.23
 */
public class Employee {

    int Id;
    String Name;
    static String DeptName = "Manager"; // in peramiter we don't give the common dept name. It is called a Static Variable.

    Employee(int Id, String Name) {
        this.Id = Id;
        this.Name = Name;

    }

    void DisplayInfo() {

        System.out.println("Id :" + Id);
        System.out.println("Name :" + Name);
        System.out.println("Department :" + DeptName);
    }

}
