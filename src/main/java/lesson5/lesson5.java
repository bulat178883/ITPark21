package lesson5;

import java.util.Scanner;

public class lesson5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число Фиббоначи:");
        while (!scanner.hasNextInt()) {
            String text = scanner.next();
            System.out.println("Ожидается ввод необходимого числа Фиббоначи " + text);
        }
        int n = scanner.nextInt();
        System.out.println("наконец-то введено необходимое число " + n);
    }
}















