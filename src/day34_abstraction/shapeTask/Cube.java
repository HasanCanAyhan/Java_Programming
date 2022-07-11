package day34_abstraction.shapeTask;

public class Cube extends Shape implements Volume{

    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    @Override
    public double area() {
        return 6 * side * side;
    }

    @Override
    public double perimeter() {
        return 12 * side;
    }


    @Override
    public double volume() {
        return side * side * side;
    }

    @Override
    public String toString() {
        return super.toString().replace("}","") +
                ", volume=" + volume() +
                '}';
    }


}
