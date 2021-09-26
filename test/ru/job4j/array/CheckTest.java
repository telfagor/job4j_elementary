package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class CheckTest {

    @Test
    public void whenDataMonoByTrueThenTrue() {
        boolean[] data = {true, true, true};
        boolean rsl = Check.mono(data);
        Assert.assertTrue(rsl);
    }

    @Test
    public void whenDataMonoByFalseThenTrue() {
        boolean[] data = {false, false, false};
        boolean rsl = Check.mono(data);
        Assert.assertTrue(rsl);
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        boolean[] data = {false, true, false};
        boolean rsl = Check.mono(data);
        Assert.assertFalse(rsl);
    }
}