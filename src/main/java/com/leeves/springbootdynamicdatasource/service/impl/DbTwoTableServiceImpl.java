package com.leeves.springbootdynamicdatasource.service.impl;


import com.leeves.springbootdynamicdatasource.annotation.DS;
import com.leeves.springbootdynamicdatasource.comm.DataSourceType;
import com.leeves.springbootdynamicdatasource.dao.DbTwoTableMapper;
import com.leeves.springbootdynamicdatasource.entity.DbTwoTable;
import com.leeves.springbootdynamicdatasource.service.DbTwoTableService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description:
 * Package: com.apedad.example.service.impl
 *
 * @author Leeves
 * @version 1.0.0  2018-07-14
 */
@Service
public class DbTwoTableServiceImpl implements DbTwoTableService {

    @Autowired
    private DbTwoTableMapper mDbTwoTableMapper;

//    @DS(dtaSourceType = DataSourceType.DB_SLAVE1)
    @Override
    public List<DbTwoTable> queryAll() {
        return mDbTwoTableMapper.selectAll();
    }
}