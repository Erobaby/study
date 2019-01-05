package me.erobaby.study.java.dynamicproxy;

import java.lang.reflect.Proxy;

public class JdkProxy {
    public static void main(String[] args) {
        Dog dog = new Dog();
        TimeInvocationHandler<Dog> t = new TimeInvocationHandler<Dog>(dog);
        Object pro =  Proxy.newProxyInstance(Dog.class.getClassLoader(), Dog.class.getInterfaces(), t);
        Animal animal = (Animal) pro;
        animal.run();
    }
}
