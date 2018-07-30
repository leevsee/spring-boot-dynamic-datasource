package com.leeves.springbootdynamicdatasource.annotation;

import com.leeves.springbootdynamicdatasource.comm.DataSourceType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Description: 数据源注解类
 * Package: com.leeves.springbootdynamicdatasource.annotation
 *
 * @author Leeves
 * @version 1.0.0  2018-07-16
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface DS {
    DataSourceType dtaSourceType() default DataSourceType.DB_MASTER;
}
