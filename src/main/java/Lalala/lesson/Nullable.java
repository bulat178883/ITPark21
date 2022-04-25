package Lalala.lesson;

public class Nullable {
        public static String hello() {
            return "Hello!";
        }
    }
    public class Test {
        public static void main(String[] args) {
            Nullable nullable = null;
            System.out.println(nullable.hello());
        }
    }
}
