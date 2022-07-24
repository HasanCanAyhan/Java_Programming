package day42_maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class IteratingMaps {

    public static void main(String[] args) {

        // keySet(), values() , entrySet()  returns Set, because no duplicates

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Daniel",95000); // one pair : size : 1
        map.put("Emily",10000);
        map.put("Bella",85000);
        map.put("Arron",78000);                      // 6 entries :  6 key & 6 values
        map.put("Jimmy",78000);
        map.put("Breanna",98000);

        System.out.println(map);


        // Iterating the map by the keys

        for (String eachKey : map.keySet()) {
            System.out.println(eachKey);

            //map.replace(eachKey, map.get(eachKey) * 2  );
        }

        System.out.println(map);

        System.out.println("---------------------------------------------------");

        // Iterating the map by the values

        for (  Integer  eachValue  :  map.values()  ){
            System.out.println(eachValue);
        }

        System.out.println("---------------------------------------------------");

        // entry contains keys  & values i the map

        // Iterating the map by the entries / pairs (keys & values)

        //        Entry is Inner Interface of the Map , called through the Map
        for ( Map.Entry<String , Integer>  eachEntry   : map.entrySet() ){
            System.out.println(eachEntry);
        }


        System.out.println("---------------------------------------------------");


        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            //System.out.println( eachEntry.getKey() + " : " + eachEntry.getValue()  );
            String eachKey = eachEntry.getKey();
            Integer eachValue = eachEntry.getValue();

            eachEntry.setValue(eachValue + 10000);

            System.out.println(eachKey + " : " + eachValue);
        }

        System.out.println(map);

    }


}
