package loop;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert.*;

public class MortgageTest {

    @Test
    public void when1Year() {
        int amount = 1000;
        int salary = 1200;
        double percent = 1;
        int rsl = Mortgage.year(amount, salary, percent);
        int expected = 1;
        Assert.assertEquals(expected, rsl);

    }

    @Test
    public void when2Year() {
        int amount = 100;
        int salary = 120;
        double percent = 50;
        int rsl = Mortgage.year(amount, salary, percent);
        int expected = 2;
        Assert.assertEquals(expected, rsl);
    }
}