package day22_arrayList;

public class WrapperClassMethods {

    public static void main(String[] args) {


        // parse method: returns primitive type. converts String to primitive values
        // valueOf method: returns wrapper class objects, converts String to wrapper class values

        String str ="20";

        System.out.println(str+1); // 201

        //Integer num1 = Integer.parseInt(str); // return type int  // unboxing
        int num =Integer.parseInt(str);

        System.out.println(num + 1); // 21

        Integer num2 = Integer.valueOf(str); // we can use it in the Data Structure

        System.out.println(num2); // 20

        System.out.println("-----------------------------------------");

        String s = "20.5";

        //in order to use as a number

        double num3 = Double.parseDouble(s); // primitive

        Double num4 = Double.valueOf(s);


        System.out.println(num3); // 20.5
        System.out.println(num4); // 20.5

        System.out.println("-----------------------------------------");

        String x = "true";

        boolean r1 = Boolean.parseBoolean(x);

        Boolean r2 = Boolean.valueOf(x);

        System.out.println(r1); // true
        System.out.println(r2); // true


        System.out.println("----------------------------------------");

        // Character Class

        char ch = '$';

        boolean isDigit = Character.isDigit(ch); //0 ~9

        boolean isLetter = Character.isLetter(ch);

        boolean isLowerCaseLetter = Character.isLowerCase(ch);

        boolean isUpperCaseLetter =  Character.isUpperCase(ch);

        boolean isSpecialChar = !Character.isLetterOrDigit(ch); // special character

        System.out.println("isDigit = " + isDigit);

        System.out.println("isLetter = " + isLetter);

        System.out.println("isLowerCaseLetter = " + isLowerCaseLetter);

        System.out.println("isUpperCaseLetter = " + isUpperCaseLetter);

        System.out.println("isSpecialChar = " + isSpecialChar);

        System.out.println("--------------------------------------------------");

        String string = "a1b2c3d4e5";

        int sum = 0;

        for (char each : string.toCharArray()) {

            if (Character.isDigit(each)){
               sum += Integer.parseInt(""+each);// we converted to number
            }

        }

        System.out.println("sum = " + sum);// 15

    }

}
