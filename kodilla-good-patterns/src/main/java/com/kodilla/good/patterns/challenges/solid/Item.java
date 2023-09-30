package com.kodilla.good.patterns.challenges.solid;

public class Item {

    private String name;
    private String category;
    private int weight;

    public Item(String name, String category, int weight) {
        this.name = name;
        this.category = category;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getWeight() {
        return weight;
    }
}
