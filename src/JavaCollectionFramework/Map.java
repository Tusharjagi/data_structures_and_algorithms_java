package JavaCollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Map {
    void main () {
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

        List<Students> students = new ArrayList<>();

        students.add(new Students(19, "vipul", 68));
        students.add(new Students(23, "tango", 90));
        students.add(new Students(21, "ankit", 82));
        students.add(new Students(7, "rahul", 12));

        System.out.println(students);

        Collections.sort(students);

        System.out.println(students);
    }
}
