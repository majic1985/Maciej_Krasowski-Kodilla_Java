package com.kodilla.good.patterns.food2door;

public class LocalAddress {
    private String street;
    private String city;
    private String postCode;
    private String country;

    public LocalAddress(String street, String city, String postCode, String country) {
        this.street = street;
        this.city = city;
        this.postCode = postCode;
        this.country = country;
    }

    public String getStreet() {

        return street;
    }
}
