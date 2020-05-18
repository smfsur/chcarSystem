package com.jike.car.api.testclass;

import com.jike.car.api.dao.InventoryDao;
import com.jike.car.api.pojo.Inventory;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: car
 * @description:
 * @author: spcdle
 * @create: 2020-05-10 14:34
 **/
@RunWith(SpringRunner.class)
@SpringBootTest()
public class InventoryDaoTest {
    @Resource
    InventoryDao inventoryDao;
    @Test
    public void selectTest(){
       List<Inventory> list= inventoryDao.findAll();
        Assertions.assertEquals(6,list.get(5).getCarId());

    }
}
