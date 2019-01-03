package me.erobaby.study.designpattern.template;

public abstract class AbstractCook {
    /**
     * 做饭
     */
    public void cook() {
        preparation();
        doing();
        carriedDishes();
    }

    /**
     * 备料
     */
    public abstract void preparation();

    /**
     * 做菜
     */
    public abstract void doing();

    /**
     * 上菜
     */
    public void carriedDishes() {
        System.out.println("上菜");
    }
}
