package me.erobaby.study.java.serial;

import java.io.*;

public class SerialTest {
    public static void main(String[] args) throws Exception {
//        Dog dog = new Dog();
//        dog.setName("erhessi");
//        dog.setAge(17);
//        serialObject(dog);
        Dog dog = deserialObject();
        System.out.println(dog);
    }
    public static void serialObject(Dog dog) throws IOException {
        File f = new File("/Users/erobaby/temp/dog.obj");
        if (!f.exists()) {
            f.createNewFile();
        }
        try (OutputStream os = new FileOutputStream(f);
             ObjectOutputStream oos = new ObjectOutputStream(os)) {
            oos.writeObject(dog);
        }
    }

    public static Dog deserialObject() throws IOException, ClassNotFoundException {
        File f = new File("/Users/erobaby/temp/dog.obj");
        try (InputStream is = new FileInputStream(f);
             ObjectInputStream oos = new ObjectInputStream(is)) {
            Dog dog = (Dog) oos.readObject();
            return dog;
        }
    }
}
