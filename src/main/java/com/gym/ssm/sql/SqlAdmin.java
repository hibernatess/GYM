package com.gym.ssm.sql;

import com.gym.ssm.entity.peng.Admin;
import com.gym.ssm.entity.peng.Coach;
import com.gym.ssm.entity.vip;
import org.apache.ibatis.jdbc.SQL;

/**
 * @ProjectNmae:GYM03
 * @ClassName:sqlAdmin
 * @Description: TOOO
 * @Author:peng
 * @Date:2019/2/26 18:30
 * @Version:1.0
 */
public class SqlAdmin {


    public String selectAdmin(Admin admin) {
        String s = new SQL() {
            {
                SELECT(" aid,aname,apword,amid");
                //表名
                FROM(" admin ");
                WHERE(" aname='" + admin.getAname() + "' and  apword='" + admin.getApword() + "'");
            }
        }.toString();
        return s;
    }

    public String selectLogin1(vip vip) {
        String s = new SQL() {
            {
                SELECT(" hname,hpwd,jurid");
                //表名
                FROM(" vip ");
                WHERE(" hname='" + vip.getHname() + "' and  hpwd='" + vip.getHpwd() + "'");
            }
        }.toString();
        return s;
    }

    /**
     * @ProjectNmae:GYM03
     * @ClassName:sqlCoach
     * @Description: TOOO
     * @Author:peng
     * @Date:2019/2/26 19:00
     * @Version:1.0
     */
    public String selectCoach1(Coach coach) {
        String s = new SQL() {
            {
                SELECT(" jname,jpwd,jurid ");
                //表名
                FROM(" coach ");
                WHERE(" jname='" + coach.getJname() + "' and  jpwd='" + coach.getJpwd() + "'");
            }
        }.toString();
        System.out.println(s);
        return s;
    }
}
