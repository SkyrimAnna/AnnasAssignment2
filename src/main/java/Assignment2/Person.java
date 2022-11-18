package Assignment2;

import java.util.Objects;

public class Person {

    // fields
    private int id;
    private String firstName; // 3 Anna
    private String lastName;
    private String email;

    private AppUser credentials;

    //todo: create getter and setter for that field.

    // constructors


    // methods
    // todo: Replace getSummary()with toString()method that don’t print out credentials


    // setters and getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) { // 1 Anna
        if (firstName == null) {
            throw new IllegalArgumentException("firstName was null");
        }
        this.firstName = firstName; // 2 Anna
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName == null) {
            throw new IllegalArgumentException("lastName was null");
        }
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null) {
            throw new IllegalArgumentException("email was null");
        }
        this.email = email;
    }

    public AppUser getCredentials() {
        return credentials;
    }

    public void setCredentials(AppUser credentials) {
        this.credentials = credentials;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(email, person.email) && Objects.equals(credentials, person.credentials);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email, credentials);
    }
// todo: Override equalsand hashcode

}
