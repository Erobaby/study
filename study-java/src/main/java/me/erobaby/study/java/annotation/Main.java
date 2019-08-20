package me.erobaby.study.java.annotation;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        Annotation[] annotations = Cat.class.getAnnotations();
        System.out.println("=================");
        for (Annotation a : annotations) {
            System.out.println(a.annotationType().getName());
        }
        System.out.println("=================");

    }
}
