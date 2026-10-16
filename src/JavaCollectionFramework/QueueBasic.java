package JavaCollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueBasic {
    void main () {
        Queue<Integer> q = new LinkedList<>();

        q.offer(10);
        q.offer(20);
        q.offer(30);

        System.out.println("Print q: " + q);
//        System.out.println(q.element());
//        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q);
    }
}
