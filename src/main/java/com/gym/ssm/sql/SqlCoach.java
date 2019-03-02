package com.gym.ssm.sql;

import org.apache.ibatis.jdbc.SQL;
import org.springframework.util.StringUtils;
import com.gym.ssm.entity.Coach;

public class SqlCoach {

    /**
    * 查询教练表
    * @author      hhh
    * @return
    * @exception
    * @date        2019/3/1 9:51
    */
    /*
3.2
 */
    public String selectCoach(Coach coach) {
        String s = new SQL() {
            {
                SELECT(" c.jid,c.jname,c.jsex,s.svalues,c.jage,c.jpwd,c.jregister,c.jaddress,c.jimages,c.jurid,r.cname,s.sid,c.cid ");
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


    /**
    * 连表查询预约教练的会员
    * @author      hhh
    * @return
    * @exception
    * @date        2019/3/1 9:50
    */
    public String listCoachAndVip(Coach coach){
        StringBuffer sb=new StringBuffer();
        sb.append(" select c.jid,m.mid,v.realname,v.hsex,v.hage,d.svalues,m.reservedata from coach c ");
        sb.append(" inner join middle m on c.jid=m.jid ");
        sb.append(" inner join vip v on m.hid=v.hid ");
        sb.append(" inner join dictionaries d on v.sid=d.sid  where true");
        if(!StringUtils.isEmpty(coach.getJid())){
            sb.append(" and c.jid="+coach.getJid() );
        }
        sb.append(" and m.sta=1 ");
        sb.append(" ORDER BY m.reservedata ");
        return sb.toString();
    }


    /**
    * 修改教练和会员中间表的状态
    * @author      hhh
    * @return
    * @exception
    * @date        2019/3/1 20:13
    */
    public String updateMiddle(int sta,int id){
        StringBuffer sb=new StringBuffer();
        sb.append(" update middle set sta="+sta+" where mid ="+ id);
        return sb.toString();
    }

}
