package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class ArrayCharTest {

    @Test
    public void whenStartsWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] prefix = {'H', 'e'};
        boolean result = ArrayChar.startsWith(word, prefix);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotStartsWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] prefix = {'H', 'i'};
        boolean result = ArrayChar.startsWith(word, prefix);
        Assert.assertFalse(result);
    }
}