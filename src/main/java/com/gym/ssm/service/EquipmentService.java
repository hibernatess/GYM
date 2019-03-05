package com.gym.ssm.service;

import com.gym.ssm.entity.Curriculum;
import com.gym.ssm.entity.Equipment;

import java.util.List;
import java.util.Map;

/**
 * @author小强
 * @site www.xiaomage.com
 * @company xxx公司
 * @create  2019-03-04 15:47
 */
public interface EquipmentService {

    /**
     * @Description:添加器材
     * @Param: [Equipment]
     * @return: int
     * @Author: xxs
     * @Date: 2019/2/25
     */
    public int PostEquipment(Equipment equipment);
    /**
     * @Description:删除器材
     * @Param: [Equipment]
     * @return: int
     * @Author: xxs
     * @Date: 2019/2/25
     */
    public int DleteEquipment(Equipment equipment);
    /**
     * @Description:修改器材
     * @Param: [curriculum]
     * @return: int
     * @Author: xxs
     * @Date: 2019/2/25
     */
    public int PutEquipment(Equipment equipment);
    /**
     * @Description:查询器材
     * @Param: [Equipment]
     * @return: list
     * @Author: xxs
     * @Date: 2019/2/25
     */
    public List<Equipment> GetEquipment(Equipment equipment);

}
