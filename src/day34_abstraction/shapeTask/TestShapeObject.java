package day34_abstraction.shapeTask;

public class TestShapeObject {

    public static void main(String[] args) {

        Circle circle = new Circle(2);

        Square square = new Square(4);

        Cube cube = new Cube(3);

        Cylinder cylinder = new Cylinder(2,3);


        System.out.println(circle);
        System.out.println(square);
        System.out.println(cube);
        System.out.println(cylinder);

        System.out.println(cube.hasVolume);


    }

}
