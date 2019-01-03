package me.erobaby.study.designpattern.template;

public class EggCook extends AbstractCook {

    /**
     * 备料
     */
    @Override
    public void preparation() {
        System.out.println("准备鸡蛋");
    }

    /**
     * 做菜
     */
    @Override
    public void doing() {
        System.out.println("放油，炒鸡蛋");
    }
}
