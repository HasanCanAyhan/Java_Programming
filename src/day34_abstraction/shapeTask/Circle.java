package day34_abstraction.shapeTask;

public class Circle extends Shape{

    private double radius;
    public final static double PI;

    public Circle(double radius) {
        setRadius(radius);
    }


    static {
        PI = 3.14;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double area() {
        return radius * radius * PI;
    }

    @Override
    public double perimeter() {
        return 2 * radius * PI;
    }





}
