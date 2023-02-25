package StaticVariable;

/**
 *
 * @author shahariyr reza
 * Date (23.02.23)
 */
public class StaticBlock {
    
    static int x;
    static String name;
    
    static {
    
    x= 001;
    name = "Shahariyr Reza";
    
    }
    
    static void Display(){
    
        System.out.println("ID :"+x);
        System.out.println("Name :"+name);
    }
    
    public static void main(String[] args) {
        StaticBlock.Display();
    }
}
