package me.erobaby.study.designpattern.observer;

public abstract class Event {
    private Object source;

    public Event(Object source) {
        this.source = source;
    }

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }
}
