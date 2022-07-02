package day11_string;

public class StringMethods2 {

    public static void main(String[] args) {

        // replace

        String sentence = "I love Python, Python is the best programming language, and Python is in high demand";

        sentence = sentence.replace("Python" , "Java");

        System.out.println(sentence);

        //-------------------------------------------------------

        String word = "java";

      //  word = word.replace('a' , 'e'); // jeve

        word = word.replace("a", "e");

        System.out.println(word);


        System.out.println("--------------------------------------------");

        // replaceFirst

        String sentence2 = "I love Java, Java is cool";

        //sentence2 = sentence2.replace("Java" , "Python");

        sentence2 =  sentence2.replaceFirst("Java" , "Python");

        System.out.println(sentence2);

        //---------------------------------------------------------------------

        String sentence3 = "Java is fun, Java is cool, Java is amazing";

        //sentence3 = sentence3.replace("Java" , "Python");
        sentence3 = sentence3.replaceFirst(", Java", ", Python");

        System.out.println(sentence3);

        System.out.println("--------------------------------------------");

        // substring()

        String sentence4 = "I love Java Programming";
        //                  01234567890
        //String languageName = sentence4.substring(7,10); // Jav
        String languageName = sentence4.substring(7,10 + 1); // Java

        System.out.println(languageName);

        //------------------------------------------

        String sentence5 = "Today is Sunday, Tomorrow is Monday";
        //                  0123456789012345
        String today = sentence5.substring(9, 14+1); // Sunday

        System.out.println(today);

        //------------------------------------------

        String email = "CydeoSchoolJavaProgramming@yahoo.com";

        int beginning = email.indexOf("@") +1; // the index num of "g" because generell in email @ ...... .
        int ending = email.lastIndexOf("."); // the index of "."

        String domain = email.substring(beginning,ending);

        System.out.println("domain = " + domain); //  yahoo

        //------------------------------------------

        String sentence6 = "I love Java programming";
        //                  01234567
        //String r1 = sentence6.substring(7, sentence6.length() );
        String r1 = sentence6.substring(7);
        System.out.println("r1 = " + r1); // Java programming


        //--------------------------------------------


        String sentence7 = "Today is Sunday, Tomorrow is Monday";

        // create the substring "Monday" from sentence7. Do NOT count any index numbers

        String tomorrow = sentence7.substring(sentence7.lastIndexOf(" ") + 1);

        System.out.println(tomorrow);


        System.out.println("--------------------------------------------");

        // replace


        String str ="Python";

       String result =  (str + "\n").repeat(10);

        System.out.println(result);










    }

}
