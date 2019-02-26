package com.gym.ssm.sql;

import com.gym.ssm.entity.Dictionaries;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.util.StringUtils;

/**
 * @ClassName SqlDictionaries
 * @Author ywj
 * @Describe
 * @Date 2019/2/26 0026 19:10
 */
public class SqlDictionaries {
    /**
     * @Description: 查询基础数据的语句
     * @Param: [dictionaries]
     * @return: java.lang.String
     * @Author: ywj
     * @Date: 2019/2/26 0026
     */
    public String SelectDictionaries(Dictionaries dictionaries) {

        StringBuffer sb = new StringBuffer();
        sb.append("SELECT  sid,sname,stpye,svalues,sflag  FROM dictionaries where true");
        if (!StringUtils.isEmpty(dictionaries.getSname())) {
            sb.append(" and sname ='" + dictionaries.getSname() + "'");
        }
        if (!StringUtils.isEmpty(dictionaries.getSvalues())) {
            sb.append(" and svalues like  '%" + dictionaries.getSvalues() + "%'");
        }

        return sb.toString();
    }


}
