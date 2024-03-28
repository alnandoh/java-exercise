package com.adepuu.exercises.session8;

import java.util.UUID;

//This class represents a task entity with attributes such as task ID, description, status, etc.
// Each task will have a unique ID generated using UUID.
public class Task {
    private int taskID;
    private static int taskNum;
    private String description;
    public Task(String description){
        taskNum+= 1;
        this.taskID=taskNum;
        this.description=description;
    }


    public int getTaskID() {
        return taskID;
    }

    public String getDescription() {
        return description;
    }
}
