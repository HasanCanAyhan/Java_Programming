package day36_polymorphism;

public class Square {


    private double side;

    public Square(double side) {
        this.side = side;
    }


    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof Square)){
            System.err.println("Invalid Object, Object must be square");
            System.exit(1);
        }

        if (side == ((Square)obj).side){ // reference type Object, we should be cast it to Square // down-casting
            return true;
        }

        return false;

    }

/* NOTE :  Equals method for custom classes

To give the customized conditions for the custom class objects to be equal
And in the original equal method you do not have the conditions that you wanted to check to see if two custom objects are equal
That’s why you have to override and give them by yourself

we have always override in subclass correct?
-Yes. If each subclass requires different conditions to determine if they are equal

 */


}
