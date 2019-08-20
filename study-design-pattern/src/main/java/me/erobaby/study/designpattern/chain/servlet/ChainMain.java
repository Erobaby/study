package me.erobaby.study.designpattern.chain.servlet;

public class ChainMain {
    public static void main(String[] args) {
        Request request = new Request();
        request.setContent("request hahaha");
        Response response = new Response();
        response.setContent("response hahaha");

        FilterChain filterChain = new FilterChain();
        filterChain.add(new ContentFilter()).add(new UrlFilter());
        filterChain.doFilter(request, response);
        System.out.println(request);
        System.out.println(response);
    }
}
