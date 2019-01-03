package me.erobaby.study.thread;

/**
 * Created by erobaby on 2017/7/16.
 */
public class MyRunnable extends Thread {
    private int count = 6;

    public MyRunnable(String name) {
        super();
        this.setName(name);
    }

    @Override
    public synchronized void run() {
        while (count >= 0) {
            System.out.println(Thread.currentThread().getName() + Thread.currentThread().getId() + ":" + count);
            count--;
        }
    }
}
