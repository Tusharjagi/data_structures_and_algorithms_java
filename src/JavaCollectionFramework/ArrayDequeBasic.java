package JavaCollectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ArrayDequeBasic {
    void  main () {
        Deque<Integer> q = new ArrayDeque<>();
        q.offer(10);
        q.offerFirst(5);
        q.offerLast(50);

        q.pollLast();
        System.out.println(q);
        q.pollFirst();
        System.out.println(q);

        System.out.println(q.size());
        System.out.println(q.peek());

    }
}
