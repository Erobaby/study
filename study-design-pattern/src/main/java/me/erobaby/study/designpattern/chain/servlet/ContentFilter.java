package me.erobaby.study.designpattern.chain.servlet;

public class ContentFilter implements Filter {
    @Override
    public boolean doFilter(Request req, Response res, FilterChain chain) {
        String content = res.getContent();
        content = "<p>" + content;
        res.setContent(content);

        chain.doFilter(req, res);

        content = res.getContent();
        content = content + "</p>";
        res.setContent(content);
        return true;
    }
}
