import org.apache.log4j.Logger;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static NumberSequance fib;
    private final static Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number >= 0) {
            fibo(number);
            log.info("----------------------------------------------------");
            simple(number);
        } else log.info("введено недопустимое значение");

    }

    private static void fibo(int number) {
        fib = new FiboImpl();

        fib.numberProcessing(number);
    }

    private static void simple(int number) {
        fib = new SimpleImpl();
        fib.numberProcessing(number);

    }
}


//((FiboImpl) fib).show(number);


//TODO вычисление без рекурсии,  вывод от первого к последнему
