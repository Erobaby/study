package me.erobaby.study.designpattern.template;

import org.testng.annotations.Test;

public class TemplateTest {

    @Test
    public void testCook() {
        EggCook eggCook = new EggCook();
        eggCook.cook();
        BouilliCook bouilliCook = new BouilliCook();
        bouilliCook.cook();
    }
}