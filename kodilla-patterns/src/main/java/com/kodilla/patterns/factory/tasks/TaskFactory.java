package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public TaskFactory() {
    }

    public final Task createTask( String taskClass ) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Buy Clothes", "T-shirt", 1.0D);

            case PAINTING:
                return new PaintingTask("Paint the freaking dirty wall", "Green", "wall");

            case DRIVING:
                return new DrivingTask("Get Back Home", "Home", "Toyota Corolla");

            default:
                return null;
        }
    }
}



