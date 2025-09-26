//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/>
//import Printer.*;

public class Main {
    public static void main(String[] args) {
        ContohInterface Rumus = (a, b) -> a + b;
        ContohInterface Rumus2 = (a, b) -> a * b;

        System.out.println(Rumus.rumus(8,2));
        System.out.println(Rumus2.rumus(5,4));
    }
}

//        Contoh Lambda Exspression
//        ContohInterface obj = () -> System.out.println("woi jrs!!");
//        obj.katakanHallo();

// CONTOH THREAD
//Thread t1 = new Thread(new PrintLatters());
//        t1.start();
//Thread t2 = new Thread(new PrintNomor());
//        t2.start();
//        System.out.println();