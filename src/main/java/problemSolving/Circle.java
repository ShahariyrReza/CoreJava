package problemSolving;

public class Circle extends Shape {

    public Circle(double r) {
        super(r, r);
    }

    @Override
    void area() {
        double result = Math.PI * dim1 * dim2;
        System.out.println("Circle area is \n"+ result +"\n");
    }

}
