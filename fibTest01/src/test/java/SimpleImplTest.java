import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleImplTest {
    SimpleImpl simp = new SimpleImpl();
    @Test
    void testing_Simplicity_For_101() {
        //int base = (int)(Math.random()*100);
        int base = 101;

        boolean actual = simp.testSimplicity(base);
        boolean expected = true;
        assertEquals(true, actual);
    }

@Test
    void testing_Simplicity_For_1(){
        int base = 0;
        boolean actual = simp.testSimplicity(base);
        boolean expected = true;
        assertEquals(false, actual);
    }
}