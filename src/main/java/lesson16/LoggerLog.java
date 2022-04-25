package lesson16;
import java.util.logging.Level;
//import org.apache.log4j.Logger;
import java.io.*;
import java.util.Date;

public class LoggerLog {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(LoggerLog.class.getName());

    public static void main(String[] args) throws Exception {
        logger.log(Level.INFO, "info");
        logger.log(Level.WARNING, "warn");
//        logger.log(Level.ERROR, "error");
//        logger.log(Level.DEDUG, "debug");
//        logger.log(Level.TRACE, "trace");
    }

    public static void string(String[] args) throws IOException {
        FileWriter writer = new FileWriter("C:/file/t1.txt", true);
        String text = "привет от t1";
        writer.write(text);
        writer.close();
        FileWriter writer2 = new FileWriter("C:/file/t2.txt", true);
        String text2 = "привет от t2";
        writer.write(text2);
        writer.close();
        FileWriter writer3 = new FileWriter("C:/file/t3.txt", true);
        String text3 = "привет от t3";
        writer.write(text3);
        writer.close();

    }

    public class DateName {
        public static void main(String[] args) {
            Date date = new Date();
        }
    }
}

