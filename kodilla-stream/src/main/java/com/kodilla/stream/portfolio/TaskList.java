package com.kodilla.stream.portfolio;

import java.util.LinkedList;
import java.util.List;

public final class TaskList {
    private final List<Task> tasks = new LinkedList();
    private final String name;

    public TaskList(String name) {
        this.name = name;
    }

    public void addTask(Task task) {
        this.tasks.add(task);
    }

    public boolean removeTask(Task task) {
        return this.tasks.remove(task);
    }

    public List<Task> getTasks() {
        return new LinkedList(this.tasks);
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "TaskList{name='" + this.name + '\'' + ",\ntasks=\n" + this.tasks + "\n" + '}' + "\n";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof TaskList)) {
            return false;
        } else {
            TaskList taskList = (TaskList)o;
            return this.name.equals(taskList.name);
        }
    }
}
