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
        sb.append("SELECT a.qhid,b.qname,a.qhprice,a.qhremark from damage a ,equipment b  where a.qid=b.qid ");

        return sb.toString();
    }

}
