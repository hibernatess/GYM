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
//        System.out.println(v);
    return v;
    }


    /**
     * 客户详情的sql
     * @param vip
     * @return
     */
    public String selectInfoStatistics(Vip vip){
        String sql=new SQL(){
            {
                SELECT ("cm.cname,ch.jname,cm.cattend,cm.cprice");
                FROM("vipcum vm,vip v,curriculum cm,coach ch");
                WHERE ("v.hid=vm.hid and vm.cid=cm.cid and ch.jid=vm.jid and v.hname='"+vip.getHname()+"'");
            }
        }.toString();
        return sql;
    }


    /**
     * 统计图的sql
     * @param vip
     * @return
     */
    public String selectGraph(Vip vip){
        String sql=new SQL(){
            {
                SELECT ("c.cname,count(v.hid)'sum',sum(c.cprice)'cprice'");
                FROM("vip v,curriculum c,vipcum vc");
                WHERE ("v.hid=vc.hid and c.cid=vc.cid");
                GROUP_BY("c.cname");
            }
        }.toString();
        return sql;
    }

}
