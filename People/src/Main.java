import People.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Bob", "Thompson", LocalDate.parse("1999-01-01"));
        System.out.println(person1.getFormatted());
        System.out.println("Total people added: " + person1.getTotalPeople());

        Person person2 = new Person("Amy", "Thompson", LocalDate.parse("1998-01-01"));
        Person person3 = new Person("Dan", "Thompson", LocalDate.parse("1969-01-01"));
        Person person4 = new Person("Larry", "Thompson", LocalDate.parse("1979-01-01"));

        System.out.println(person2.getFormatted());
        System.out.println(person3.getFormatted());
        System.out.println(person4.getFormatted());
        System.out.println("Total people added: " + person1.getTotalPeople());
    }
}
