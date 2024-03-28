package com.adepuu.exercises.session8;

import java.util.*;

// This class will handle task management functionalities, including adding tasks, viewing tasks,
// and deleting tasks. It will interact with the user's to-do list.
public class TaskManager {
    private Map<User, List<Task>> userTasks;
    public TaskManager() {
        this.userTasks = new HashMap<>();
    }

    public void addTask(Scanner scanner, User user) {
        System.out.println("Enter task description:");
        String description = scanner.nextLine();
        Task newTask = new Task(description);
        List<Task> tasks = userTasks.getOrDefault(user, new ArrayList<>());
        tasks.add(newTask);
        userTasks.put(user, tasks);
        System.out.println("Task added successfully.");
    }

    public void viewTasks(User user) {
        List<Task> tasks = userTasks.getOrDefault(user, new ArrayList<>());
        if (tasks.isEmpty()) {
            System.out.println("No tasks found.");
        } else {
            System.out.println("Tasks:");
            for (Task task : tasks) {
                System.out.println(task.getTaskID() + ": " + task.getDescription());
            }
        }
    }

    public void deleteTask(Scanner scanner, User user) {
        System.out.println("Enter task ID to delete:");
        int taskID = scanner.nextInt();
        List<Task> tasks = userTasks.getOrDefault(user, new ArrayList<>());
        tasks.removeIf(task -> task.getTaskID()==taskID);
        userTasks.put(user, tasks);
        System.out.println("Task deleted successfully.");
    }
}
