package com.gym.ssm.service;

import com.gym.ssm.entity.Curriculum;
import com.gym.ssm.mapper.CurriculumMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @program: GYM
 * @description:
 * @author: hw
 * @create: 2019-02-25 20:24
 **//*
3.2
 */
public interface CurriculumBiz {
    /**
     * @Description:添加课程
     * @Param: [curriculum]
     * @return: int
     * @Author: hw
     * @Date: 2019/2/25
     */
    public int PostCurriculum(Curriculum curriculum);
    /**
     * @Description:删除课程
     * @Param: [curriculum]
     * @return: int
     * @Author: hw
     * @Date: 2019/2/25
     */
    public int DleteCurriculum(int id);
    /**
     * @Description:修改课程
     * @Param: [curriculum]
     * @return: int
     * @Author: hw
     * @Date: 2019/2/25
     */
    public int PutCurriculum(Curriculum curriculum);
    /**
     * @Description:查询课程
     * @Param: [curriculum]
     * @return: int
     * @Author: hw
     * @Date: 2019/2/25
     */
    public List<Map<String,Object>> GetCurriculum(Curriculum curriculum);
}
