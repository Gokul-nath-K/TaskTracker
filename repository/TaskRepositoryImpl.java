package main.repository;

import main.model.Task;

import java.util.List;

public class TaskRepositoryImpl implements TaskRepository {

    @Override
    public void add(Task task) {
        // TODO: add description
    }

    @Override
    public List<Task> listAllTasks() {
        // TODO: list all tasks
        return List.of();
    }

    @Override
    public List<Task> listTasksByStatus(String status) {
        // TODO: list tasks by status
        return List.of();
    }

    @Override
    public Task updateTaskDescription(int id, String description) {
        // TODO: update task description
        return null;
    }

    @Override
    public void deleteTask(int id) {
        // TODO: delete tasks
    }

    @Override
    public Task updateTaskStatus(int id, String status) {
        // TODO: update task status
        return null;
    }
}
