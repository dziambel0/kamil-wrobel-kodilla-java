package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import java.time.LocalDate;


public class StreamMain {

    public static void main(String[] args) {

        Country polska = new Country("Polska", new BigDecimal("38000000"));
        Country niemcy = new Country("Niemcy", BigDecimal.TEN);
        Country chiny = new Country("Chiny", BigDecimal.TEN);
        Country indie = new Country("Indie", BigDecimal.TEN);
        Continent europa = new Continent("Europe");
        Continent asia = new Continent("Asia");
        europa.addCountry(polska);
        europa.addCountry(niemcy);
        asia.addCountry(chiny);
        asia.addCountry(indie);
        World world = new World();
        world.addContinents(europa);
        world.addContinents(asia);


        BigDecimal test = world.getPeopleQuantity();
        System.out.println(test);
    }
}