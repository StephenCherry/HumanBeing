package com.example.PersonalDetails;

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person();
        FirstName firstName = new FirstName();
        MiddleName middleName = new MiddleName();
        LastName lastName = new LastName();
        Gender gender = new Gender();
        Age age = new Age();

        person.personalDetails();
        firstName.personalDetails();
        middleName.personalDetails();
        lastName.personalDetails();
        gender.personalDetails();
        age.personalDetails();
    }
}
