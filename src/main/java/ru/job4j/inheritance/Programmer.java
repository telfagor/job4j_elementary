package ru.job4j.inheritance;

public class Programmer extends Engineer {
    int age;

    public Programmer(String name, String surname, String education, String birthday, int age) {
        super(name, surname, education, birthday, age);
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
        this.age = age;
    }

    public void programming() {
        System.out.println("Programmer programming");
    }
}
