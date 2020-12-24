package Homework_3;

import java.util.concurrent.locks.ReentrantLock;

public class Counter extends Thread {

    private ReentrantLock lock = new ReentrantLock();
    private int count = 0;

    @Override
    public void run() {
        while (count != 20) {
            increment();
        }
    }

    private void increment() {
        lock.lock();
        try {
            count++;
            System.out.println(count);
        } finally {
            lock.unlock();
        }
    }

}