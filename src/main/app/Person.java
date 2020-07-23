package app;

import java.time.LocalDate;

public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    int age;
    Sex gender;
    String emailAddress;

    public int getAge() {
        return this.age;
    }

    public void printPerson() {
        // ...
    }
}