package me.erobaby.study.java.serial;

import java.io.Serializable;

public class Dog implements Serializable {
    private static final long serialVersionUID = 1L;

    private int age;
//    private String name;
//    private String desc;
    private String desc2;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
////
//    public String getDesc() {
//        return desc;
//    }
//
//    public void setDesc(String desc) {
//        this.desc = desc;
//    }

    public String getDesc2() {
        return desc2;
    }

    public void setDesc2(String desc2) {
        this.desc2 = desc2;
    }
}