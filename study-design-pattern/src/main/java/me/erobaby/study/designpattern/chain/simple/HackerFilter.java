package me.erobaby.study.designpattern.chain.simple;

public class HackerFilter implements Filter {
    @Override
    public boolean doFilter(Msg msg) {
        String content = msg.getContent();
        content = content.replace("<", "[");
        content = content.replace(">", "]");
        msg.setContent(content);
        return true;
    }
}
