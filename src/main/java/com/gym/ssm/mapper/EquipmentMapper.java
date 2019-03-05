package com.gym.ssm.mapper;

import com.gym.ssm.entity.Dictionaries;
import com.gym.ssm.entity.Equipment;
import com.gym.ssm.sql.SqlEquipment;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
@Repository
public interface EquipmentMapper extends Mapper<Equipment> {
    @SelectProvider(type = SqlEquipment.class,method = "SelectEquipment")
    public List<Equipment> SelectEquipment(Equipment equipment);

}