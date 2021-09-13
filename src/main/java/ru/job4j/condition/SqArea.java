package ru.job4j.condition;

public class SqArea {
        public static int square(int p, int k) {
            int h = p / (2 * (k + 1));
            int w = h * k;
            int s = w * h;
            return s;
        }

        public static void main(String[] args) {
            double result1 = SqArea.square(16, 7);
            System.out.println(" p = 16, k = 7, s = 1, real = " + result1);
        }
}

