

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

       /* queue.put("Gia");
        queue.put("Jackson");
        queue.put("Najda");
        Object name1 = queue.get();
        System.out.println(name1);
        Object name2 = queue.get();
        System.out.println(name2);
        Object name3 = queue.get();
        System.out.println(name3);
        */

        PutGets3 three = new PutGets3(queue);
        PutGets100 hundred = new PutGets100(queue);
        PutGets5 five = new PutGets5(queue);
        Thread thread1 = new Thread(three);
        Thread thread2 = new Thread(hundred);
        Thread thread3 = new Thread(five);
        thread2.start();
        thread3.start();
        thread1.start();
/*
        for (int i = 0; i < 100; i++) {
            queue.put( i);
        }

        for (int i = 0; i < 100; i++) {
            Object obj1 = queue.get();
            System.out.println(obj1);
        }

        queue.put("Hernandez");
        Object name4 = queue.get();
        System.out.println(name4);

    }

 */
    }
}