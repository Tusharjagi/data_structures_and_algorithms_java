package JavaCollectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class StackBasic {
    void main () {
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);
    }
}
