package main.util;

import main.exceptions.InvalidArgumentsException;

public class ArgumentValidator {

    public boolean validateAddTaskArgument(String[] args) {

        if (args.length != 2)
            throw new InvalidArgumentsException("Invalid number of arguments. Expected 2 arguments: add <description>");

        return true;
    }

    public boolean validateListTasksArgument(String[] args) {

        if(args.length == 2) {
            String status = args[1];
            if(!status.equalsIgnoreCase("todo")
                    && !status.equalsIgnoreCase("in-progress")
                    && !status.equalsIgnoreCase("done")) {
                throw new InvalidArgumentsException("Invalid status. Expected 'todo', 'in-progress', or 'done'");
            }
        }
        return true;
    }

    public boolean validateUpdateTaskArgs(String[] args) {

        if(args.length != 3)
            throw new InvalidArgumentsException("Invalid number of arguments. Expected 3 arguments: update <id> <description>");

        return true;
    }

    public boolean validateDeleteTaskArgs(String[] args) {

        if(args.length != 2)
            throw new InvalidArgumentsException("Invalid number of arguments. Expected 2 arguments: delete <id>");

        return true;
    }

    public boolean validateUpdateTaskStatusArgs(String[] args) {

        if(args.length != 2)
            throw new InvalidArgumentsException("Invalid number of arguments. Expected 2 arguments: mark-in-progress <id> or mark-done <id>");

        return true;
    }
}
