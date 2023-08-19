package com.kodilla.stream.world;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity(){
        //Given
        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");
        Continent africa = new Continent("Africa");
        Country poland = new Country("Poland", new BigDecimal("37750000"));
        Country germany = new Country("Germany",new BigDecimal("83200000"));
        Country china = new Country("China",new BigDecimal("1412000000"));
        Country india = new Country("India",new BigDecimal("1408000000"));
        Country egypt = new Country("Egypt",new BigDecimal("109300000"));
        Country senegal = new Country("Senegal",new BigDecimal("16880000"));
        europe.addCountry(poland);
        europe.addCountry(germany);
        asia.addCountry(china);
        asia.addCountry(india);
        africa.addCountry(egypt);
        africa.addCountry(senegal);
        World world = new World();
        world.addContinents(europe);
        world.addContinents(africa);
        world.addContinents(asia);

        //When
        BigDecimal worldPopulation = world.getPeopleQuantity();

        //Then
        BigDecimal expectedWorldPopulations = new BigDecimal("3067130000");
        assertEquals(expectedWorldPopulations, worldPopulation );
    }
}
