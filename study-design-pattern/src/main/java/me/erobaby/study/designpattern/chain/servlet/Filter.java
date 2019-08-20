package me.erobaby.study.designpattern.chain.servlet;

public interface Filter {
    boolean doFilter(Request req, Response res, FilterChain chain);
}
