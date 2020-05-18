package com.jike.car.api.testclass;

import com.jike.car.api.dao.CarDao;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @program: car
 * @description:
 * @author: spcdle
 * @create: 2020-05-10 12:25
 **/
@RunWith(SpringRunner.class)
@SpringBootTest()
public class CarDaoTest {
    @Resource
    CarDao carDao ;

    @Test
    public  void myTest(){
        Assertions.assertEquals("奥迪",carDao.findById(2).getCarName());

    }
}
