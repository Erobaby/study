package me.erobaby.study.java.staticproxy;

public class DogInterfaceProxy implements Animal {
    private Animal animal;

    public DogInterfaceProxy(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void run() {
        animal.run();
    }
}
