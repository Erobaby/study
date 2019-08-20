package me.erobaby.study.designpattern.chain.servlet;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {

    private List<Filter> filters = new ArrayList<>();
    private int index = 0;

    public void doFilter(Request req, Response res) {
        if (index >= filters.size()) {
            return;
        }
        Filter f = filters.get(index);
        index++;
        f.doFilter(req, res, this);
    }

    public FilterChain add(Filter filter) {
        filters.add(filter);
        return this;
    }
}
