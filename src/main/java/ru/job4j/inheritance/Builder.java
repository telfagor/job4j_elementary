package ru.job4j.inheritance;

public class Builder extends Engineer {
    int age;

    public Builder(String name, String surname, String education, String birthday, int age) {
        super(name, surname, education, birthday, age);
        this.age = age;
    }

    public void builds() {
        System.out.println("Builder builds");
    }
}
