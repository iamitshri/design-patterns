package com.patterns.creational.builder;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Person {

    int age;
    final String firstName;
    final String lastName;
    String address;
    String ssn;
    List<String> previousAddresses;
    String employer;
    List<String> prevEmployer;

    private Person(PersonBuilder personBuilder) {
        this.firstName = personBuilder.getFirstName();
        this.lastName = personBuilder.getLastName();
        this.address = personBuilder.getAddress();
        this.previousAddresses = personBuilder.getPreviousAddresses();
        this.prevEmployer = personBuilder.getPrevEmployer();
        this.ssn = personBuilder.getSsn();
        this.age = personBuilder.getAge();
        this.employer = personBuilder.getEmployer();
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

    /**
     * Use builder to hide the process of creating complex object
     */
    public static class PersonBuilder {

        // required params
        final String firstName;
        final String lastName;

        // optional params
        private int age;
        private String address;
        private String ssn;
        private List<String> previousAddresses;
        private String employer;
        private List<String> prevEmployer;

        public PersonBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public PersonBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public PersonBuilder setSsn(String ssn) {
            this.ssn = ssn;
            return this;
        }

        public PersonBuilder setPreviousAddresses(List<String> previousAddresses) {
            this.previousAddresses = previousAddresses;
            return this;
        }

        public PersonBuilder setEmployer(String employer) {
            this.employer = employer;
            return this;
        }

        public PersonBuilder setPrevEmployer(List<String> prevEmployer) {
            this.prevEmployer = prevEmployer;
            return this;
        }

        public Person build() {
            return new Person(this);
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public String getAddress() {
            return address;
        }

        public String getSsn() {
            return ssn;
        }

        public List<String> getPreviousAddresses() {
            return previousAddresses;
        }

        public String getEmployer() {
            return employer;
        }

        public List<String> getPrevEmployer() {
            return prevEmployer;
        }

    }


    public static void main(String[] args) {

        // Builder
        PersonBuilder builder = new PersonBuilder("fName", "lastName");
        builder.setAddress("address");
        builder.setAge(1);
        builder.setEmployer("Employer");
        builder.setSsn("123");
        builder.setPreviousAddresses(new ArrayList<>());
        builder.getPreviousAddresses()
               .add("address1");
        Person person = builder.build();
        System.out.println(person);

    }
}
