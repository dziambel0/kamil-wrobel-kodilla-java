package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer{

    private final String mentor;

    private int updateCount = 0;

    public Mentor(String mentorName) {
        this.mentor = mentorName;
    }

    @Override
    public void update(Homevork homevork) {
        System.out.println(mentor + " : New homework to check from " + homevork.getName() + " (total: " + homevork.getHomeworks().size() + " homeworks to check.");
        updateCount++;
    }

    public String getMentor() {
        return mentor;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
