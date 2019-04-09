package com.kodilla.stream.portfolio;

import java.util.ArrayList;
import java.util.List;

public final class Board {
    private final List<TaskList> taskLists = new ArrayList();
    private final String name;

    public Board(String name) {
        this.name = name;
    }

    public void addTaskList(TaskList taskList) {
        this.taskLists.add(taskList);
    }

    public boolean removeTaskList(TaskList taskList) {
        return this.taskLists.remove(taskList);
    }

    public List<TaskList> getTaskLists() {
        return new ArrayList(this.taskLists);
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "Board{\nname='" + this.name + '\'' + ",\ntaskLists=" + this.taskLists + "\n" + '}';
    }
}
