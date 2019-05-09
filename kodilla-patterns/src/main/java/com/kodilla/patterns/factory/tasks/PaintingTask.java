package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{
    final String taskName;
    final String colour;
    final String whatToPaint;
    boolean taskStatus = false;

    public PaintingTask(String taskName, String colour, String whatToPaint) {
        this.taskName = taskName;
        this.colour = colour;
        this.whatToPaint = whatToPaint;
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
