package People;

import java.time.LocalDate;
import java.time.Period;

public class Person {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    public void setFirstName(String firstName) { this.firstName = firstName;  }
    public String getFirstName() { return firstName; }

    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getLastName() { return lastName; }

    public void setDateOfBirth(LocalDate dateOfBirth) { this.dateOfBirth = dateOfBirth;  }
    public LocalDate getDateOfBirth() { return dateOfBirth; }

    public void setPerson(String firstName, String lastName, LocalDate dateOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }

    public String getFormatted() {
        return  "Name: " + firstName + " " + lastName + " \nDOB: " + dateOfBirth;
    }

}
