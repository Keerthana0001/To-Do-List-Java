package com;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<Task> tasks = new ArrayList<>();
    private List<TaskMomento> mementos = new ArrayList<>();
    private int currentState = -1;

    public void addTask(Task task) {
        tasks.add(task);
        saveState();
    }

    public void removeTask(Task task) {
        tasks.remove(task);
        saveState();
    }

    public void markCompleted(Task task) {
        task.markCompleted();
        saveState();
    }

    public void markPending(Task task) {
        task.markPending();
        saveState();
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void showTasks(String filter) {
        for (Task task : tasks) {
            if (filter.equals("all") || 
                (filter.equals("completed") && task.isCompleted()) ||
                (filter.equals("pending") && !task.isCompleted())) {
                System.out.println(task);
            }
        }
    }

    private void saveState() {
        
        if (currentState < mementos.size() - 1) {
            mementos = mementos.subList(0, currentState + 1);
        }
        mementos.add(new TaskMomento(new ArrayList<>(tasks)));
        currentState++;
    }

    public void undo() {
        if (currentState > 0) {
            currentState--;
            tasks = mementos.get(currentState).getState();
        } else {
            System.out.println("No more actions to undo.");
        }
    }

    public void redo() {
        if (currentState < mementos.size() - 1) {
            currentState++;
            tasks = mementos.get(currentState).getState();
        } else {
            System.out.println("No more actions to redo.");
        }
    }
}

