package com.jike.car.api.service.impl;

import com.jike.car.api.service.InventoryService;
import com.jike.car.api.dao.InventoryDao;
import com.jike.car.api.pojo.Inventory;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * @program: car
 * @description:
 * @author: spcdle
 * @create: 2020-05-10 14:56
 **/
@Service
public class InventoryServiceImpl implements InventoryService {
    @Resource
    InventoryDao inventoryDao;

    @Override
    public String buyCar(int carId) {
        String result;
        List<Inventory> list = inventoryDao.findByCarId(carId);
        if (list.size() > 0) {
            if (list.get(0).getCount() > 0) {
                Inventory inventory = new Inventory()
                        .setCount(list.get(0).getCount() - 1)
                        .setId(list.get(0).getId())
                        .setCarId(list.get(0).getCarId())
                        .setLastUpdate(list.get(0).getLastUpdate());
                if (inventoryDao.updateById(inventory) > 0) {
                    result = "购车成功！";

                } else {

                    result = "系统繁忙请重试！";
                }

            } else {
                result = "此车已售完！";
            }
        } else {
            result = "查不到此车！";
        }
        return result;
    }


}
