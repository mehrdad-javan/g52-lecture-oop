package se.lexicon;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Person {
    // Fields
    private static long sequencer = 1000;
    private long personId;
    public String name;
    private String email;
    private LocalDate birthDate;
    private String address;

    // private Car[] carsOwned;

    // add more fields as needed.

    // Constructors
    public Person(String name, LocalDate birthDate) {
        this.personId = ++sequencer;
        this.setName(name);
        this.birthDate = Objects.requireNonNull(birthDate, "BirthDate cannot be null.");
    }

    public Person(String name, String email, LocalDate birthDate) {
        this(name, birthDate);
        this.setEmail(email);
    }

    public Person(String name, String email, LocalDate birthDate, String address) {
        this(name, email, birthDate);
        this.setAddress(address);
    }

    // Methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = Objects.requireNonNull(name, "Name cannot be null.");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = Objects.requireNonNull(email, "Email cannot be null.");
        ;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = Objects.requireNonNull(address, "Address cannot be null.");
        ;
    }

    public int getAge() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }


    public String getPersonInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Person Info >");
        sb.append(", Id: ");
        sb.append(personId);
        sb.append(", Name: ");
        sb.append(name);
        return sb.toString();
    }

}
