package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = word.length - post.length, j = 0; i < word.length; i++, j++) {
            if (word[i] != post[j]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
