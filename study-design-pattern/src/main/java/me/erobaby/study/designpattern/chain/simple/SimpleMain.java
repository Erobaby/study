package me.erobaby.study.designpattern.chain.simple;

public class SimpleMain {
    public static void main(String[] args) {
        Msg msg = new Msg();
        msg.setContent("hh baidu <scs> cd");

        FilterChain fc = new FilterChain();
        fc.addFilter(new HackerFilter()).addFilter(new NoFilter()).addFilter(new KeyFilter());
        fc.doFilter(msg);

        System.out.println(msg);
    }
}