package com.gym.ssm.sql;

import org.apache.ibatis.jdbc.SQL;
import org.springframework.util.StringUtils;
import com.gym.ssm.entity.peng.Admin;
import com.gym.ssm.entity.peng.Coach;
import org.apache.ibatis.jdbc.SQL;

public class SqlCoach {
    public String selectCoach(Coach coach) {
        String s = new SQL() {
            {
                SELECT(" c.jid,c.jname,c.jsex,s.svalues,c.jage,c.jpwd,c.jregister,c.jaddress,c.jflag,c.jimages,c.jurid,r.cname,s.sid,c.cid ");
                //表名
                FROM(" coach c");
                INNER_JOIN(" curriculum r on c.cid=r.cid ");
                INNER_JOIN(" dictionaries s on c.sid=s.sid ");
                if (!StringUtils.isEmpty(coach.getJname())) {
                    WHERE(" c.jname " + " like '%" + coach.getJname() + "%' ");
                }
            }
        }.toString();
        return s;

/**
 * @ProjectNmae:GYM03
 * @ClassName:sqlCoach
 * @Description: TOOO
 * @Author:peng
 * @Date:2019/2/26 19:00
 * @Version:1.0
 */
        public String selectCoach1(Coach coach){
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
}