package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final String name;
    private final List<Country> listCountris = new ArrayList<>();

    public Continent (String name) {
        this.name = name;
    }

    public void addCountry(Country country){
        listCountris.add(country);
    }

    public List<Country> getListCountris() {
        return listCountris;
    }

}

