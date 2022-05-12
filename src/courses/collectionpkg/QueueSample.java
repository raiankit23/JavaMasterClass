package courses.collectionpkg;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueSample {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("Apple");
        queue.add("Orange");
        queue.add("Grape");
//        System.out.println(queue.peek());
//        System.out.println(queue.remove());
        for (String fruit : queue){
            System.out.println(fruit);
        }
    }
}
