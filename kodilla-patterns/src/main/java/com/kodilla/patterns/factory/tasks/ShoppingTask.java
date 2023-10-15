package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{
    private final String taskaName;
    private final String whatToBuy;
    private final double quantity;
    private boolean executrTask = false;

    public ShoppingTask(final String taskaName, final String whatToBuy, final double quantity) {
        this.taskaName = taskaName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        System.out.println("Shopping task is done");
        executrTask = true;
    }

    @Override
    public String getTaskName() {
        return taskaName;
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
