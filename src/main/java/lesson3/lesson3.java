package lesson3;

public class lesson3 {

    public static void main(String[] args) {

        double a = 0;
        double b = 80;
        double c = 6;
        double x1, x2;
        double Discriminant = b * b - 4 * a * c;

        if (a == 0) System.out.println(" первый коэффициет не может 0");

        else if (Discriminant > 0) {
            x1 = (-b + Math.sqrt(Discriminant)) / (2 * a);
            x2 = (-b - Math.sqrt(Discriminant)) / (2 * a);
            System.out.printf("x1 = %s , x2 = %s", x1, x2);
        } else if (Discriminant == 0) {
            x1 = (-b) / (2 * a);
            System.out.printf("x1 = x2 =%s", x1);
        } else {
            System.out.println("Нет действительных решений уравнения");

        }
    }
}