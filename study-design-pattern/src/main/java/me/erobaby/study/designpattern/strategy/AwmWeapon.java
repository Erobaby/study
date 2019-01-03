package me.erobaby.study.designpattern.strategy;

public class AwmWeapon implements Weapon {
    /**
     * 开枪
     */
    @Override
    public void gun() {
        System.out.println("Use AWM Shot");
    }
}
