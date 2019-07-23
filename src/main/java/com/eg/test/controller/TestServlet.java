package com.eg.test.controller;

import com.eg.test.anotation.LogMudule;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/testservlet")
@Component
@Slf4j
@LogMudule(name = "test")
public class TestServlet  implements Servlet {
    public void init(ServletConfig servletConfig) throws ServletException {
        /**
         *请求进来的时候初始化
         *
         * */
        log.info("初始化servlet ....");
    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        log.info("执行servlet...");
        servletResponse.setCharacterEncoding("UTF-8");
        servletResponse.getWriter().write("这是一个通过ioc注册的servlet");
    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {

        /**
         * 请求执行完
         * 应用关闭时候销毁
         * */
        log.info("销毁servlet....");
    }
}
