package lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class lesson6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int n = scn.nextInt();

        double[] array = new double[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * 10;
        }
        System.out.println(Arrays.toString(array));

        double max = array[0];
        double min = array[0];
        double avg = 0;

        for (int o = 0; o < array.length; o++) {
            if (max < array[o])
                max = array[o];
            if (min > array[o])
                min = array[o];
            avg = avg + array[o] / array.length;
        }

        System.out.println(max);
        System.out.println(min);
        System.out.println(avg);
    }
}
