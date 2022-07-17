package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {
    @Test
    void testShoppingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPING_TASK);
        //Then
        assertEquals("Car 100.0",shopping.executeTask());
    }
    @Test
    void testPaintingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task painting = taskFactory.makeTask(TaskFactory.PAINTING_TASK);
        //Then
        assertEquals("Task2",painting.getTaskName());
    }
    @Test
    void testDrivingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.makeTask(TaskFactory.DRIVING_TASK);
        driving.executeTask();
        //Then
        assertEquals(true,driving.isTaskExecuted());

    }
}
