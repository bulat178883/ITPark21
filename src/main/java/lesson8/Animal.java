package lesson8;

public class Animal {

    private String name;
    private int age;
    private String kind;

    public Animal(String name, int age, String kind) {
        this.name = name;
        this.age = age;
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", kind='" + kind + '\'' +
                '}';
    }
}

