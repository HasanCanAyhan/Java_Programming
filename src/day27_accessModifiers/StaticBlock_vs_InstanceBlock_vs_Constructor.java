package day27_accessModifiers;

public class StaticBlock_vs_InstanceBlock_vs_Constructor {

    public StaticBlock_vs_InstanceBlock_vs_Constructor(){
        System.out.println("Constructor");
    }

    // instance block, it depends on object
    {
        System.out.println("Instance Block");
    }

    static {
        System.out.println("Static Block");
    }

    public static void main(String[] args) {

        System.out.println("Main Method");

    }



}
