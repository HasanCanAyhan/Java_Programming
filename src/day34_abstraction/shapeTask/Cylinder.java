package day34_abstraction.shapeTask;

public class Cylinder extends Shape implements Volume{

    private double radius, height;

    public final static double PI;

    public Cylinder(double radius, double height) {
        setRadius(radius);
        setHeight(height);
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    @Override
    public double area() {
        return 2 * PI * radius * (radius + height);
    }

    @Override
    public double perimeter() {
        return 2 * PI* radius;
    }


    @Override
    public double volume() {
        return PI * radius + radius * height;
    }

    @Override
    public String toString() {
        return super.toString().replace("}","") +
                ", volume=" + volume() +
                '}';
    }


}
