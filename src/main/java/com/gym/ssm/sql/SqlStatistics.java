package com.gym.ssm.sql;

import com.gym.ssm.entity.Vip;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.util.StringUtils;

/**
 * 季度报表的sql类
 */
public class SqlStatistics {
    public String selectStatistics(Vip vip){
        String v=new SQL(){
            {
                SELECT(" v.hname,d.svalues,SUM(cm.cprice) cprice ");
                FROM(" vip v");
                INNER_JOIN(" vipcum vm ON v.hid=vm.hid  ");
                INNER_JOIN(" curriculum cm ON vm.cid=cm.cid  ");
                INNER_JOIN(" dictionaries d ON v.sid=d.sid  ");
                if(!StringUtils.isEmpty(vip.getHname())){
                    WHERE(" v.hname "+" like '%"+vip.getHname()+"%'");
                }
                GROUP_BY(" v.hid ");
            }
        }.toString();
    return v;
    }
}
