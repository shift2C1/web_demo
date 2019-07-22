package com.eg.test.anotation.anotation_processer;

import com.eg.test.anotation.ClassAno;
import com.eg.test.anotation.MethodAno;

import java.lang.reflect.Method;

@ClassAno(instruction = "test class anotation 注解")
public class TestAnotationProcesser {
    @MethodAno(instuction = "method zhujie")
    public static void main(String[] args) {
        ClassAno clazz=TestAnotationProcesser.class.getAnnotation(ClassAno.class);
        System.out.println(clazz.instruction());
        test();

    }

    @MethodAno(instuction = "test method anotation")
    public static void test(){
        Class clazz=TestAnotationProcesser.class;
        Method method=null;
        try {
            method=clazz.getMethod("test");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
//        MethodAno methodAno=TestAnotationProcesser.class.getAnnotation(MethodAno.class);
        //方法注解必须由方法获得 ，由类获得不了
        MethodAno methodAno=method.getAnnotation(MethodAno.class);
        System.out.println(methodAno.instuction());
    }
}
