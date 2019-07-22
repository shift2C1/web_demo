package com.eg.test.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//@WebFilter(urlPatterns = {"/*"})
@WebFilter//创建过滤器
@Component//注入ioc，不用词注解的话的 得在启动类上边配置 servlet component scan :配置的执行顺讯不起作用？？
@Order(value = 1)
@Slf4j
public class Filter3 implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
        /**
         * 不用配置类的方式添加过滤器
         *
         * */
        log.info("过滤器3 初始化");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("执行过滤器3........");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    public void destroy() {
        log.info("过滤器3销毁....");
    }
}
