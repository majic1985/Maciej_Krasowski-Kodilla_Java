package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public final class Continent {
    private final String continentName;
    private final Set<PeopleStorage> countries = new HashSet();

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public void addCountry(Country country) {
        this.countries.add(country);
    }

    public Set<PeopleStorage> getCountries() {
        return this.countries;
    }
}
