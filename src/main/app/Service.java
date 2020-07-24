package app;
import app.Person;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Predicate;
import static app.Person.Sex;

public class Service {

    public static void main(String[] args) {
        List<Person> people = Person.createRoster();

        // find females with Anonymous

        Predicate<Person> p = new Predicate<Person>() {
            @Override
            public boolean test(Person person) {
                if(person.getGender() == Sex.MALE) return true;
                return false;
            }
        };

        // people.stream().filter(p).count();
        System.out.println("Using anonymous: " + people.stream().filter(p).count());

        // same job, but with lambda instead of anonymous class

        System.out.println("Using lambda: " + people.stream().filter(person -> {
            return person.getGender() == Sex.FEMALE ? true : false;
        }).count());


        // BONUS Anonymous class which extends Person class

        Person superPerson = new Person("Bob", LocalDate.now(), 22, Sex.MALE, "bob@gmail.com") {
            @Override
            public String toString() {
                //return super.toString();  // this is a proof that Person was extended
                return "superman can't be replaced";
            }
        };

        System.out.println(superPerson.toString());


    }
}
