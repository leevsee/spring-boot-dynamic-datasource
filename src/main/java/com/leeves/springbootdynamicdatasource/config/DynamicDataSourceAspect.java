package com.leeves.springbootdynamicdatasource.config;

import com.leeves.springbootdynamicdatasource.annotation.DS;
import com.leeves.springbootdynamicdatasource.comm.DataSourceType;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Description:
 * Package: com.leeves.springbootdynamicdatasource.config
 *
 * @author Leeves
 * @version 1.0.0  2018-07-16
 */
@Aspect
@Order(-1)
@Component
public class DynamicDataSourceAspect {

    private static final Logger logger = LoggerFactory.getLogger(DynamicDataSourceAspect.class);

    /**
     * 执行方法前更换数据源
     *
     * @param joinPoint 切点
     * @param ds        动态数据源
     */
    @Before("@annotation(ds)")
    public void doBefore(JoinPoint joinPoint, DS ds) {
        DataSourceType dataSourceType = ds.dtaSourceType();
        if (dataSourceType == DataSourceType.DB_SLAVE1) {
            logger.info("设置数据源为:" + DataSourceType.DB_SLAVE1);
            DynamicDataSourceContextHolder.set(DataSourceType.DB_SLAVE1);
        } else {
            logger.info("使用默认数据源:" + DataSourceType.DB_MASTER);
            DynamicDataSourceContextHolder.set(DataSourceType.DB_MASTER);
        }
    }

    /**
     * 执行方法后清除数据源设置
     *
     * @param joinPoint 切点
     * @param ds        动态数据源
     */
    @After("@annotation(ds)")
    public void doAfter(JoinPoint joinPoint, DS ds) {
        logger.info("当前数据源为："+ds.dtaSourceType()+"。然后执行清理数据源设置方法");
        DynamicDataSourceContextHolder.clear();
    }


    /**
     * 在service下以query开头的方法，且没有用DS注解，则使用副库
     *
     * @param joinPoint        切点
     */
/*    @Before(value = "execution(* com.leeves.springbootdynamicdatasource.service.*.query*(..))")
    public void doBeforeWithSlave(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        //获取当前切点方法对象
        Method method = methodSignature.getMethod();
        //判断是否为接口方法
        if (method.getDeclaringClass().isInterface()) {
            try {
                //获取实际类型的方法对象
                method = joinPoint.getTarget().getClass()
                        .getDeclaredMethod(joinPoint.getSignature().getName(), method.getParameterTypes());
            } catch (NoSuchMethodException e) {
                logger.error("方法不存在！", e);
            }
        }
        if (null == method.getAnnotation(DS.class)) {
            DynamicDataSourceContextHolder.setSlave();
        }
    }*/

}