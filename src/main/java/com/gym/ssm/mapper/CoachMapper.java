package com.gym.ssm.mapper;

import com.gym.ssm.entity.Coach;
import com.gym.ssm.sql.SqlCoach;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

@Repository
public interface CoachMapper extends Mapper<Coach> {

    /**
     * 连表查询教练表
     * @param coach
     */
    @SelectProvider(type = SqlCoach.class,method = "selectCoach")
    List<Map<String,Object>>  listCoach(Coach coach);
}