package com.kodilla.testing.shape;

public class Triangle implements Shape{

    private int a;
    private int h;
    public Triangle(int a, int h) {
        this.a = a;
    }

    public String getShapeName(){
        return "Triangle";
    }

    public int getField(){
        return (a*a)/2;
    }

}
