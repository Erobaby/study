package me.erobaby.study.designpattern.chain.simple;

public class NoFilter implements Filter {
    @Override
    public boolean doFilter(Msg msg) {
        return false;
    }
}
