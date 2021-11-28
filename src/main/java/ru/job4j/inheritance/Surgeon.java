package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private int age;

    public Surgeon(String name, String surname, String education, String birthday, int age) {
        super(name, surname, education, birthday, age);
        this.age = age;
    }

    public void operating() {
        System.out.println("Surgeon is operating");
    }
}
