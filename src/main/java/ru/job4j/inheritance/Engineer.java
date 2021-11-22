package ru.job4j.inheritance;

public class Engineer extends Profession {
    private String name,
            surname,
            education,
            birthday;
    private int age;

    public Engineer(String name, String surname, String education, String birthday, int age) {
        super(name, surname, education, birthday);
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
        this.age = age;
    }

    public void designs() {
        System.out.println("Engineer designs");
    }
}
