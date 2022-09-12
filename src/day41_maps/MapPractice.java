package day41_maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {

        // key serves as index

        //          Object Class because parent of class like String ....  Wrapper Classes
        Map<String,Object> person1 = new LinkedHashMap<>();
        person1.put("name","Arthur");
        person1.put("gender",'M'); // Character Object
        person1.put("age",32);
        person1.put("job_title","Developer");
        person1.put("salary",100000.5);
        person1.put("married",true); // Boolean Object


        System.out.println(person1);
        System.out.println( person1.get("name") ) ;
        System.out.println( person1.get("salary") ) ;
        System.out.println( person1.get("job_title") ) ;
        //System.out.println( person1.get(0) ) ; // null : there is no key as 0



    }



}
