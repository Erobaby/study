package me.erobaby.study.designpattern.strategy;

public class Ak47Weapon implements Weapon {
    /**
     * 开枪
     */
    @Override
    public void gun() {
        System.out.println("Use AK47 Shot");
    }
}
