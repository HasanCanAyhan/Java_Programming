package day40_collections;

import java.util.*;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<Integer> queue1 = new PriorityQueue<>(); // order is random, allows duplicates , not accept null
        queue1.addAll(Arrays.asList(10, 200, 300, 40 , 90));
        queue1.addAll(Arrays.asList(10, 200, 300, 40 , 90));
        queue1.addAll(Arrays.asList(10, 200, 300, 40 , 90));
        //queue1.addAll(Arrays.asList(null, null, null, null , null));  not accept null

        System.out.println("PriorityQueue : ");

        System.out.println(queue1);

        //First in , first out

        int num1 = queue1.poll(); // ===>>> FIFO
        //System.out.println(num1); // 10 - at the same time will be removed

        System.out.println(queue1);

        queue1.poll();
        queue1.poll();
        queue1.poll();

        System.out.println(queue1);

        //System.out.println(queue1.get());

        System.out.println("---------------------------------------------------------");

        Queue<Integer> queue2 = new ArrayDeque<>(); // keeps insertion order, does not accept null
        queue2.addAll(Arrays.asList(10, 200, 300, 40 , 90));
        queue2.addAll(Arrays.asList(10, 200, 300, 40 , 90));

        System.out.println("ArrayDeque : ");

        System.out.println(queue2);

        queue2.poll();

        System.out.println(queue2);

        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();


        System.out.println(queue2);

        //System.out.println(queue2.get());

        System.out.println("----------------------------------------------");


        Queue<Integer> queue3 = new LinkedList<>(); // keeps insertion order, accept null, has index
        queue3.addAll(Arrays.asList(10, 200, 300, 40 , 90));
        queue3.addAll(Arrays.asList(10, 200, 300, 40 , 90));
        queue3.addAll(Arrays.asList(null, null, null));

        System.out.println("LinkedList : ");

        System.out.println(queue3);

        queue3.poll();

        System.out.println(queue3);

        System.out.println( ((LinkedList)queue3).get(4)   ); // 10

        System.out.println("---------------------------------------------------------");


        List<Integer> list = new LinkedList<>();

        list.addAll(Arrays.asList(10, 200, 300, 40 , 90));

        System.out.println(list.get(1));

        System.out.println(list);

        ( (LinkedList)list).poll(); // FIFO

        System.out.println(list);

        // ( (Stack)list ).pop();  // LIFO exception

        System.out.println(list);

    }

}
