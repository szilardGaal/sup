package com.sim;

public class Client {
    
    private String firstName;
    private String lastName;
    private String taxNumber;
    private String city;
    private int postCode;
    private String streetName;
    private String houseNumber;

    public Client(String firstName, String lastName, String taxNumber, String city, int postCode, String streetName, String houseNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.taxNumber = taxNumber;
        this.city = city;
        this.postCode = postCode;
        this.streetName = streetName;
        this.houseNumber = houseNumber;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getTaxNumber() {
        return this.taxNumber;
    }

    public String getCity() {
        return this.city;
    }

    public int getPostCode() {
        return this.postCode;
    }

    public String getStreetName() {
        return this.streetName;
    }

    public String getHouseNumber() {
        return this.houseNumber;
    }

    public void setFistName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

}