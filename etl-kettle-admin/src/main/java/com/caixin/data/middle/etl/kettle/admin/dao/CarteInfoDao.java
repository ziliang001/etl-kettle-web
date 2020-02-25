/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: CarteInfoDao
 * Author:   zhuzj29042
 * Date:     2020/2/11 21:57::01
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.dao;

import com.caixin.data.middle.etl.kettle.admin.entity.CarteInfoEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/11 21:57:01
 * @since 1.0.0
 */
@Mapper
//@Repository
public interface CarteInfoDao {
    public void insertCarteInfo(CarteInfoEntity carteInfo);

    public List<CarteInfoEntity> getAllSlaveQuato(String minDate, String maxDate);

    public List<CarteInfoEntity> getSlaveQuatoBySlaveId(String minDate, String maxDate, Integer slaveId);

    public List<CarteInfoEntity> slaveQuatoByAvg(String minDate, String maxDate, Integer slaveId);

    public List<CarteInfoEntity> slaveQuatoByMax(String minDate, String maxDate, Integer slaveId);
}