package main.service;

import main.exceptions.InvalidArgumentsException;
import main.model.Task;
import main.repository.TaskRepository;
import main.util.ArgumentValidator;

import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

public class TaskTrackerService {

    Logger logger = Logger.getLogger(getClass().getName());

    TaskRepository  taskRepository;

    public TaskTrackerService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    ArgumentValidator argumentValidator = new ArgumentValidator();

    public void addTask(String[] args) {
        try {
            if(argumentValidator.validateAddTaskArgument(args)) {
                String description = args[1];
                taskRepository.add(buildTask(description));
            }
        }
        catch ( InvalidArgumentsException exception) {
            logger.warning(exception.getMessage());
        }
    }

    public void listTasks(String[] args) {

        try {

            if(argumentValidator.validateListTasksArgument(args)) {

                List<Task> tasks = args.length == 1 ?
                                        taskRepository.listAllTasks() :
                                        taskRepository.listTasksByStatus(args[1]);

                for(Task task : tasks) {
                    logger.info(task.toString());
                    logger.info("----------------------------------------------------");
                }
            }
        }
        catch (InvalidArgumentsException exception) {
            logger.warning(exception.getMessage());
        }
    }

    public void updateTaskDescription(String[] args) {

        try {

            if(argumentValidator.validateUpdateTaskArgs(args)) {

                int id = Integer.parseInt(args[1]);
                String description = args[2];
                logger.info(taskRepository.updateTaskDescription(id, description).toString());
            }
        }
        catch (InvalidArgumentsException exception) {
            logger.warning(exception.getMessage());
        }
    }

    public void deleteTask(String[] args) {

        try {

            if(argumentValidator.validateDeleteTaskArgs(args)) {

                int id = Integer.parseInt(args[1]);
                taskRepository.deleteTask(id);
                System.out.println("Task with ID " + id + " deleted successfully");
            }
        }
        catch (InvalidArgumentsException exception) {
            logger.warning(exception.getMessage());
        }
    }

    public void updateStatus(String[] args) {

        try {
            if(argumentValidator.validateUpdateTaskStatusArgs(args)) {

                int id = Integer.parseInt(args[1]);
                String status = args[0].substring(5, args[0].length());

                System.out.println(taskRepository.updateTaskStatus(id, status));
            }
        }
        catch (InvalidArgumentsException exception) {
            logger.warning(exception.getMessage());
        }
    }

    public Task buildTask(String description) {

        Task task = new Task();
        task.setId(System.currentTimeMillis());
        task.setDescription(description);
        task.setStatus("todo");
        task.setCreatedAt(new Date());
        task.setUpdatedAt(new Date());
        return task;
    }
}
