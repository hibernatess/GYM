package com.gym.ssm.sql;

import com.gym.ssm.entity.Curriculum;

import org.apache.ibatis.jdbc.SQL;
import org.springframework.util.StringUtils;

import java.util.Map;
import java.util.Set;

/**
 * @program: GYM
 * @description:
 * @author: hw
 * @create: 2019-02-26 08:55
 **/
/*
3.2
 */
public class SqlCurriculum {
    public String selectCurriculum(Curriculum curriculum){
        String s = new SQL() {
            {
                SELECT(" cu.cid,cu.cattend,cu.cname,c.jname,c.jid,cu.cprice,cu.sid ");
                //表名
                FROM(" coach c");
                INNER_JOIN(" curriculum cu on c.jid=cu.jid  ");
                if(!StringUtils.isEmpty(curriculum.getCname())){
                    WHERE(" cu.cname "+" like '%"+curriculum.getCname()+"%' ");
                }
            }

        }.toString();
        return  s ;
    }


}
