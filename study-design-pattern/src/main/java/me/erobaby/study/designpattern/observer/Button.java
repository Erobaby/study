package me.erobaby.study.designpattern.observer;

public class Button implements WindowClose {
    @Override
    public void onClose(Object source) {
        System.out.println(String.format("Button开始关闭，触发源：%s", source));
    }
}
