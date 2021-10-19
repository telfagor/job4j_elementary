package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class DefragmentTest {

    @Test
    public void singleFirstNull() {
        String[] input = {null, "1"};
        String[] rsl = Defragment.compress(input);
        String[] expected = {"1", null};
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void notFirstNull() {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] rsl = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void firstNull() {
        String[] input = {null, "I", "wanna", null, "be", null, "compressed"};
        String[] rsl = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void notAllNull() {
        String[] input = {null, null, null};
        String[] rsl = Defragment.compress(input);
        String[] expected = {null, null, null};
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void notAllAtFirstNull() {
        String[] input = {null, null, null, "I", "wanna", "be", "compressed"};
        String[] rsl = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        Assert.assertArrayEquals(expected, rsl);
    }
}