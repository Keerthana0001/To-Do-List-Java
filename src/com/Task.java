package com;

import java.time.LocalDate;

public class Task {
    private String description;
    private boolean completed;
    private LocalDate dueDate;

    private Task(TaskBuilder builder) {
        this.description = builder.description;
        this.completed = builder.completed;
        this.dueDate = builder.dueDate;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void markCompleted() {
        this.completed = true;
    }

    public void markPending() {
        this.completed = false;
    }

    public static class TaskBuilder {
        private String description;
        private boolean completed = false;
        private LocalDate dueDate;

        public TaskBuilder(String description) {
            this.description = description;
        }

        public TaskBuilder withDueDate(LocalDate dueDate) {
            this.dueDate = dueDate;
            return this;
        }

        public Task build() {
            return new Task(this);
        }
    }

    @Override
    public String toString() {
        return description + " - " + (completed ? "Completed" : "Pending") + 
               (dueDate != null ? ", Due: " + dueDate : "");
    }
}

