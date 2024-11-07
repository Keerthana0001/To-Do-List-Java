package com;
import java.time.LocalDate;
import java.util.Scanner;

public class ToDoListApp {
    public static void main(String[] args) {
        ToDoList todoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Mark Task as Pending");
            System.out.println("5. Show All Tasks");
            System.out.println("6. Show Completed Tasks");
            System.out.println("7. Show Pending Tasks");
            System.out.println("8. Undo");
            System.out.println("9. Redo");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    System.out.println("Enter task description:");
                    String description = scanner.nextLine();
                    System.out.println("Enter due date (YYYY-MM-DD) or leave empty for no due date:");
                    String date = scanner.nextLine();
                    Task task = new Task.TaskBuilder(description)
                            .withDueDate(date.isEmpty() ? null : LocalDate.parse(date))
                            .build();
                    todoList.addTask(task);
                    break;
                case 2:
                    System.out.println("Enter task description to remove:");
                    String removeDesc = scanner.nextLine();
                    Task removeTask = findTask(todoList, removeDesc);
                    if (removeTask != null) {
                        todoList.removeTask(removeTask);
                    } else {
                        System.out.println("Task not found.");
                    }
                    break;
                case 3:
                    System.out.println("Enter task description to mark as completed:");
                    String completeDesc = scanner.nextLine();
                    Task completeTask = findTask(todoList, completeDesc);
                    if (completeTask != null) {
                        todoList.markCompleted(completeTask);
                    } else {
                        System.out.println("Task not found.");
                    }
                    break;
                case 4:
                    System.out.println("Enter task description to mark as pending:");
                    String pendingDesc = scanner.nextLine();
                    Task pendingTask = findTask(todoList, pendingDesc);
                    if (pendingTask != null) {
                        todoList.markPending(pendingTask);
                    } else {
                        System.out.println("Task not found.");
                    }
                    break;
                case 5:
                    todoList.showTasks("all");
                    break;
                case 6:
                    todoList.showTasks("completed");
                    break;
                case 7:
                    todoList.showTasks("pending");
                    break;
                case 8:
                    todoList.undo();
                    break;
                case 9:
                    todoList.redo();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    private static Task findTask(ToDoList todoList, String description) {
        for (Task task : todoList.getTasks()) {
            if (task.getDescription().equalsIgnoreCase(description)) {
                return task;
            }
        }
        return null;
    }
}

