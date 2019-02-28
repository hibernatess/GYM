package com.gym.ssm.service.Impl;

import com.gym.ssm.entity.Curriculum;
import com.gym.ssm.mapper.CurriculumMapper;
import com.gym.ssm.service.CurriculumBiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @program: GYM
 * @description:课程service具体实现
 * @author: hw
 * @create: 2019-02-25 20:32
 **/
@Service
public class CurriculumBizImpl implements CurriculumBiz {
    /**
     * mapper接口
     */
    @Autowired
    CurriculumMapper curriculumMapper;

    /**
     * @Description:添加课程
     * @Param: [curriculum]
     * @return: int
     * @Author: hw
     * @Date: 2019/2/25
     */
    @Override
    public int PostCurriculum(Curriculum curriculum) {
        return curriculumMapper.insert(curriculum);
    }

    /**
     * @Description: 删除课程
     * @Param: [id]
     * @return: int
     * @Author: hw
     * @Date: 2019/2/25
     */
    @Override
    public int DleteCurriculum(int id) {
        return curriculumMapper.deleteByPrimaryKey(id);
    }

    /**
     * @Description: 修改课程
     * @Param: [curriculum]
     * @return: int
     * @Author: hw
     * @Date: 2019/2/25
     */
    @Override
    public int PutCurriculum(Curriculum curriculum) {
        return curriculumMapper.updateByPrimaryKeySelective(curriculum);
    }

    /**
     * @Description: 查询课程
     * @Param: [curriculum]
     * @return: java.util.List<com.gym.ssm.entity.Curriculum>
     * @Author: hw
     * @Date: 2019/2/25
     */
    @Override
    public List<Map<String, Object>> GetCurriculum(Curriculum curriculum) {
        return curriculumMapper.GetCurriculum(curriculum);
    }
}
