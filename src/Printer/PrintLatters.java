package Printer;

public class PrintLatters implements Runnable {
    public void run() {
        for (char c = 'A'; c <= 'J'; c++) {
            System.out.println(c);
        }
    }
}
