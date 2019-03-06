package com.gym.ssm.service.Impl;

import com.gym.ssm.entity.Equipment;
import com.gym.ssm.mapper.EquipmentMapper;
import com.gym.ssm.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author小强
 * @site www.xiaomage.com
 * @company xxx公司
 * @create  2019-03-04 15:52
 */
@Service
public class EquipmentServiceImpl implements EquipmentService {
    @Autowired
    EquipmentMapper equipmentMapper;

    @Override
    public int PostEquipment(Equipment equipment) {
        return equipmentMapper.insert(equipment);
    }

    @Override
    public int DleteEquipment(Equipment equipment) {
        return equipmentMapper.delete(equipment);
    }


    @Override
    public int PutEquipment(Equipment equipment) {
        return equipmentMapper.updateByPrimaryKey(equipment);
    }

    @Override
    public List<Equipment> GetEquipment(Equipment equipment) {
        return equipmentMapper.SelectEquipment(equipment);
    }
}
