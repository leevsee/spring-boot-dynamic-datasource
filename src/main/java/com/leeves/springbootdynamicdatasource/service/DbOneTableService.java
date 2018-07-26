package com.leeves.springbootdynamicdatasource.service;


import com.leeves.springbootdynamicdatasource.entity.DbOneTable;

import java.util.List;

/**
 * Description:
 * Package: com.apedad.example.service
 *
 * @author Leeves
 * @version 1.0.0  2018-07-14
 */

public interface DbOneTableService {

    List<DbOneTable> selectAll();
}
