package me.erobaby.study.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 */
public class StudyWait {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        Thread t1 = new Thread(() -> {
            System.out.println("Thread 1 lock before");
            lock.lock();
            try {
                System.out.println("Thread 1 start");
                TimeUnit.SECONDS.sleep(5);
                System.out.println("Thread 1 end");
            } catch (Exception e) {
            } finally {
                lock.unlock();
            }

        });
        t1.start();

//        new Thread(() -> {
//            System.out.println("Thread 2 lock before");
//            lock.lock();
//            try {
//                System.out.println("Thread 2 start");
//                System.out.println("Thread 2 end");
//            } finally {
//                lock.unlock();
//            }
//        }).start();
//        t1.interrupt();
        while (true) {

        }
    }
}
