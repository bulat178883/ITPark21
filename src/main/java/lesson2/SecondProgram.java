package lesson2;

public class SecondProgram {


    public static void main(String[] args) {
        System.out.println("Привет, мир!");

        long summa = summa(3, 5);
        System.out.println(summa);
        long otherSumma = summa(5, 5);
        System.out.println(otherSumma);

        long resultOfMinus = minus(20, 2);
        System.out.println(resultOfMinus);

    }

    public static long summa(int arg1, int arg2) {
        int result = arg1 + arg2;
        return result;
    }

    public static long minus(int arg1, int arg2) {
        return arg1 - arg2;
    }
}


