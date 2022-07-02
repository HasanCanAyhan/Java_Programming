package day24_dateAndTime;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "aaaabbbbccccc";

                                //a3b4c5

        String result = "";

        //                      strArray
        for (String each : str.split("")) {
            int frequency = Collections.frequency(    Arrays.asList(str.split("") ), each  );
            //                                        we converted Array to CollectionType ,  (it has to be non-primitive type such as String)
            if( !result.contains(each)   ){
                result += each + frequency;
            }

        }


        System.out.println(result); // a4b4c5

    }

}
