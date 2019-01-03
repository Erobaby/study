package me.erobaby.study.designpattern.delegate;

public class RegisterRequest implements Request {
    @Override
    public void doRequest() {
        System.out.println("注册");
    }
}
