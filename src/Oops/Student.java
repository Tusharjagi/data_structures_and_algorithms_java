package Oops;

public class Student {
//   Attributes
    private  int id;
    private  int age;
    private String name;
    private int nos;
    private  String gf;

    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public int setAge(int a) {
//        extra layer
        return this.age = a;
    }

//    public ctor
    public  Student() {
        System.out.println("Student Default ctor called");
    }

//    parameterised ctor
    public Student(int id, int age, String name, int nos, String gf) {
        System.out.println("Student parameterised ctor called");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
        this.gf = gf;
    }

//    copy ctor
    public Student(Student srcobj) {
        System.out.println("Student copy ctor called");
        this.id = srcobj.id;
        this.age = srcobj.age;
        this.name = srcobj.name;
        this.nos = srcobj.nos;
    }



//    Methods / behaviours

    public void study() {
        System.out.println(name + " Studying");
    }
    public void sleep() {
        System.out.println(name + " Sleeping");
    }
    public void bunk() {
        System.out.println(name + " Bunking");
    }
    private  void gfChatting() {
        System.out.println(name + "Chatting");
    }
}
