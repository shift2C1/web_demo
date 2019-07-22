package com.eg.test.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import java.io.IOException;

@Slf4j
public class Filter2 implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("过滤器2 初始化");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("执行过滤器2.......");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    public void destroy() {
        log.info("过滤器2销毁了");
    }
}
