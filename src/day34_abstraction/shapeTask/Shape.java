package day34_abstraction.shapeTask;

public abstract class Shape {

    private final String name;

    public Shape() {
        this.name = getClass().getSimpleName();
    }

    public String getName() {
        return name;
    }


    public abstract double area();
    public abstract double perimeter();




    @Override
    public String toString() {
        return   name+"{" +
                "area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }


}
