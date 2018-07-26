package com.leeves.springbootdynamicdatasource.dao;



import com.leeves.springbootdynamicdatasource.annotation.DS;
import com.leeves.springbootdynamicdatasource.comm.DataSourceType;
import com.leeves.springbootdynamicdatasource.entity.DbTwoTable;

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
public interface DbTwoTableMapper {

//    @DS(dtaSourceType = DataSourceType.DB_SLAVE1)
    @Select("select * from db_two_table")
    List<DbTwoTable> selectAll();
}
