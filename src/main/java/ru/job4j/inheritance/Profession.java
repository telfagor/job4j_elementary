package ru.job4j.inheritance;

public class Profession {
    private String name,
                 surname,
                 education,
                 birthday;

    public Profession(String name) {
        this(name, null, null, null);
    }

    public Profession(String name, String surname) {
        this(name, surname, null, null);
    }

    public Profession(String name, String surname, String education) {
        this(name, surname, education, null);
    }

    public Profession(String name, String surname, String education, String birthday) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEducation() {
        return education;
    }

    public String getBirthday() {
        return birthday;
    }
}
