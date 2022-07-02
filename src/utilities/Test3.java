package utilities;

import day31_inheritance.ProtectedAccessModifier;

public class Test3 extends ProtectedAccessModifier{

    // different package

    // if it is SUBCLASS, then the protected access modifier is visible

    public static void main(String[] args) {
        System.out.println(ProtectedAccessModifier.a);
        ProtectedAccessModifier.method1();
    }



}
