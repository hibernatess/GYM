package com.gym.ssm.service.Impl;

import com.gym.ssm.entity.Curriculum;
import com.gym.ssm.mapper.SelectcumMapper;
import com.gym.ssm.service.SelectcumBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @authorリバティの風
 * @site
 * @company
 * @create 2019-03-01-18:28
 */
/*
3.2
 */
@Service
public class SelectcumBizImpl implements SelectcumBiz {
    @Autowired
    private SelectcumMapper selectcumMapper;
    /**
     * 查询课程（选课）
     * @param curriculum
     * @return
     */
    @Override
    public List<Map> listcum(Curriculum curriculum) {
        return selectcumMapper.listcum(curriculum);
    }
}
