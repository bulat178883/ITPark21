package lesson16;

public class ThreadRunner extends Thread {

    public static void main(String[] args) throws Exception {
        int a = 15;
        int b = 20;
        Thread printerThread1 = new PrinterThread("Первый поток printer", "Привет, мир", 5);
        Thread.State state = printerThread1.getState();
        Thread printerThread2 = new PrinterThread("Добро пожаловать!", 1);
        Thread.State state2 = printerThread2.getState();
        printerThread1.start();
        printerThread1.join();
        printerThread1.sleep(5000);
//        printerThread1.start();
        printerThread1.join();
        printerThread2.start();
        printerThread2.join();
        printerThread2.sleep(5000);
//        printerThread2.start();
        printerThread2.join();
        new Thread(() -> print(Thread.currentThread().getName() + ":" + summa(a, b))).start();
        System.out.println(Thread.currentThread().getName());
    }

    private static int summa(int a, int b) {
        return a + b;
    }

    private static void print(Object ob) {
        System.out.println(ob);
    }

    public class State {
        public static String State(Thread.State ts) {
            if (ts == Thread.State.BLOCKED)
                return "BLOCKED";
            if (ts == Thread.State.NEW)
                return "NEW";
            if (ts == Thread.State.RUNNABLE)
                return "RUNNABLE";
            if (ts == Thread.State.TIMED_WAITING)
                return "TIMED_WAITING";
            return "WAITING";
        }
    }
}

