package problemSolving;

public class Triangle extends Shape {

    public Triangle(double base, double height) {
        super(base, height);
    }

    @Override
    void area() {
        double result = 0.5 * dim1 * dim2;
        System.out.println("Area of Triangle is \n" + result);
    }

}
