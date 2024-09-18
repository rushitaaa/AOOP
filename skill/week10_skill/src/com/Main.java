package com;

public class Main {
    public static void main(String[] args) {
        // Create the shared buffer with a capacity of 5
        SharedBuffer buffer = new SharedBuffer(5);

        // Create and start the producer and consumer threads
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}

