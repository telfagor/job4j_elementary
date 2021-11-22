package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private String name,
            surname,
            education,
            birthday;
    private int age;

    public Dentist(String name, String surname, String education, String birthday, int age) {
        super(name, surname, education, birthday, age);
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
    }

    public void healsTeeth() {
        System.out.println("Dentist heals teeth");
    }
}
