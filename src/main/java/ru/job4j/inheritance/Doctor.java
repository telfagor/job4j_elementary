package ru.job4j.inheritance;

public class Doctor extends Profession {
    int age;

    public Doctor(String name, String surname, String education, String birthday, int age) {
        super(name, surname, education, birthday);
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
        this.age = age;
    }

    public void treat() {
        System.out.println("Doctor treats");
    }
}
