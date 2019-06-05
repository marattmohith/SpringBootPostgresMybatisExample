package com.model;

public class Address {

    private Integer addressId;
    private String streetAddress;
    private Integer personId;
    private Person person;

    public Address() {
    }

    public Address(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public Address(int i, String name) {
        this.streetAddress = name;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

}