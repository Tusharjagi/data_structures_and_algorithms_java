package JavaCollectionFramework;

import java.lang.reflect.Array;
import java.util.*;

public class Map {
    void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(15);
//        list.add(8);
//        list.add(2);
//        list.add(90);
//
//        System.out.println(list);
//
//        Collections.sort(list);
//        System.out.println(list);

//        List<Students> students = new ArrayList<>();
//
//        students.add(new Students(19, "vipul", 68));
//        students.add(new Students(23, "tango", 90));
//        students.add(new Students(23, "ankit", 82));
//        students.add(new Students(7, "rahul", 12));
//
//        System.out.println(students);

//        Collections.sort(students, new Comparator<Students>() {
//            @Override
//            public int compare(Students o1, Students o2) {
//                return o1.weight - o2.weight;
//            }
//        });
//        Collections.sort(students, new WeightComparator());

//        Collections.sort(students, (o1, o2) -> o1.age -o2.age);

//      comparing
//        then comparing

//        System.out.println(students);

        Integer[] arr = {5, 1, 7, 2, 8, 4};
        Arrays.sort(arr, new reverseComparator());
        for (int a: arr) {
            System.out.println(a + " ");
        }
    }
}
