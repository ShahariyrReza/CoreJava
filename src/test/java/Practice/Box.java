package Practice;

/**
 *
 * @author shahariyr reza (25.01.23)
 */
public class Box {
    double height,width,depth;

    public Box(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    void displayVol(){
        
        double vol = height * width *depth;
        System.out.println("The Volume is :"+vol);
    }
}
