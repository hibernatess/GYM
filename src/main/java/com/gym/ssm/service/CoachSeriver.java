package com.gym.ssm.service;

import com.gym.ssm.entity.Coach;
import com.gym.ssm.sql.SqlCoach;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
import java.util.Map;
/*
3.2
 */
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


    /**
     * 教练登陆查看他的课程  是否预约表
     * @param coach
     * @return
     */
    List<Map<String,Object>> listCoachAndVip(Coach coach);

    /**
     * 修改教练和会员中间表的状态
     * @author      hhh
     * @return
     * @exception
     * @date        2019/3/1 20:14
     */
    int updateMiddle(int sta, int id);

}
