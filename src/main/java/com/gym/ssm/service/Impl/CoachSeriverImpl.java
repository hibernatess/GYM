package com.gym.ssm.service.Impl;

import com.gym.ssm.entity.Coach;
import com.gym.ssm.mapper.CoachMapper;
import com.gym.ssm.service.CoachSeriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
import java.util.Map;
/*
3.2
 */
@Service
public class CoachSeriverImpl implements CoachSeriver {

    @Autowired
    private CoachMapper coachMapper;

    @Override
    public List<Coach> listCoach(Example example) {
       return coachMapper.selectByExample(example);
    }

    @Override
    public int deleteCoach(Integer id) {
        return coachMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Coach getCoach(Integer id) {
        return coachMapper.selectByPrimaryKey(id);
    }

    @Override
    public int addCoach(Coach coach) {
        return coachMapper.insert(coach);
    }

    @Override
    public int updateCoach(Coach coach) {
        return coachMapper.updateByPrimaryKey(coach);
    }

    @Override
    public List<Map<String, Object>> listCoach(Coach coach) {
        return coachMapper.listCoach(coach);
    }

    @Override
    public List<Map<String, Object>> listCoachAndVip(Coach coach) {
        return coachMapper.listCoachAndVip(coach);
    }

    @Override
    public int updateMiddle(int sta, int id) {
        return coachMapper.updateMiddle(sta,id);
    }


}
