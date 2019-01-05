package me.erobaby.study.java.cglibproxy;

import java.util.concurrent.TimeUnit;

public class Dog {
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Dog is running");
    }
}
