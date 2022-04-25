package lesson16;

public class PrinterThread extends Thread{

    private final String value;
    private final int count;


    public PrinterThread(String value, int count) {
        this.value = value;
        this.count = count;
    }

    public PrinterThread(String val, int count, boolean daemon) {
        this.value = val;
        this.count = count;

    }

    public PrinterThread(String name, String val, int count) {
        super(name);
        this.value = val;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i =  0; i < count; i++) {
            System.out.println(this.getName() + ":" + value);
        }
    }
}

