package com.leeves.springbootdynamicdatasource.dao;



import com.leeves.springbootdynamicdatasource.entity.DbOneTable;

import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface DbOneTableMapper {

    @Select("select * from db_one_table")
    List<DbOneTable> selectAll();

}
