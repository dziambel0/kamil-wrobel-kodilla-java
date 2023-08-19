package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    List<Continent> listContinents = new ArrayList<>();

    public final void addContinents(Continent continent){
        listContinents.add(continent);
    }

    public final List<Continent> getListOfContinents(){
        return listContinents;
    }

    public BigDecimal getPeopleQuantity(){
        BigDecimal worldQuantity = getListOfContinents().stream()
                .flatMap(continent -> continent.getListCountris().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        return worldQuantity;
    }

}
