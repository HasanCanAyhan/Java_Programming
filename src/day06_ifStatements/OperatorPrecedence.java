package day06_ifStatements;

public class OperatorPrecedence {

    public static void main(String[] args) {

        System.out.println(  5 + 2 * 3  );
        //                   5 +   6

        System.out.println(  7 + 3 - 2 / 2  );
        //                   7 + 3 - 1   ====> 9


        System.out.println(  -5 + 3   );
        //                     -2

        System.out.println(  !true == false  );
        //                    false == false

        System.out.println(   10 > 9  == 8 < 7     &&   "Java" == "Python"  || 'a' == 'A'    );
        //                       true  == false    &&   "Java" == "Python"  || 'a' == ' A'
        //                              false      &&          false        ||  false
        //                                       false ||  false
        //                                             false


        System.out.println(   100 >= 20 && 40 * 2 > 60 );
        // first * :          100 >= 20 && 80 > 60
        // second >= :            true   &&    true
        // third && :                   true


        int a = 20;

        a += 10 + 2 *3;
        // first * : a += 10 + 6
        // second + : a += 16
        // third += : a = 36



    }


}
