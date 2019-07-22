package com.eg.test.anotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//类注解：应用于类的上面，还有方法注解，参数注解，字段注解，局部变量注解
@Target(value = {ElementType.TYPE})
//在什么时候起作用：默认为在编译后的文件中使用，这里配置的是在运行时使用
@Retention(RetentionPolicy.RUNTIME)
public @interface ClassAno {
    String instruction() default "类注解";
}
