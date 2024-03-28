package com.adepuu.exercises.session7;

public class Event {
    private String eventName;
    private int capacity;

    public Event(String eventName, int capacity){
        this.eventName=eventName;
        this.capacity=capacity;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return this.getEventName();
    }
}
