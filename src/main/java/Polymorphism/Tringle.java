package Polymorphism;

public class Tringle extends Area{

    double base, height;

    Tringle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    @Override
    double area(){
    return 0.5*base*height;
    }
}
