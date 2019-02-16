package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    ArrayList<Shape> shapes = new ArrayList<Shape>();

    public void addFigure(Shape shape){
        shapes.add(shape);
    }

    public void removeFigure(Shape shape){
            shapes.remove(shape);
    }

    public List<Shape> getFigure(){
        return shapes;
    }

    public Shape getFigure(int n){
        return shapes.get(n);
    }

    public void showFigures(){
            System.out.println(shapes);
    }
}
