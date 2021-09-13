package ru.job4j.condition;

public class Cinema {
    public static void access(int age) {
        System.out.println("Age of customer is " + age);
        if (age < 18) {
            System.out.println("Access denied!");
        } else {
            System.out.println("Access allowed!");
        }
    }

    public static void main(String[] args) {
        access(17);
        access(18);
    }
}
