package day41_maps;

import java.util.*;

public class MapClasses {

    public static void main(String[] args) {

        // if data(s) are pairs

        Map<String, Integer> hashMap = new HashMap<>();// random order, accept null key & null values
        hashMap.put("Daniel",95000); // one pair : size : 1
        hashMap.put("Emily",10000);
        hashMap.put("Bella",85000);
        //map1.put("Bella",99000); // updating so , the last one will be printed
        hashMap.put("Arron",78000);
        hashMap.put("Chris",null);
        hashMap.put("Breanna",null);
        hashMap.put(null,12000);
        hashMap.put(null,11000);
        hashMap.put(null,10000);// updating so , the last one will be printed



        System.out.println("hashMap = " + hashMap);
        //hashMap = {null=10000, Emily=10000, Breanna=null, Chris=null, Arron=78000, Daniel=95000, Bella=85000}

        System.out.println("---------------------------------------------------------------------");

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();// insertion order, accepts null key & null values
        linkedHashMap.put("Daniel",95000); // one pair : size : 1
        linkedHashMap.put("Emily",10000);
        linkedHashMap.put("Bella",85000);
        //map1.put("Bella",99000); // updating so , the last one will be printed
        linkedHashMap.put("Arron",78000);
        linkedHashMap.put("Chris",null);
        linkedHashMap.put("Breanna",null);
        linkedHashMap.put(null,12000);
        linkedHashMap.put(null,11000);
        linkedHashMap.put(null,10000);// updating so , the last one will be printed

        // how many same keys will be executed : just 1

        System.out.println("linkedHashMap = " + linkedHashMap);

        System.out.println("---------------------------------------------------------");

        Map<String, Integer> treeMap = new TreeMap<>();// sorted order, does not accept null key, accepts null values
        treeMap.put("Daniel",95000); // one pair : size : 1
        treeMap.put("Emily",10000);
        treeMap.put("Bella",85000);
        //map1.put("Bella",99000); // updating so , the last one will be printed
        treeMap.put("Arron",78000);
        treeMap.put("Chris",null);
        treeMap.put("Breanna",null); // value can be null in treeMap

        //treeMap.put(null,12000); NullPointerException --->> key can not be null in treeMap
        //treeMap.put(null,11000);
        //treeMap.put(null,10000);

        System.out.println("treeMap = " + treeMap);
        //treeMap = {Arron=78000, Bella=85000, Breanna=null, Chris=null, Daniel=95000, Emily=10000}  : keys will be sorted not values ,according to ascending order here

        System.out.println("---------------------------------------------------");

        Map<String, Integer> hashtable = new Hashtable<>(); // maintains random order, does not accept null key & values, Synchronized
        hashtable.put("Daniel",95000); // one pair : size : 1
        hashtable.put("Emily",10000);
        hashtable.put("Bella",85000);
        //map1.put("Bella",99000); // updating so , the last one will be printed
        hashtable.put("Arron",78000);
        //hashtable.put("Chris",null); // NullPointerException-->> Value in HashTable can not be null
        //hashtable.put("Breanna",null);
        //hashtable.put(null,12000); // NullPointerException-->> Key in HashTable can not be null
        //hashtable.put(null,11000);

        try {
            hashtable.put("Diana",10000); // unchecked
        }catch (RuntimeException e){
            e.printStackTrace();
        }


        System.out.println("hashtable = " + hashtable);
        //hashtable = {Arron=78000, Daniel=95000, Diana=10000, Emily=10000, Bella=85000}

    }

}
/*
pair : name     salary
       Daniel = 95000
       Emily = 100000
       Bella = 85000


 */
