package lesson8;

public class Pet {
    public static void main(String[] args) {
        Cat robot = new Cat("кот робот", 2, "mammals");
        Dog keks = new Dog("пёс кекс", 6, "mammals");
        Parrot kesha = new Parrot("попугай кеша", 4, "feathered");
        System.out.println(robot);
        System.out.println(keks);
        System.out.println(kesha);
    }
}
