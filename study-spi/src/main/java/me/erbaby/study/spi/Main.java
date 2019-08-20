package me.erbaby.study.spi;

import java.sql.Driver;
import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) throws Exception {

        ClassLoader c1 = Main.class.getClassLoader();
        System.out.println(c1.toString());
        ClassLoader c2 = c1.getParent();
        System.out.println(c2.toString());
        ClassLoader c3 = c2.getParent();
        System.out.println(Thread.currentThread().getContextClassLoader());

    }
}
