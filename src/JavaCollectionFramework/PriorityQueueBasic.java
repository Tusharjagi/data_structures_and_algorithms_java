package JavaCollectionFramework;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueBasic {
    void main () {
//      default behaviour -> integers -> less value -> high priority queue -> minHeap

        Queue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        pq.offer(40);
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq);

    }
}
