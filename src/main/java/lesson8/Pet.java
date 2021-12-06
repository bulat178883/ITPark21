package lesson8;

public class Pet {
    public static void main(String[] args) {
        Cat robot = new Cat("кот робот", "3", "млекопитающие", "мяу");
        Dog keks = new Dog("пёс кекс", "6", "млекопитающие", "гав");
        Parrot kesha = new Parrot("попугай кеша", "8", "пернатые", "кеша хороший");

        System.out.println(robot);
        System.out.println(keks);
        System.out.println(kesha);
    }
}
