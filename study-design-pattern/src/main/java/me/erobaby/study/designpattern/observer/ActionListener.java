package me.erobaby.study.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class ActionListener {
    private List<WindowClose> observers = new ArrayList<>();

    {
        observers.add(new Button());
        observers.add(new TextInput());
    }

    public void active(Object source) {
        for (WindowClose windowClose : observers) {
            windowClose.onClose(source);
        }
    }
}
