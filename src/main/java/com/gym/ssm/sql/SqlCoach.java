package com.gym.ssm.sql;

import org.apache.ibatis.jdbc.SQL;
import org.springframework.util.StringUtils;
import com.gym.ssm.entity.Coach;

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
    }




}
