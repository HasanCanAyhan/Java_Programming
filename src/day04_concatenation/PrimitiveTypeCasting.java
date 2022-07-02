package day04_concatenation;

import com.sun.security.jgss.GSSUtil;

public class PrimitiveTypeCasting {

    public static void main(String[] args) {

        //----------------Implicit casting----------

        // short ----to-->>>> large (byte < short < int < long < float < double)

        byte a = 15;

        short b = (short) a;

        int c = a; // implicit casting

        System.out.println(b);


        long d = 3000l;

        float f = d; // implicit casting

        System.out.println(f);


        //----------------Explicit casting----------

        // large  ----to-->>>> short

        int x = 100;

        byte y = (byte)x; // explicit casting


        float z = 20.8f;

        short q = (short)z; // explicit casting

        System.out.println(q);

        double n1 = 2.5;

        byte n2 = (byte) n1; // n1 = 2.5

        System.out.println(n2);


        System.out.println("---------------------");

        int num = 500;

        byte result = (byte) num;  // explicit casting

        System.out.println(result);  // false : out of the range of short


        int r = 50000;

        short t = (short) r;

        System.out.println(t);  // false : out of the range of short

        System.out.println("---------------------");

        double u = 3000.5;

        int p = (int) u; // 3000

        System.out.println(p);

        int o = 100;

        double d1 = o;

        System.out.println(d1); // 100.0



    }

}
