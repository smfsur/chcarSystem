package com.jike.car.api.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @program: car
 * @description:
 * @author: spcdle
 * @create: 2020-05-10 14:01
 **/
@Data
@Accessors(chain = true)
public class Inventory {
    private int id;
    private int carId;
    private int count;
   private Date lastUpdate;


}
