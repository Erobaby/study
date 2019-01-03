package me.erobaby.study.designpattern.strategy;

import me.erobaby.study.designpattern.strategy.AwmWeapon;
import me.erobaby.study.designpattern.strategy.Context;
import me.erobaby.study.designpattern.strategy.Weapon;
import org.testng.annotations.Test;

/**
 * @author erobaby
 * @date 2018/11/19
 */
public class StrategyTest {

    @Test
    public void testGun() {
        Weapon weapon = new AwmWeapon();
        Context context = new Context(weapon);
        context.gun();
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}
