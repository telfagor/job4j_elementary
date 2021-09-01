package loop;

import org.junit.Test;

import static org.junit.Assert.*;
import static loop.Factorial.calc;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int n = 5;
        int expected = 120;
        int rsl = calc(n);
        assertEquals(expected, rsl);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int n = 0;
        int expected = 1;
        int rsl = calc(n);
        assertEquals(expected, rsl);
    }
}