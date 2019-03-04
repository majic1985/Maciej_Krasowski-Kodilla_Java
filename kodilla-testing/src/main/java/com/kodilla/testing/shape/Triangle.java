package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3, String shapeName){

    }

    @Override
    public String getShapeName() {
        return getShapeName();
    }

    @Override
    public double getField() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
