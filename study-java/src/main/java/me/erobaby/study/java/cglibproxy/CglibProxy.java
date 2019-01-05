package me.erobaby.study.java.cglibproxy;

import net.sf.cglib.proxy.Enhancer;


public class CglibProxy {
    public static void main(String[] args) {
        Enhancer handler = new Enhancer();
        handler.setSuperclass(Dog.class);
        handler.setCallback(new TimeProxy());
        Dog dog = (Dog) handler.create();
        dog.run();
    }
}
