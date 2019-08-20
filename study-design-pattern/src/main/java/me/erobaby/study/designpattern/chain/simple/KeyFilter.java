package me.erobaby.study.designpattern.chain.simple;

public class KeyFilter implements Filter {
    @Override
    public boolean doFilter(Msg msg) {
        String content = msg.getContent();
        content = content.replace("baidu", "google");
        msg.setContent(content);
        return true;
    }
}
