package com;

public class Main {
    public static void main(String[] args) {
        // Create the shared resource
        SharedResource resource = new SharedResource();

        // Create multiple threads that will share the same resource
        Thread t1 = new WorkerThread(resource);
        Thread t2 = new WorkerThread(resource);
        Thread t3 = new WorkerThread(resource);

        // Start the threads
        t1.start();
        t2.start();
        t3.start();

        // Wait for all threads to finish
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final counter value
        System.out.println("Final counter value: " + resource.getCounter());
    }
}

