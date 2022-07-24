package day41_maps;

import java.util.Map;
import java.util.TreeMap;

public class MapMethods {

    public static void main(String[] args) {

        Map<String , String> map = new TreeMap<>();
        System.out.println(map.size()); // 0
        map.put("C02","Josh");
        map.put("B03","Nora");
        map.put("A02","Khashayar");
        map.put("D02","Abidullah");
        map.put("A03","Tatiana");
        map.put("A04","Tatiana");
        map.put("A05","Tatiana");
        map.put("A06","Tatiana");
        map.put("A07","Tatiana");


        System.out.println(map.size());
        System.out.println(map);


        System.out.println( map.get("A04"));

        map.put("A04", "Lucy"); // put method used for updating the value
        map.put("A06", "Madiyar");

        System.out.println(map);

        System.out.println( map.get("B03"));

        map.replace("C02","Aseel"); // replace method used for updating the value like put method, but replace() is faster than put()
        map.replace("A07","Maria");

        System.out.println(map);

        map.remove("A05","Tatiana"); // size will be decreased by 1

        System.out.println(map);

        System.out.println(  map.containsKey("B03")  ); // true
        System.out.println(  map.containsKey("H98") ); // false

        System.out.println(  map.containsValue("Lucy") ); // true
        System.out.println(  map.containsValue("Muhtar") ); // false

        System.out.println(map.isEmpty()); // false

        System.out.println("----------------------");

        System.out.println( map.equals(map)  ); // true comes from Object class as overridden
        // sma pairs and same order should be same if it is true



        map.clear();

        System.out.println(map);


    }

}
/*

pair : id - name

 */