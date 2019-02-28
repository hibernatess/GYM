package com.gym.ssm.sql;

import com.gym.ssm.entity.Curriculum;
import com.gym.ssm.entity.peng.Admin;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.util.StringUtils;

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
                WHERE(" aname='"+ admin.getAname() + "' and  apword='" + admin.getApword() + "'");
            }
        }.toString();
        return s;
    }
}
