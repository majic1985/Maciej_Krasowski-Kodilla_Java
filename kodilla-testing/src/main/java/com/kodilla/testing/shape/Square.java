package com.kodilla.testing.shape;

public class Square implements Shape {
    private double width;
    private double high;



    public Square (double width, double high) {
        this.width = width;
        this.high = high;
    }
    @Override
    public String getShapeName() {
        return getShapeName();
    }

    @Override
    public double getField() {
        return width * high;
    }
}
