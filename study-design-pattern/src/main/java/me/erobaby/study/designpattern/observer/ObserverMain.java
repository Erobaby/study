package me.erobaby.study.designpattern.observer;

public class ObserverMain {

    public static void main(String[] args) {
        ActionListener observer = new ActionListener();
        Window window = new Window();
        window.setObserver(observer);
//        window.close();
    }
}