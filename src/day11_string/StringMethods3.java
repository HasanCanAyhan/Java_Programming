package day11_string;

public class StringMethods3 {

    public static void main(String[] args) {

        // isEmpty

        String word= "";

        boolean r1 = word.isEmpty();// true

        System.out.println(r1);


        System.out.println("---------------------------------");

        // isBlank

        String str = "        ";

        boolean r2 = str.isEmpty();// false

        boolean r3 = str.isBlank(); // true

        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);


        System.out.println("---------------------------------");

        // equals

        String str1 = "Cydeo";

        String str2 = new String("Cydeo");

        System.out.println(str1 == str2);// false

        System.out.println( str1.equals(str2) ); // true
        
        // equalsIgnoreCase

        String str3 = new String("cydeo");

        System.out.println( str2.equals(str3)); // false

        String s1 = "JAVA";
        String s2 = "java";

        System.out.println( s1.equals(s2)); // false

        System.out.println( s1.equalsIgnoreCase(s2)); // true
        
        //--------------------------------------------
        
        // yes , Yes, yES, YeS === yes 

        System.out.println("---------------------------------");
        
        // contain
        
        String students = "Hasan Naran Sumeye Natalia";
        
        boolean hasAhmed = students.contains("Ahmed"); // false

        System.out.println("hasAhmed = " + hasAhmed);

        String sentence = "My favorite programmıng language is JAVA";

        boolean hasJava = sentence.toLowerCase().contains("java");

        // boolean hasJava = sentence.equalsIgnoreCase("java);    // no different!

        System.out.println("hasJava = " + hasJava); // true

        System.out.println("---------------------------------");

        // startWith endsWith

        String name = "Micheal";

        boolean l = name.startsWith("Da");

        System.out.println(l); // false

        String url = "www.cydeo.com";

        boolean isValid = url.startsWith("www.");

        System.out.println(isValid);// true

        //------------------------------------

        boolean t = url.endsWith(".com");

        System.out.println(t);// true


        String email = "CydeoSchool@gmail.com";

        boolean isGmail = email.endsWith("gmail.com");

        boolean isYahoo = email.endsWith("yahoo.com");

        boolean isHotMail = email.endsWith("hotmail.com");

        System.out.println("isGmail = " + isGmail); // true
        System.out.println("isYahoo = " + isYahoo); // false
        System.out.println("isHotMail = " + isHotMail); // false












    }

}
