package me.erobaby.study.designpattern.observer;

public class Window {
    private ActionListener observer;
    public void close() {
        System.out.println("Window close");
        observer.active(this);
    }

    public ActionListener getObserver() {
        return observer;
    }

    public void setObserver(ActionListener observer) {
        this.observer = observer;
    }
}
