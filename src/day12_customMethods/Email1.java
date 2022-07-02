package day12_customMethods;

public class Email1 {

    public static void main(String[] args) {


        String email = "mike_tyson@gmail.com";

        String fN = email.substring(0,email.indexOf("_"));
        System.out.println("fN = " + fN);

        String lN = email.substring( email.indexOf("_") +1, email.indexOf("@")    );
        System.out.println("lN = " + lN);

        if (email.contains("_")){


            // mike_tyson@gmail.com
            email = email.replaceAll(lN,fN);

            System.out.println("email = " + email); // mike_mike@gmail.com

            email = email.replaceFirst(fN,lN);// tyson_mike@gmail.com

            System.out.println("email = " + email);



        }else{
            System.out.println(email);
        }



    }

}
