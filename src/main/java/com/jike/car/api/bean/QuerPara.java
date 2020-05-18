package com.jike.car.api.bean;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @program: car
 * @description:
 * @author: spcdle
 * @create: 2020-05-10 20:54
 **/
@Data
@Accessors(chain = true)
public class QuerPara {
    int pageNum;
    int pageSize;
    String carName;
}
