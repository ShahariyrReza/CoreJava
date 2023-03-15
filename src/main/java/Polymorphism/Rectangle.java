package Polymorphism;

public class Rectangle extends Tringle {

    double length, width;

   
    public Rectangle(double length, double width) {

        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}
