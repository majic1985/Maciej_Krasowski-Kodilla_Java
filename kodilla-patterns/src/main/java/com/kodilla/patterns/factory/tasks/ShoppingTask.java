package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    final String taskName;
    final String whatToBuy;
    final Double quantity;
    boolean taskStatus = false;

    public ShoppingTask(String taskName, String whatToBuy, Double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    public void executeTask() {
        this.taskStatus = true;
    }

    public String getTaskName() {
        return this.taskName;
    }

    public boolean isTaskExecuted() {
        return this.taskStatus;
    }
}
