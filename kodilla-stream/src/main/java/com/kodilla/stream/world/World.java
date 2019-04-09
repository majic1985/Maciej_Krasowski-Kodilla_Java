package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
public final class World {
    private final Set<Continent> continents = new HashSet();

    public World() {
    }

    public void addContinent(Continent continent) {
        this.continents.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        return (BigDecimal)this.continents.stream().flatMap((countries) -> {
            return countries.getCountries().stream();
        }).map(PeopleStorage::getPeopleQuantity).reduce(BigDecimal.ZERO, (sum, current) -> {
            return sum.add(current);
        });
    }
}

