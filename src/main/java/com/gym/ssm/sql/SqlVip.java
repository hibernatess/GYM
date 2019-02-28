package com.gym.ssm.sql;

import com.gym.ssm.entity.peng.Admin;
import com.gym.ssm.entity.peng.Vip;
import org.apache.ibatis.jdbc.SQL;

/**
 * @ProjectNmae:GYM03
 * @ClassName:SqlVip
 * @Description: TOOO
 * @Author:peng
 * @Date:2019/2/26 19:03
 * @Version:1.0
 */
public class SqlVip {

    public String selectVip(Vip vip) {
        String s = new SQL() {
            {
                SELECT("  hname,hpwd,jurid");
                //表名
                FROM(" vip ");
                WHERE(" hname='" + vip.getHname() + "' and  hpwd='" + vip.getHpwd() + "'");
            }
        }.toString();
        return s;
    }


}
