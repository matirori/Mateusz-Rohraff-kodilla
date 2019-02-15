package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    ArrayList<Shape> shapes = new ArrayList<Shape>();

    public void addFigure(Shape shape){
        shapes.add(shape);
    }

    public void removeFigure(Shape shape){
        for (Shape object: shapes
             ) {
            if(object.equals(shape)){
            shapes.remove(object);
            }
        }
    }

    public Shape getFigure(int n){
        return shapes.get(n);
    }

    public Shape showFigures(){
        for (Shape object: shapes
             ) {
            return object;
        }
        return null;
    }
}
