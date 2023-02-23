
package Practice;

/**
 * @date (19.02.23)
 * @author shahariyr reza
 */
public class StaticOne {
    String name;
    int id;
    static String deptName ="NUBTK";

    public StaticOne(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
   
    void displayInfo(){

        System.out.println("Name :"+name);
        System.out.println("Id :"+id);
        System.out.println("Dept Name :"+deptName);
    }
}

