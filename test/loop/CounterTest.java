package loop;

import org.junit.Test;
import static org.junit.Assert.*;
import static loop.Counter.*;

@SuppressWarnings("checkstyle:EmptyLineSeparator")
public class CounterTest {

    @Test
    public void whenSumNumbersFromOneToTenThenFiftyFive() {
        int start = 1;
        int finish = 10;
        int expected = 55;
        int rsl = sum(start, finish);
        assertEquals(expected, rsl);
    }
}