package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Set;

public final class World {
    private final Set<Continent> continentsAtWorld;

    public World(final Set<Continent> continentsAtWorld) {
        this.continentsAtWorld = continentsAtWorld;
    }

    public Set<Continent> getContinentsAtWorld() {
        return continentsAtWorld;
    }

    public BigDecimal getPeopleQuantity() {
        return continentsAtWorld.stream()
                .flatMap(continent -> continent.getCountriesAtContinent().stream())
                .map(Country::getCountryPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, currentCountryPeopleQuantity) -> sum = sum.add(currentCountryPeopleQuantity));
    }
}
