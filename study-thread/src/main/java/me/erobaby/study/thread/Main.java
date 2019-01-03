package me.erobaby.study.thread;

/**
 * Created by erobaby on 2017/7/16.
 */
public class Main {
    public static void main(String[] args) {
        MyRunnable r1 = new MyRunnable("A");
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);
        Thread t3 = new Thread(r1);
        t1.start();
        t2.start();
        t3.start();
    }
}
