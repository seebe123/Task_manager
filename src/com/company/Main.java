package com.company;
import java.util.ArrayList;

import static com.company.Priority.*;

public class Main {
    public static final String RESET = "\033[0m";
    public static final String RED = "\033[0;31m";     // RED
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<Task>();
        tasks.add(new Task("java oefeningen", HIGH));
        tasks.add(new Task("werken aan project", LOW));
        tasks.add(new Task("meeting", NORMAL));

        for(Task currentTask : tasks){
            if(currentTask.getPriority()==HIGH)
                System.out.println(RED+currentTask.getDescription()+RESET);
            if(currentTask.getPriority()==NORMAL)
                System.out.println(YELLOW+currentTask.getDescription()+RESET);
            if(currentTask.getPriority()==LOW)
                System.out.println(BLUE+currentTask.getDescription()+RESET);
        }
    }
}
