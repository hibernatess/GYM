package com.gym.ssm.mapper;

import com.gym.ssm.entity.Curriculum;
import com.gym.ssm.sql.SqlCurriculum;
import com.gym.ssm.sql.SqlVip;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @authorリバティの風
 * @site
 * @company
 * @create 2019-03-01-18:26
 *//*
3.2
 */
@Repository
public interface SelectcumMapper {
    @SelectProvider(type = SqlCurriculum.class,method = "selectCurriculum")
    public List<Map> listcum(Curriculum curriculum);
}
