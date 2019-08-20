package me.erobaby.study.thread;

import java.util.Collections;
import java.util.concurrent.*;
import java.util.stream.Collectors;

/**
 * Created by erobaby on 2017/7/16.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        Object lock = new Object();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("start1...");
                try {
                    synchronized (lock) {
                        lock.wait();
                        TimeUnit.SECONDS.sleep(10);
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                countDownLatch.countDown();
            }
        }, "Wenbing11");
        t1.start();
        TimeUnit.SECONDS.sleep(2);
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("start2...");
                try {
                    synchronized (lock) {
                        TimeUnit.SECONDS.sleep(10);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                t1.notify();
                countDownLatch.countDown();
            }
        }, "Wenbing22").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("start3...");
                try {
                    synchronized (lock) {
                        TimeUnit.SECONDS.sleep(10);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                countDownLatch.countDown();
            }
        }, "Wenbing33").start();
        countDownLatch.await();
        TimeUnit.MINUTES.sleep(10);

        ConcurrentHashMap m = new ConcurrentHashMap();
    }
}
