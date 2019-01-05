package me.erobaby.study.java.staticproxy;

import java.lang.reflect.Proxy;

public class JdkProxy {
    public static void main(String[] args) {
        Dog dog = new Dog();
        DogInterfaceProxy proxy = new DogInterfaceProxy(dog) ;
        proxy.run();
    }
}
