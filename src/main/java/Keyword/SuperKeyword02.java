
package Keyword;

public class SuperKeyword02 extends SuperKeyword01 {
    int x = 20;
    @Override
    void Display(){
        
        super.Display();
        System.out.println(super.x);
    }
}
