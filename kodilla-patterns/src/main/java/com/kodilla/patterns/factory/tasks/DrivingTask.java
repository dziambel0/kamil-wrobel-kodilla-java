package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task{
    private final String taskName;
    private final String where;
    private final String using;
    private boolean executrTask = false;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        System.out.println("Driving task is done");
        executrTask = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if(executrTask){
            return true;
        }else {
            return false;
        }
    }
}
