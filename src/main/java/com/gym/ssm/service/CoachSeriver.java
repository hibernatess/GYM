package com.gym.ssm.service;

import com.gym.ssm.entity.Coach;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
import java.util.Map;

public interface CoachSeriver {

    /**
     * 查询全部教练
     */
    public List<Coach> listCoach(Example example);

    /**
     * 删除单个教练
     */
    public int deleteCoach(Integer id);

    /**
     * 查询单个教练
     * @param id
     */
    public Coach getCoach(Integer id);


    /**
     * 添加教练
     * @param coach
     */
    public int addCoach(Coach coach);

    /**
     * 修改教练信息
     * @param coach
     */
    public int updateCoach(Coach coach);

    /**
     * 连表查询教练表
     * @param coach
     */
    List<Map<String,Object>>  listCoach(Coach coach);

}
