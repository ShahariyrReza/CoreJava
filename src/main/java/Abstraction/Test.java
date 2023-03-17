package Abstraction;

public class Test {

    public static void main(String[] args) {
        MobileUser m1;
        
        m1 = new Rahim();
        m1.SendMessage();

        m1 = new Karim();
        m1.SendMessage();
    }
}
