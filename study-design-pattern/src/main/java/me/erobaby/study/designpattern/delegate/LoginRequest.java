package me.erobaby.study.designpattern.delegate;

public class LoginRequest implements Request {

    @Override
    public void doRequest() {
        System.out.println("登陆");
    }
}
