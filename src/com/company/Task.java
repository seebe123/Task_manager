package com.company;

public class Task {
    private String description;
    private Priority priority;
    Task(String description, Priority priority){
        this.priority= priority;
        this.description= description;
    }

    public String getDescription() {
        return description;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

}

enum Priority {
    LOW,
    NORMAL,
    HIGH
}

