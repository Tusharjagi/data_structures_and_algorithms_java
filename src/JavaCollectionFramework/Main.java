package JavaCollectionFramework;

import java.awt.datatransfer.FlavorListener;
import java.util.*;

public class Main {
    void main () {
//  List or collection -> interface

        List<Integer> list = new Stack<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.add(40);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);

//        add all
        List<Integer> list2 = new Stack<>();
        list2.add(101);
        list2.add(102);
        list2.add(20);
        list.addAll(list2);
        System.out.println(list);

        list.removeAll(list2);
        System.out.println(list);

        System.out.println(list.size());

        System.out.println("printing list2: " + list2);
        list2.clear();
        System.out.println(list2.size());

//        traverse list using iterator

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
        }

        List<Integer> list3 = new LinkedList<>();
        list3.add(11);
        list3.add(12);
        list3.add(14);
        System.out.println(list3.get(2));
        System.out.println("Before set: " + list3);
        list3.set(0, 100);
        System.out.println("After set: " + list3);

//        toArray
        Object[] arr = list3.toArray();
        for (Object obj: arr) {
            System.out.println(obj);
        }

//        contains

        System.out.println(list3.contains(1000));

        Collection<Integer> collection = new ArrayList<>();

        list.add(12);
        list.add(6);

        System.out.println("Printing enter list: " + list);

        System.out.println("sorting");

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

//        clone
//        ArrayList<Integer> newList = (ArrayList<Integer>)<Integer>) list.clone();
//        System.out.println(newList);

        LinkedList<Integer> marks = new LinkedList<>();
//        marks.ensureCapacity(100);

        System.out.println(marks.isEmpty());

        list.add(30);
        list.add(24);
        list.add(30);

        System.out.println(list);
        System.out.println(list.lastIndexOf(30));


//        System.out.println(list.indexOf(100));

//        addFirst and add addLast
        System.out.println("Current list: " + list);

//        list.remove(3);
//        list.remove(3);
//        list.remove(3);
//        list.remove(3);
        System.out.println("Current list: " + list);

        list.addFirst(101);
        list.addLast(102);
        System.out.println("Current list: " + list);

//        list.removeFirst();
//        System.out.println(list);
//
//        list.removeLast();
//        System.out.println(list);

//        System.out.println(list.getFirst());
//        System.out.println(list.peek());

//        System.out.println(list.);

        LinkedList<Integer> listnew = new LinkedList<>();

        listnew.add(10);
        listnew.add(20);
        listnew.add(30);
        System.out.println(listnew);
        System.out.println(listnew.poll());
        System.out.println(listnew);
        System.out.println(listnew.offer(20));
        System.out.println(listnew);

        Vector<Integer> vector = new Vector<>();
        vector.add(12);
        vector.add(23);
        vector.add(90);

        System.out.println(vector);

        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(1);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println("Stack: " + stack);
//        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println("Search: " + stack.search(10));
        System.out.println(stack.empty());


    }

}
