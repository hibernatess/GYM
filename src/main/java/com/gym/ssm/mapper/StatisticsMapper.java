package com.gym.ssm.mapper;

import com.gym.ssm.entity.Curriculum;
import com.gym.ssm.entity.Vip;
import com.gym.ssm.sql.SqlCurriculum;
import com.gym.ssm.sql.SqlStatistics;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface StatisticsMapper {
    @SelectProvider(type = SqlStatistics.class,method = "selectStatistics")
    public List<Map> liststa(Vip vip);

    @SelectProvider(type = SqlStatistics.class,method = "selectInfoStatistics")
    public List<Map> listStaInfo(Vip vip);

    @SelectProvider(type = SqlStatistics.class,method = "selectGraph")
    public List<Map<String,Object>> listGraph();
}
