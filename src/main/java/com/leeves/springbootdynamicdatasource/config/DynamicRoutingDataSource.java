package com.leeves.springbootdynamicdatasource.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Description:
 * Package: com.leeves.springbootdynamicdatasource.config
 *
 * @author Leeves
 * @version 1.0.0  2018-07-16
 */
public class DynamicRoutingDataSource extends AbstractRoutingDataSource {

    private static final Logger logger = LoggerFactory.getLogger(DynamicRoutingDataSource.class);

    @Override
    protected Object determineCurrentLookupKey() {
        logger.info("当前数据源："+ DynamicDataSourceContextHolder.get());
        return DynamicDataSourceContextHolder.get();
    }
}