package com.leeves.springbootdynamicdatasource.dao;



import com.leeves.springbootdynamicdatasource.entity.DbOneTable;

import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Leeves
 * @since 2018-07-04
 */
public interface DbOneTableMapper {

    @Select("select * from db_one_table")
    List<DbOneTable> selectAll();

}
