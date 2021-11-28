package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private int age;

    public Dentist(String name, String surname, String education, String birthday, int age) {
        super(name, surname, education, birthday, age);
        this.age = age;
    }

    public void healsTeeth() {
        System.out.println("Dentist heals teeth");
    }
}
