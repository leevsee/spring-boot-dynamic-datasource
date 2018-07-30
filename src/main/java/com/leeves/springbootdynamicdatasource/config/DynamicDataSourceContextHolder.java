package com.leeves.springbootdynamicdatasource.config;

import com.leeves.springbootdynamicdatasource.comm.DataSourceType;

/**
 * Description: 获取当前线程，为当前线程设置数据源的key
 * Package: com.leeves.springbootdynamicdatasource.config
 *
 * @author Leeves
 * @version 1.0.0  2018-07-16
 */
public class DynamicDataSourceContextHolder {

    private static final ThreadLocal<DataSourceType> CURRENT_DATASOURCE = new ThreadLocal<>();

    /**
     * 清除当前数据源
     */
    public static void clear() {
        CURRENT_DATASOURCE.remove();
    }

    /**
     * 获取当前使用的数据源
     *
     */
    public static DataSourceType get() {
        return CURRENT_DATASOURCE.get();
    }

    /**
     * 设置当前使用的数据源
     *
     */
    public static void set(DataSourceType value) {
        CURRENT_DATASOURCE.set(value);
    }

    /**
     * 通过aop 以query开头，设置从从库读取数据
     */
    public static void setSlave() {
        DynamicDataSourceContextHolder.set(DataSourceType.DB_SLAVE1);
    }
}