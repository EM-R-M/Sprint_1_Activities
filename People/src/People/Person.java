package People;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Person {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private static int totalPeople = 0;

    public Person(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        totalPeople++;
    }

    public void setFirstName(String firstName) { this.firstName = firstName;  }
    public String getFirstName() { return firstName; }

    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getLastName() { return lastName; }

    public void setDateOfBirth(LocalDate dateOfBirth) { this.dateOfBirth = dateOfBirth;  }
    public LocalDate getDateOfBirth() { return dateOfBirth; }

    public int getAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }

    public int getTotalPeople() {
        return totalPeople;
    }

    public String getFormatted() {
        return  "Name: " + firstName + " " + lastName + " \nDOB: " + dateOfBirth;
    }

}
