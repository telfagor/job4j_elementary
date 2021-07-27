package ru.job4j.calculator;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(570);
        float dollar = Converter.rubleToDollar(570);

        System.out.println("560 rubles are " + euro + " euro.");
        System.out.println("560 rubles are " + dollar + " dollar.");
    }
}
