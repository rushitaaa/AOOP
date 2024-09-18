package com;

public class Consumer extends Thread {
    private final SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                buffer.consume();  
                Thread.sleep(1000);  
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

