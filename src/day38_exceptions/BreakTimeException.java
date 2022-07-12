package day38_exceptions;

public class BreakTimeException extends RuntimeException { // unchecked


    public BreakTimeException(){ // default constructor
        super("It´s break time");
    }

    public BreakTimeException(String message){
        super(message);
    }


}
