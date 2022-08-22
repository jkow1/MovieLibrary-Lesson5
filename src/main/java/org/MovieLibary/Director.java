package org.MovieLibary;

public class Director {
    private String firstName;
    private String lastName;

    public Director() {
    }

    @Override
    public String toString() {
        return firstName + ' ' +
                lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
