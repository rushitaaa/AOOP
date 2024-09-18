package com;

public class WorkerThread extends Thread {
    private SharedResource resource;

    // Constructor to assign the shared resource
    public WorkerThread(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            resource.increment(); // Increment the counter 1000 times
        }
    }
}

