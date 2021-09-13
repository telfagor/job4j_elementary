package ru.job4j.calculator;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;

    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        //test for euro
        int in = 570;
        float expected = 8.142858f;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println(in + " rubles are " + expected + " euro. Test result : " + passed);

        //test for dollars
        int inForDollars = 560;
        float expectedForDollars = 9.333333f;
        float outForDollars = Converter.rubleToDollar(inForDollars);
        boolean passedForDollars = expectedForDollars == outForDollars;
        System.out.println(inForDollars + " rubles are " + expectedForDollars
                            + " dollars. Test result : " + passedForDollars);
    }
}
