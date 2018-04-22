import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FiboImplTest {
    FiboImpl fib = new FiboImpl();
    @Test
    void testing_GenerateFib_For_10() {
        //int base =(int)(Math.random()*100);
        int base =10;
        long actual = fib.generateFib(base);
        int  expected = 55;
        assertEquals(expected,actual);
    }
@Test
    void testing_GenerateFib_For_0() {
        int base =0;
        long actual = fib.generateFib(base);
        int  expected = 0;
        assertEquals(expected,actual);
    }


}