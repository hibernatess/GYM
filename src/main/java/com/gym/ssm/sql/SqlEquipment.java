package com.gym.ssm.sql;

import com.gym.ssm.entity.Dictionaries;
import com.gym.ssm.entity.Equipment;
import org.springframework.util.StringUtils;

/**
 * @ClassName SqlDictionaries
 * @Author ywj
 * @Describe
 * @Date 2019/2/26 0026 19:10
 */
/*
3.2
 */
public class SqlEquipment {
    /**
     * @Description: 查询基础数据的语句
     * @Param: [Equipment]
     * @return: java.lang.String
     * @Author: xxs
     * @Date: 2019/2/26 0026
     */
    public String SelectEquipment(Equipment equipment) {

        StringBuffer sb = new StringBuffer();
        sb.append("SELECT  qid,qname,sid,qprice,qdamage,qsum  FROM equipment where true");
        if (!StringUtils.isEmpty(equipment.getQname())) {
            sb.append(" and qname ='" + equipment.getQname() + "'");
        }

        return sb.toString();
    }


}
