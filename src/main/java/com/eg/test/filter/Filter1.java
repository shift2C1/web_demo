package com.eg.test.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//@WebFilter
@Slf4j
public class Filter1 implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
        /**
         * 应用启动时候初始化
         *
         * */
        log.info("过滤器1 初始化");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("执行过滤器1........");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    public void destroy() {

        /**
         * 应用关闭时候销毁
         *
         * */
        log.info("过滤器1销毁了");
    }
}
