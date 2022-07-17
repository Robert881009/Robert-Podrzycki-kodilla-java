package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String SHOPPING_TASK = "SHOPPING_TASK";
    public static final String PAINTING_TASK = "PAINTING_TASK";
    public static final String DRIVING_TASK = "DRIVING_TASK";

    public Task makeTask(final String taskClass){
        switch (taskClass){
            case SHOPPING_TASK:
                return new ShoppingTask("Task1","Car",100);
                case PAINTING_TASK:
                return new PaintingTask("Task2","Blue","Room");
                case DRIVING_TASK:
                return new DrivingTask("Task3", "Holidays","Car");
            default:
                return null;
        }
    }
}
