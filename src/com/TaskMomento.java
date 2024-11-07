package com;

import java.util.List;

public class TaskMomento {
    private List<Task> tasksState;

    public TaskMomento(List<Task> tasksState) {
        this.tasksState = tasksState;
    }

    public List<Task> getState() {
        return tasksState;
    }
}

