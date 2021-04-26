package com.patterns.creational.factory;

import java.util.List;
import java.util.StringJoiner;

public class Person {

    int age;
    String firstName;
    String lastName;
    String address;
    String ssn;
    List<String> previousAddresses;
    String employer;
    List<String> prevEmployer;

    // required params
    private Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    // Telescope antiPattern
    // BAD Example: Adding more parameters to constructor or adding new constructors [4 to 5 params ]
    private Person(int age, String firstName, String lastName, String address, String ssn,
        List<String> previousAddresses, String employer, List<String> prevEmployer) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.ssn = ssn;
        this.previousAddresses = previousAddresses;
        this.employer = employer;
        this.prevEmployer = prevEmployer;
    }



    /**
     * Factory Method
     *
     * @param age
     * @param firstName
     * @param lastName
     * @param address
     * @param ssn
     * @param previousAddresses
     * @param employer
     * @param prevEmployer
     * @return
     */
    private static Person createPerson(int age, String firstName, String lastName, String address, String ssn,
        List<String> previousAddresses, String employer, List<String> prevEmployer) {
        return new Person(age, firstName, lastName, address, ssn, previousAddresses, employer, prevEmployer);
    }


    @Override
    public String toString() {
        return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]")
                   .add("age=" + age)
                   .add("firstName='" + firstName + "'")
                   .add("lastName='" + lastName + "'")
                   .add("address='" + address + "'")
                   .add("ssn='" + ssn + "'")
                   .add("previousAddresses=" + previousAddresses)
                   .add("employer='" + employer + "'")
                   .add("prevEmployer=" + prevEmployer)
                   .toString();
    }

}
