package com.gym.ssm.sql;

import com.gym.ssm.entity.Damage;
import com.gym.ssm.entity.Dictionaries;
import org.springframework.util.StringUtils;

/**
 * @author小强
 * @site www.xiaomage.com
 * @company xxx公司
 * @create  2019-03-05 14:25
 */
public class SqlDamage {

    public String SelectDamage(Damage d) {

        StringBuffer sb = new StringBuffer();
        sb.append("SELECT a.qhid,qname,a.qhprice,a.qhremark from damage a ,equipment b  where a.qid=b.qid ");
        return sb.toString();
    }

    /**
     * 查询器材名和获取器材id
     * @return
     */
    public  String SelectQname(){
       StringBuffer sb=new StringBuffer();
       sb.append("SELECT qid,qname FROM equipment");
        return sb.toString();
    }


    public String AddDamage(Damage d) {
        StringBuffer sb = new StringBuffer();
        sb.append("INSERT INTO damage ( qid,qhprice,qhremark ) VALUES( ?,?,? ) ");
        return sb.toString();
    }

    public String UpdateDamage(Damage d) {
        StringBuffer sb = new StringBuffer();
        sb.append("UPDATE damage SET qid = ?,qhprice = ?,qhremark = ? WHERE qhid = ?  ");
        return sb.toString();
    }



}
