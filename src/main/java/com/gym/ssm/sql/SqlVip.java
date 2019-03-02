package com.gym.ssm.sql;

import com.gym.ssm.entity.Vip;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.util.StringUtils;

public class SqlVip {
    public String uploadimg(Vip vip){
        String sql = new SQL() {
            {
                UPDATE("vip" );
                SET("img='"+vip.getImg()+"'");
                WHERE ("hid="+vip.getHid()+"");
            }
        }.toString();
        return  sql ;
    }


    public String update(Vip vip){
        String sql = new SQL() {
            {
                UPDATE("vip" );
                SET("hpwd='"+vip.getHpwd()+"',hphone='"+vip.getHphone()+"',hsex='"+vip.getHsex()+"',hage="+vip.getHage()+",haddress='"+vip.getHaddress()+"',remark='"+vip.getRemark()+"'");
                WHERE ("hid="+vip.getHid()+"");
            }
        }.toString();
        return  sql ;
    }
    public String listcum(Vip vip){
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
