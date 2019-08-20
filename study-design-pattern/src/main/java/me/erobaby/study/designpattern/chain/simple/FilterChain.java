package me.erobaby.study.designpattern.chain.simple;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {

    private List<Filter> filters = new ArrayList<>();

    @Override
    public boolean doFilter(Msg msg) {
        for (Filter filter : filters) {
            if (!filter.doFilter(msg)) {
                return false;
            }
        }
        return true;
    }

    public FilterChain addFilter(Filter filter) {
        filters.add(filter);
        return this;
    }
}