package main.repository;

import main.model.Task;

import java.util.List;

public interface TaskRepository {

    void add(Task task);

    List<Task> listAllTasks();

    List<Task> listTasksByStatus(String status);

    Task updateTaskDescription(int id, String description);

    void deleteTask(int id);

    Task updateTaskStatus(int id, String status);
}
