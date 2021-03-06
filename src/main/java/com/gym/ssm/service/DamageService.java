package com.gym.ssm.service;

import com.gym.ssm.entity.Damage;
import com.gym.ssm.entity.Equipment;

import java.util.List;
import java.util.Map;

/**
 * @author小强
 * @site www.xiaomage.com
 * @company xxx公司
 * @create  2019-03-05 14:02
 */
public interface DamageService {
    /**
     * @Description:添加器材
     * @Param: [Equipment]
     * @return: int
     * @Author: xxs
     * @Date: 2019/2/25
     */
    public int PostDamage(Damage damage);
    /**
     * @Description:删除器材
     * @Param: [Equipment]
     * @return: int
     * @Author: xxs
     * @Date: 2019/2/25
     */
    public int DleteDamage(Damage damage);
    /**
     * @Description:修改器材
     * @Param: [curriculum]
     * @return: int
     * @Author: xxs
     * @Date: 2019/2/25
     */
    public int PutDamage(Damage damage);
    /**
     * @Description:查询器材
     * @Param: [Equipment]
     * @return: list
     * @Author: xxs
     * @Date: 2019/2/25
     */
    public List<Map<String,Object>> GetDamage(Damage damage);


    public List<Equipment> SelectQname();



}
