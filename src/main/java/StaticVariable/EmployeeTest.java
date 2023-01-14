package StaticVariable;

/**
 * @work making a static variable.
 * @author shahariyr reza 12.01.23
 */
public class EmployeeTest {

    public static void main(String[] args) {
        Employee E1 = new Employee(101, "Shahariyr");// in peramiter we don't give the common dept name.
        E1.DisplayInfo();

        Employee E2 = new Employee(102, "Akash");
        E2.DisplayInfo();

        Employee E3 = new Employee(103, "Sagor");
        E3.DisplayInfo();
        
        System.out.println("The static variable here is:"+Employee.DeptName);
    }
}
