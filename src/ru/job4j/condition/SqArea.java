package ru.job4j.condition;

public class SqArea {
        public static double square(double p, double k) {
            double h = p / (2 * (k + 1));
            double l = h * k;
            double s = l * h;
            return s;
        }

        public static void main(String[] args) {
            double result1 = SqArea.square(16, 7);
            System.out.println(" p = 16, k = 7, s = 1, real = " + result1);
        }
}

