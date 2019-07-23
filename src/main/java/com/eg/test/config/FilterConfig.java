package com.eg.test.config;

import com.eg.test.controller.TestServlet;
import com.eg.test.filter.Filter1;
import com.eg.test.filter.Filter2;
//import com.eg.test.filter.TestFilter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import javax.servlet.Servlet;

@Configuration
@Slf4j
public class FilterConfig {
//    @Bean
//    public String RegisterFilter1(){
//        log.info("过滤器1 注册.....");
//        return "过滤器1 注册.....";
//    }
//


    /**
     * 添加过滤器：从配置类添加过滤器 是注册的第三方过滤器,不同于用webfilter注解
     * */
    @Bean
    public Filter ReturnFilter1(){
        return new Filter1();
    }

    @Bean
    public Filter ReturnFilter2(){
        return new Filter2();
    }

    //配置执行顺序：
    /**
     * 数字小的最先执行
     *以下 先执行 过滤器2 再执行过滤器1
     * */
    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean filterRegistrationBean=new FilterRegistrationBean();
        filterRegistrationBean.setFilter(this.ReturnFilter1());
        filterRegistrationBean.setName("filter1");
        filterRegistrationBean.setOrder(Integer.MAX_VALUE-1);
        return filterRegistrationBean;
    }
    @Bean
    public FilterRegistrationBean filterRegistrationBean2(){
        FilterRegistrationBean filterRegistrationBean=new FilterRegistrationBean();
        filterRegistrationBean.setFilter(this.ReturnFilter2());
        filterRegistrationBean.setName("filter2");
        filterRegistrationBean.setOrder(Integer.MAX_VALUE-2);
        return filterRegistrationBean;
    }


    /**
     * ioc注入servlet
     *
     * */
    @Bean
    public Servlet iocServlet(){
        return new TestServlet();
    }
    @Bean
    public ServletRegistrationBean servletRegistrationBean1(){
        ServletRegistrationBean servletRegistrationBean =new ServletRegistrationBean();

        servletRegistrationBean.setServlet(iocServlet());
        /**
         * 必须设置，不然所有的请求都只会进入到该servlet
         *
         * */
        servletRegistrationBean.setName("iocServlet");
        servletRegistrationBean.addUrlMappings("/testservlet");
        return servletRegistrationBean;
    }

}
