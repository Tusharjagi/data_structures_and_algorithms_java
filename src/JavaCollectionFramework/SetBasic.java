package JavaCollectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetBasic {
    void main () {
        HashSet<Student> set = new HashSet<>();

        Student s1 = new Student(1, "tango");
        Student s2 = new Student(1, "tango");
        Student s3 = new Student(2, "tango");
        set.add(s1);
        set.add(s2);
        set.add(s3);

        System.out.println(set);

//        Set<Integer> s1 = new HashSet<>();
//        Set<Integer> s2 = new HashSet<>();
//
//        s1.add(1);
//        s1.add(2);
//        s1.add(3);
//        s1.add(4);
//
//        s2.add(3);
//        s2.add(4);
//        s2.add(7);
//        s2.add(8);
//
//        System.out.println(s1);
//        s1.retainAll(s2);
//        System.out.println(s1);
//
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s2.containsAll(s1));


//      HashedSet -> O(1)
//      LinkedHashSet -> O(n)
//      TreeSet -> BST -> O(logn)

//        Set<Integer> s = new TreeSet<>();
//        s.add(10);
//        s.add(20);
//        s.add(20);
//        s.add(30);
//        s.add(40);
//        s.add(40);
//        s.add(40);
//        s.add(40);
//        s.add(40);
//
//        System.out.println("Print set: " + s);
    }
}
