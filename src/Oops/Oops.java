package Oops;

public class Oops {
    public static void main (String[] args) throws Exception {
//        System.out.println("Hello words");
//        Student A = new Student();
//        A.id = 1;
//        A.age = 14;
//        A.name = "ranno";
//        A.nos = 5;
//        System.out.println(A.name);
//        System.out.println(A.age);
//        System.out.println(A.id);
//        System.out.println(A.nos);
//
//        A.bunk();
//        A.sleep();
//        A.study();

//        parameterised called
        Student A = new Student(1, 12, "rahul", 3, "tina");
//        System.out.println(A.name);
//        System.out.println(A.age);
//        System.out.println(A.id);
//        System.out.println(A.nos);
//
//        Student B = new Student(A);
//        System.out.println(B.name);
//        System.out.println(B.age);
//        System.out.println(B.id);
//        System.out.println(B.nos);
//        B.sleep();
//        System.out.println(A.getName());
        System.out.println(A.getAge());
        A.setAge(34);
        System.out.println(A.getAge());


    }
}