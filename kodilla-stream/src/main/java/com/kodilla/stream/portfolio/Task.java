package com.kodilla.stream.portfolio;

import java.time.LocalDate;

public final class Task {
    private final String title;
    private final String description;
    private final User assignedUser;
    private final User creator;
    private final LocalDate created;
    private final LocalDate deadline;

    public Task(String title, String description, User assignedUser, User creator, LocalDate created, LocalDate deadline) {
        this.title = title;
        this.description = description;
        this.assignedUser = assignedUser;
        this.creator = creator;
        this.created = created;
        this.deadline = deadline;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDescription() {
        return this.description;
    }

    public User getAssignedUser() {
        return this.assignedUser;
    }

    public User getCreator() {
        return this.creator;
    }

    public LocalDate getCreated() {
        return this.created;
    }

    public LocalDate getDeadline() {
        return this.deadline;
    }

    public String toString() {
        return "Task{title='" + this.title + '\'' + ", description='" + this.description + '\'' + ", assignedUser=" + this.assignedUser + ", creator=" + this.creator + ", created=" + this.created + ", deadline=" + this.deadline + '}' + "\n";
    }
}
