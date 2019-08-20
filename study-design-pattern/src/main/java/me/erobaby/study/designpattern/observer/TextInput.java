package me.erobaby.study.designpattern.observer;

public class TextInput implements WindowClose {

    @Override
    public void onClose(Object source) {
        System.out.println(String.format("TextInput开始关闭，触发源：%s", source));
    }
}
