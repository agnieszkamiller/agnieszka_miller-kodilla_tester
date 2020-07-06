package com.kodilla.collections.adv.immutable.homework;

public final class Task {
    private final String title;
    private final int duration;
    protected final int dateOfStart;

    public Task(String title, int duration, int dateOfStart) {
        this.title = title;
        this.duration = duration;
        this.dateOfStart = dateOfStart;
    }

    public final String getTitle() {
        return title;
    }

    public final int getDuration() {
        return duration;
    }

    public final int getDateOfStart() {
        return dateOfStart;
    }

}
