package me.erobaby.study.designpattern.delegate;

import java.util.HashMap;
import java.util.Map;

public class Leader  {

    Map<String, Request> registeies = new HashMap();
    public Leader() {
        registeies.put("登陆", new LoginRequest());
        registeies.put("注册", new RegisterRequest());
    }

    public void doRequest(String common) {
        registeies.get(common).doRequest();
    }
}
