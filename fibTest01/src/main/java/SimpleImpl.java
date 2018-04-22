import org.apache.log4j.Logger;

import java.util.ArrayList;

public class SimpleImpl implements NumberSequance {
    private final static Logger log = Logger.getLogger(Main.class);
    private ArrayList<Long> simpleList = new ArrayList<>();

    @Override
    public void numberProcessing(int base) {
        if (base == 0) { } else {
            --base;
            int sNCount = 0;        // счетчик простых чисел (simpleNumbersCounter)
            int i = 2;

            while (sNCount <= base) {

                toArray(i, simpleList);
                i++;
                sNCount = simpleList.size();
            }

            show(base, simpleList);
        }
    }


    private void toArray(int base, ArrayList simpleList) {
        if (testSimplicity(base)) {
            simpleList.add(base);
        }
    }

    boolean testSimplicity(int n) {
        boolean simple = false;
        if (n == 2) {
            simple = true;
        } else if (n == 3) {
            simple = true;
        } else if (n % 2 == 0) {

        } else {
            if (n > 3) {
                for (int i = 2; i < n; i++) {
                    simple = n % i != 0;
                }

            }
        }

        return simple;
    }

    private void show(int base, ArrayList arr) {
        for (int i = 0; i <= base; i++) {
            log.info((i + 1) + "-ое число из последовательности простых чисел: " + simpleList.get(i));
        }
    }
}





