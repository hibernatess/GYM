package com.gym.ssm.mapper;

import com.gym.ssm.sql.SqlCurriculum;
import com.gym.ssm.entity.Curriculum;

import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import tk.mybatis.mapper.common.Mapper;

/**
 * @program: GYM
 * @description:
 * @author: hw
 * @create: 2019-02-25 20:03
 **//*
3.2
 */
@Repository
public interface CurriculumMapper extends Mapper<Curriculum> {
    /**
     * @Description:查询课程
     * @Param: [curriculum]
     * @return: java.util.List<com.gym.ssm.entity.Curriculum>
     * @Author: hw
     * @Date: 2019/2/26
     */
    @SelectProvider(type = SqlCurriculum.class, method = "selectCurriculum")
    public List<Map<String,Object>> GetCurriculum(Curriculum curriculum);
}
