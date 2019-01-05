package me.erobaby.study.java.staticproxy;

import java.util.concurrent.TimeUnit;

public class Dog implements Animal {
    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Dog is running");
    }
}
