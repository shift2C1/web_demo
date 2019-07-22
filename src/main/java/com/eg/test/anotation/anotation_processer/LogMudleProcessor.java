package com.eg.test.anotation.anotation_processer;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


/**
 * logmudle 注解解析器
 *
 * */
@Aspect
@Component
public class LogMudleProcessor {
    @Before("execution(public void com.eg.test.controller.TestServlet.service())")
    public void insertLog(JoinPoint joinPoint){
        String typeName=joinPoint.getSignature().getDeclaringTypeName();
        System.out.println(typeName);
        System.out.println("aop 日志 ---------------------------");
    }
}
