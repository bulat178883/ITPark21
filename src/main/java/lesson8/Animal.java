package lesson8;

import java.io.File;

public class Animal {

     File file = new File ("лай.wav");



    private String name;
    private String age;
    private String kind;
    private String voice;

    public Animal(String name, String age, String kind, String voice) {
        this.name = name;
        this.age = age;
        this.kind = kind;
        this.voice = voice;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", kind='" + kind + '\'' +
                ", voice='" + voice + '\'' +
                '}';
    }
}


