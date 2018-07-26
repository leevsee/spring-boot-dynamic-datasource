package com.leeves.springbootdynamicdatasource.service.impl;


import com.leeves.springbootdynamicdatasource.dao.DbOneTableMapper;
import com.leeves.springbootdynamicdatasource.entity.DbOneTable;
import com.leeves.springbootdynamicdatasource.service.DbOneTableService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description: TODO
 * Package: com.apedad.example.service.impl
 *
 * @author Leeves
 * @version 1.0.0  2018-07-14
 */
@Service
public class DbOneTableServiceImpl implements DbOneTableService {

    @Autowired
    private DbOneTableMapper mDbOneTableMapper;

    @Override
    public List<DbOneTable> selectAll() {
        return mDbOneTableMapper.selectAll();
    }

}