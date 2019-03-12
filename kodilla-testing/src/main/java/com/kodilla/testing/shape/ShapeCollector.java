package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<String> figure = new ArrayList<>();
    public void addFigure(Shape shape) {
        figure.add("circle");

    }

    public void removeFigure(Shape shape) {
        figure.remove("circle");
    }

    public int getFigure(Shape shape) {
        figure.get(figure.size());
        return figure.size() ;
    }
    public int getShapeSize() {
        return figure.size();

    }
}
