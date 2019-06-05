package com.kodilla.patterns.singleton.factory;

import com.kodilla.patterns.factory.tasks.Task;
import com.kodilla.patterns.factory.tasks.TaskFactory;
import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    public TaskFactoryTestSuite() {
    }

    @Test
    public void testCreatingDrivingTask() {
        TaskFactory taskFactory = new TaskFactory();
        Task driving = taskFactory.createTask("DRIVING");
        driving.executeTask();
        Assert.assertTrue(driving.isTaskExecuted());
        Assert.assertEquals("Get Back Home", driving.getTaskName());
    }

    @Test
    public void testCreatingShoppingTask() {
        TaskFactory taskFactory = new TaskFactory();
        Task shopping = taskFactory.createTask("SHOPPING");
        shopping.executeTask();
        Assert.assertTrue(shopping.isTaskExecuted());
        Assert.assertEquals("Buy Clothes", shopping.getTaskName());
    }

    @Test
    public void testCreatingPaintingTask() {
        TaskFactory taskFactory = new TaskFactory();
        Task painting = taskFactory.createTask("PAINTING");
        painting.executeTask();
        Assert.assertTrue(painting.isTaskExecuted());
        Assert.assertEquals("Paint the freaking dirty wall", painting.getTaskName());
    }
}
