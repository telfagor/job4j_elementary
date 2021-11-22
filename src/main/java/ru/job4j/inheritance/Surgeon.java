package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private String name,
            surname,
            education,
            birthday;
    private int age;

    public Surgeon(String name, String surname, String education, String birthday, int age) {
        super(name, surname, education, birthday, age);
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
        this.age = age;
    }

    public void operating() {
        System.out.println("Surgeon is operating");
    }
}
