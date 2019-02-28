package com.gym.ssm.sql;

import com.gym.ssm.entity.peng.Admin;
import com.gym.ssm.entity.peng.Coach;
import org.apache.ibatis.jdbc.SQL;

/**
 * @ProjectNmae:GYM03
 * @ClassName:sqlCoach
 * @Description: TOOO
 * @Author:peng
 * @Date:2019/2/26 19:00
 * @Version:1.0
 */
public class SqlCoach {
    public String selectCoach(Coach coach) {
        String s = new SQL() {
            {
                SELECT(" jname,jpwd,jurid");
                //表名
                FROM(" coach ");
                WHERE(" jname='" + coach.getJname() + "' and  jpwd='" + coach.getJpwd() + "'");
            }
        }.toString();
        return s;
    }


}
