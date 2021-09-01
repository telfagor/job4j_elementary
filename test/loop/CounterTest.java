package loop;

import org.junit.Test;
import static org.junit.Assert.*;
import static loop.Counter.*;

public class CounterTest {

    @Test
    public void whenSumNumbersFromOneToTenThenFiftyFive() {
        int start = 1;
        int finish = 10;
        int expected = 55;
        int rsl = sum(start, finish);
        assertEquals(expected, rsl);
    }

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int expected = 30;
        int rsl = sumByEven(start, finish);
        assertEquals(expected, rsl);
    }
}