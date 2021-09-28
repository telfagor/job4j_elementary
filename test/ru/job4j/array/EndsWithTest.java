package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class EndsWithTest {

    @Test
    public void whenEndWithSuffixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean rsl = EndsWith.endsWith(word, post);
        Assert.assertTrue(rsl);
    }

    @Test
    public void whenNotEndWithSuffixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'a'};
        boolean rsl = EndsWith.endsWith(word, post);
        Assert.assertFalse(rsl);
    }
}