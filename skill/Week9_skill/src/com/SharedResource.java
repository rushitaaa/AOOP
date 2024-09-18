package com;

public class SharedResource {
    private int counter = 0;

    // Synchronized method to increment the counter
    public synchronized void increment() {
        counter++;
    }

    // Synchronized method to get the counter value
    public synchronized int getCounter() {
        return counter;
    }
}
