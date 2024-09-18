package com;

public class Producer extends Thread {
    private final SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int messageCount = 0;
        while (true) {
            try {
                String message = "Message " + messageCount++;
                buffer.produce(message);  
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

