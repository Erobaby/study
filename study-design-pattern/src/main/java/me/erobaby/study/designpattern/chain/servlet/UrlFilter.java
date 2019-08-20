package me.erobaby.study.designpattern.chain.servlet;

public class UrlFilter implements Filter {
    @Override
    public boolean doFilter(Request req, Response res, FilterChain chain) {
        String content = res.getContent();
        content = "<url>" + content;
        res.setContent(content);

        chain.doFilter(req, res);

        content = res.getContent();
        content = content + "</url>";
        res.setContent(content);
        return true;
    }
}
