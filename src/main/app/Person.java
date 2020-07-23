package app;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class Person {

    public static List<Person> createRoster() {
        //return Collections.emptyList();
        return List.of(new Person("Bob", LocalDate.now(), 22, Sex.MALE, "bob@gmail.com"),
                        new Person("Mark", LocalDate.now(), 24, Sex.MALE, "mark@gmail.com"),
                        new Person("Julia", LocalDate.now(), 32, Sex.FEMALE, "bosvasavb@gmail.com")


                );
    }

    public Sex getGender() {
        return gender;
    }

    public String getEmailAddress() { return emailAddress; }

    public int getAge() {
        return this.age;
    }

    public enum Sex {
        MALE,
        FEMALE
    }

    public Person(String name, LocalDate birthday, int age, Sex gender, String emailAddress) {
        this.name = name;
        this.birthday = birthday;
        this.age = age;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    String name;
    LocalDate birthday;
    int age;
    Sex gender;
    String emailAddress;

    public void printPerson() {
        // ...
    }
}