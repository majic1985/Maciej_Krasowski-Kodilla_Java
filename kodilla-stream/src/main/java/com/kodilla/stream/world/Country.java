package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country implements PeopleStorage {
    private final String countryName;
    private final BigDecimal peopleQuantity;

    public Country(String countryName, BigDecimal peopleQuantity) {
        this.countryName = countryName;
        this.peopleQuantity = peopleQuantity;
    }

    public String toString() {
        return "Country{countryName='" + this.countryName + '\'' + ", peopleQuantity=" + this.peopleQuantity + '}';
    }

    public BigDecimal getPeopleQuantity() {
        return this.peopleQuantity;
    }
}
