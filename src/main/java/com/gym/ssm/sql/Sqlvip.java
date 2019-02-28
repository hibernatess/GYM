package com.gym.ssm.sql;

import com.gym.ssm.entity.Coach;
import com.gym.ssm.entity.vip;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.util.StringUtils;

public class Sqlvip {
    public String uploadimg(vip vip){
        String sql = new SQL() {
            {
                UPDATE("vip" );
                SET("img='"+vip.getImg()+"'");
                WHERE ("hid="+vip.getHid()+"");
            }
        }.toString();
        return  sql ;
    }


    public String update(vip vip){
        String sql = new SQL() {
            {
                UPDATE("vip" );
                SET("hpwd='"+vip.getHpwd()+"',hphone='"+vip.getHphone()+"',hsex='"+vip.getHsex()+"',hage="+vip.getHage()+",haddress='"+vip.getHaddress()+"',remark='"+vip.getRemark()+"'");
                WHERE ("hid="+vip.getHid()+"");
            }
        }.toString();
        return  sql ;
    }
    public String listcum(vip vip){
        String sql = new SQL() {
            {
                SELECT ("v.hname,cm.cname,cm.cattend,cm.cprice,ch.jname");
                FROM("vipcum vm,vip v,curriculum cm,coach ch");
                WHERE ("v.hid=vm.hid and vm.cid=cm.cid and ch.jid=vm.jid and v.hid="+vip.getHid()+"");
            }
        }.toString();
        return  sql ;
    }
}
