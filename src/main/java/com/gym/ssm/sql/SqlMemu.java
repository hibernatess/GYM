package com.gym.ssm.sql;

import com.gym.ssm.entity.peng.Admin;
import com.gym.ssm.entity.peng.Memu;
import org.apache.ibatis.jdbc.SQL;

/**
 * @ProjectNmae:GYM03
 * @ClassName:SqlMemu
 * @Description: TOOO
 * @Author:peng
 * @Date:2019/2/26 21:00
 * @Version:1.0
 */
public class SqlMemu {

    public String selectmume(String mid) {
        String s = new SQL() {
            {
                SELECT(" id,oldid,name,url");
                //表名
                FROM(" memu ");
                WHERE("     id in (" + mid + ") ");
            }
        }.toString();
        return s;
    }

    public String selectmume1(String mid) {
        String s = new SQL() {
            {
                SELECT(" id,oldid,name,url");
                //表名
                FROM(" memu ");
                WHERE("   oldid in (" + mid + ")  ");
            }
        }.toString();
        return s;
    }
}
