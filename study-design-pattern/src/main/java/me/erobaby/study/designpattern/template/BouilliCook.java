package me.erobaby.study.designpattern.template;

public class BouilliCook extends AbstractCook {

    /**
     * 备料
     */
    @Override
    public void preparation() {
        System.out.println("准备红烧肉");
    }

    /**
     * 做菜
     */
    @Override
    public void doing() {
        System.out.println("放油，红烧肉，调料，开始炒");
    }
}
