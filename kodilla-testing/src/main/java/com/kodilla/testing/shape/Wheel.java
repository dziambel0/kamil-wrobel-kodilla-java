package com.kodilla.testing.shape;

public class Wheel implements Shape{

    private int r;
    public double pi = 3.14;
    public Wheel(int r) {
        this.r = r;
    }

    public String getShapeName(){
        return "Wheel";
    }

    public double getField(){
        return r*r*pi;
    }

}
