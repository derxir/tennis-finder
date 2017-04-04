package com.derxir.aop;

import java.lang.annotation.*;

/**
 * Created by justin on 4/4/17.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LoggerManage {

    String description();
}
