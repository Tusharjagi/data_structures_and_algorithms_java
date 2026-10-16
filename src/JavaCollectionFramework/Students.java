package JavaCollectionFramework;

public class Students implements Comparable<Students> {
    public int age;
    public String name;
    public int weight;

    @Override
    public String toString() {
        return "Students{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public Students(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int compareTo(Students that) {
        return this.age - that.age;
    }
}
