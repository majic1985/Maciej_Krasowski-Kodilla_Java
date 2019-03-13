package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> figure = new ArrayList<>();

    public void addFigure(Shape shape) {
        figure.add(shape);

    }

    public void removeFigure(Shape shape) {
        figure.remove(shape);
    }

    public Shape getFigure(int shape) {
        return figure.get(shape);


    }
    public int getShapeSize() {
        return figure.size();

    }


}
