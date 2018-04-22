import org.apache.log4j.Logger;

import java.util.ArrayList;

public class FiboImpl implements NumberSequance {
    private final static Logger log = Logger.getLogger(Main.class);
    private ArrayList<Long> fibList = new ArrayList<>();

    @Override
    public void numberProcessing(int base) {
        fibList.add(generateFib(base));
        show(base);
    }

    long generateFib(int base) {
        long i = 0;
        long fib0 = 0;
        long fib1 = 1;
        long fib2 = 1;
        while (i < base) {
            fib0 = fib1;
            fib1 = fib2;
            fib2 = fib0 + fib1;
            i++;
        }
        return fib0;
    }


    private void show(int base) {
        for (int i = 0; i <= base; i++) {
            log.info("основание: " + (i) + "; число из последовательности Фибоначчи: " + generateFib(i));
        }
    }


}

