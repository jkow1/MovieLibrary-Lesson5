package org.example;

public class Actor {
    private String firstName;
    private String lastName;

    public Actor() {
    }

    @Override
    public String toString() {
        return firstName + ' ' + lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
