package com.leeves.springbootdynamicdatasource;

import com.leeves.springbootdynamicdatasource.service.DbOneTableService;
import com.leeves.springbootdynamicdatasource.service.DbTwoTableService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDynamicDatasourceApplicationTests {

    @Autowired
    private DbOneTableService mDbOneTableService;

    @Autowired
    private DbTwoTableService mDbTwoTableService;

    @Test
    public void test() {
        System.out.println("mDbOneTableService:"+mDbOneTableService.selectAll());
        System.out.println("mDbTwoTableService:"+mDbTwoTableService.queryAll());
    }

}
