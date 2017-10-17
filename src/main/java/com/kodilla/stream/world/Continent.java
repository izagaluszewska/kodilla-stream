package com.kodilla.stream.world;

import java.util.Set;

public final class Continent {
    private final String continentName;
    private final Set<Country> countriesAtContinent;

    public Continent(final String continentName, final Set<Country> countriesAtContinent) {
        this.continentName = continentName;
        this.countriesAtContinent = countriesAtContinent;
    }

    public String getContinentName() {
        return continentName;
    }

    public Set<Country> getCountriesAtContinent() {
        return countriesAtContinent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Continent continent = (Continent) o;

        return continentName.equals(continent.continentName);
    }

    @Override
    public int hashCode() {
        return continentName.hashCode();
    }
}
