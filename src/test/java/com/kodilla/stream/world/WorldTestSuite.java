package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Set<Country> europeCountriesSet = new HashSet<>();
        europeCountriesSet.add(new Country("Poland", new BigDecimal("40000000")));
        europeCountriesSet.add(new Country("France", new BigDecimal("60000000")));
        europeCountriesSet.add(new Country("Sweden", new BigDecimal("20000000")));

        Set<Country> asiaCountriesSet = new HashSet<>();
        asiaCountriesSet.add(new Country("China", new BigDecimal("11000000000")));
        asiaCountriesSet.add(new Country("Japan", new BigDecimal("100000000")));
        asiaCountriesSet.add(new Country("India", new BigDecimal("12000000000")));

        Set<Country> australiaCountriesSet = new HashSet<>();
        australiaCountriesSet.add(new Country("Austalia", new BigDecimal("50000000")));

        Set<Country> northAmericaCountriesSet = new HashSet<>();
        northAmericaCountriesSet.add(new Country("Canada", new BigDecimal("100000000")));
        northAmericaCountriesSet.add(new Country("USA", new BigDecimal("300000000")));
        northAmericaCountriesSet.add(new Country("Mexico", new BigDecimal("200000000")));

        Set<Country> southAmericaCountriesSet = new HashSet<>();
        southAmericaCountriesSet.add(new Country("Brazil", new BigDecimal("400000000")));
        southAmericaCountriesSet.add(new Country("Chile", new BigDecimal("102000000")));
        southAmericaCountriesSet.add(new Country("Peru", new BigDecimal("20000000")));

        Continent europe = new Continent("europe", europeCountriesSet);
        Continent asia = new Continent("asia", asiaCountriesSet);
        Continent australia = new Continent("australia", australiaCountriesSet);
        Continent northAmerica = new Continent("northAmerica", northAmericaCountriesSet);
        Continent southAmerica = new Continent("southAmerica", southAmericaCountriesSet);

        Set<Continent> continentsAtWorld = new HashSet<>();
        continentsAtWorld.add(europe);
        continentsAtWorld.add(asia);
        continentsAtWorld.add(australia);
        continentsAtWorld.add(northAmerica);
        continentsAtWorld.add(southAmerica);
        World world = new World(continentsAtWorld);

        //When
        BigDecimal totalPeopleQuantity = world.getPeopleQuantity();
        //Then
        BigDecimal expectedPeopleQuantity = new BigDecimal("24392000000");
        Assert.assertEquals(expectedPeopleQuantity, totalPeopleQuantity);
    }
}
