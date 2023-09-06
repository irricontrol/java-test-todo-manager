package org.example;

import java.util.*;

public class ToDoList {
    private Map<String, List<String>> tasks;

    public ToDoList() {
        tasks = new HashMap<>();
    }

    public void addTask(String category, String task) {
        if (!tasks.containsKey(category)) {
            tasks.put(category, new ArrayList<>());
        }
        tasks.get(category).add(task);
    }

    public void displayTasks() {
        for (Map.Entry<String, List<String>> entry : tasks.entrySet()) {
            String category = entry.getKey();
            List<String> taskList = entry.getValue();

            System.out.println("Category: " + category);
            for (String task : taskList) {
                System.out.println("- " + task);
            }
        }
    }

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        toDoList.addTask("Work", "Complete project report");
        toDoList.addTask("Personal", "Go grocery shopping");
        toDoList.addTask("Work", "Prepare for the meeting");
        toDoList.displayTasks();
    }
}


//   1- Task due dates and priority levels.
//   2- Task completion status and the ability to mark tasks as completed.
//   3- A user interface (GUI) for adding and managing tasks.
//   4- Saving tasks to a file/database and loading them on startup.
//   5- Task editing and deletion functionality.