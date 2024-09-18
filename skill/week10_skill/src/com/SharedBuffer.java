package com;

import java.util.LinkedList;
import java.util.Queue;

public class SharedBuffer {
    private final Queue<String> queue = new LinkedList<>();
    private final int capacity;

    public SharedBuffer(int capacity) {
        this.capacity = capacity;
    }

    
    public synchronized void produce(String message) throws InterruptedException {
        
        while (queue.size() == capacity) {
            System.out.println("Buffer is full. Producer is waiting...");
            wait();
        }

        
        queue.offer(message);
        System.out.println("Produced: " + message);

        
        notify();
    }

    public synchronized String consume() throws InterruptedException {
        while (queue.isEmpty()) {
            System.out.println("Buffer is empty. Consumer is waiting...");
            wait();
        }

        String message = queue.poll();
        System.out.println("Consumed: " + message);

        notify();

        return message;
    }
}

