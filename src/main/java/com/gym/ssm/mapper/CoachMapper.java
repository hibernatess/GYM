package com.gym.ssm.mapper;

import com.gym.ssm.entity.Coach;
import com.gym.ssm.sql.SqlCoach;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;
/*
3.2
 */
@Repository
public interface CoachMapper extends Mapper<Coach> {

    /**
     * 连表查询教练表
     *
     * @param coach
     */
    @SelectProvider(type = SqlCoach.class, method = "selectCoach")
    List<Map<String, Object>> listCoach(Coach coach);


    /**
     * 教练登陆查看他的课程  是否预约表
     * @param coach
     * @return
     */
    @SelectProvider(type = SqlCoach.class,method = "listCoachAndVip")
    List<Map<String,Object>> listCoachAndVip(Coach coach);

    /**
     * 修改教练和会员中间表的状态
     * @author      hhh
     * @return
     * @exception
     * @date        2019/3/1 20:14
     */
    @UpdateProvider(type = SqlCoach.class,method = "updateMiddle")
    int updateMiddle(int sta, int id);

}