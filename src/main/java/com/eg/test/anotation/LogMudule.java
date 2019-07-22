package com.eg.test.anotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(value = ElementType.TYPE)
public @interface LogMudule {
    public String name() default "zhangsan";
}
