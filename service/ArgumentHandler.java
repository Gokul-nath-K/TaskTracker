package main.service;

import main.repository.TaskRepository;
import main.repository.TaskRepositoryImpl;

public class ArgumentHandler {

    TaskRepository taskRepository = new TaskRepositoryImpl();
    TaskTrackerService service = new TaskTrackerService(taskRepository);

    public void handleArguments(String[] args) {

        String action = args[0];

        switch (action) {

            case "add":
                service.addTask(args);
                break;

            case "list":
                service.listTasks(args);
                break;

            case "update":
                service.updateTaskDescription(args);
                break;

            case "delete":
                service.deleteTask(args);                break;

            case "mark-in-progress":
                service.updateStatus(args);
                break;

            case "mark-done":
                service.updateStatus(args);
                break;

            default:
        }
    }
}
