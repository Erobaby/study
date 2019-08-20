package me.erobaby.study.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class TestValite {
    AtomicInteger atomicInteger = new AtomicInteger(0);

    void m() {
        for (int i = 0; i < 10000; i++) {
            atomicInteger.incrementAndGet();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        TestValite tv = new TestValite();
        List<Thread> ts = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(tv::m);
            ts.add(t);
            t.start();
        }

        ts.forEach(thread -> {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });


        System.out.println(tv.atomicInteger.get());
    }
}
