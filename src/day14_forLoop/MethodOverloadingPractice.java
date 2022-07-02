package day14_forLoop;

public class MethodOverloadingPractice {


    public static void main(String[] args) {

        System.out.println(  sum(10, 20)   );

        System.out.println(  sum(10,20,30)    );
        System.out.println( sum( sum(10,20) , 30 )  );

        System.out.println(  sum(10,20,30,40)    );


        // System.out.println( sum(1.5 , 2.5)   ); ---->>> because it is double value

        System.out.println("------------------------------------");

        System.out.println(  sum(2.5, 3.5, 4.5)       );

        System.out.println( sum(1.5, 10.5 , 20.5 , 30.5)   );

        System.out.println(  sum(10,20.5)  );



    }

    // 1 Method name and 6 different method

    //            int means ; it shows us what returns as a result such as int? double? String? etc...
    public static int sum(int num1 , int num2){
        return num1 + num2;
    }

    public static int sum(int num1, int num2 , int num3  ){
        return  sum(num1,num2) + num3;
    }

    public static int sum(int num1 , int num2 , int num3 , int num4){
        return  sum(num1 , num2, num3) + num4;
    }

    public static double sum(double num1, double num2){
        return num1 + num2;
    }

    public static double sum(double num1, double num2, double num3){
        return sum(num1, num2) + num3;
    }

    public static double sum(double num1, double num2, double num3, double num4){
        return sum(num1,num2,num3) + num4;
    }




    }
