package loop;

import org.junit.Test;
import org.junit.Assert;

public class CheckPrimeNumberTest {

    @Test
    public void when5() {
        int in = 5;
        boolean rsl = CheckPrimeNumber.check(in);
        Assert.assertTrue(rsl);
    }

    @Test
    public void when4() {
        int in = 4;
        boolean rsl = CheckPrimeNumber.check(in);
        Assert.assertFalse(rsl);
    }

    @Test
    public void when1() {
        int in = 1;
        boolean rsl = CheckPrimeNumber.check(in);
        Assert.assertFalse(rsl);
    }
}