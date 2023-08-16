package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    List<Shape> listaFigur = new ArrayList<>();
    Shape shape;



    public void addFigure(Shape shape){
        this.shape = shape;
        listaFigur.add(shape);
    }

    public void removeFigure(Shape shape){
        this.shape = shape;
        listaFigur.remove(shape);
    }

    public Shape getFigure(int n){
        Shape shape1 = listaFigur.get(n);
        return shape1;

    }

    public List<Shape> showFigures(){
        return listaFigur;
    }

}
