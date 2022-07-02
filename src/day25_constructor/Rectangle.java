package day25_constructor;

public class Rectangle {

    public double length, width;


    /*
    public void setInfo(double lenght, double width){
        this.length = lenght;
        this.width = width;
    }


     */

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area(){
        return  length * width;
    }


    public String toString() {
        return "Rectangle{" +
                "lenght=" + length +
                ", width=" + width +
                ", area=" + area() +
                '}';
    }
}
