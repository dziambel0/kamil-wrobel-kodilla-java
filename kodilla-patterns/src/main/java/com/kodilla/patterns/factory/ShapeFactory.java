package com.kodilla.patterns.factory;

public final class ShapeFactory {
    public static final String CIRCLE = "CIRCLE";
    public static final String SQUARE = "SQUARE";
    public static final String RECTANGLE = "RECTANGLE";

    public final Shape makeShape(final String schapeClass){
        return switch (schapeClass){
            case CIRCLE -> new Circle("Circle001", 4.5);
            case SQUARE -> new Square("Square001", 7);
            case RECTANGLE -> new Rectangle("Rectangle", 15,2.5);
            default -> null;
        };
    }
}
