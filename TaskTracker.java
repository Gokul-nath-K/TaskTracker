package main;

import main.service.ArgumentHandler;

public class TaskTracker {

    public static void main(String[] args) {

        ArgumentHandler argumentHandler = new ArgumentHandler();
        argumentHandler.handleArguments(args);
    }
}