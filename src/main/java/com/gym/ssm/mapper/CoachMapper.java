package com.gym.ssm.mapper;

import com.gym.ssm.entity.Curriculum;
import com.gym.ssm.entity.peng.Admin;
import com.gym.ssm.entity.peng.Coach;
import com.gym.ssm.sql.SqlCoach;
import com.gym.ssm.sql.SqlCurriculum;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

@Repository
public interface CoachMapper extends Mapper<Coach> {
    @SelectProvider(type = SqlCoach.class, method = "selectCoach")
    public Coach getCoachLogin(Coach coach);
}