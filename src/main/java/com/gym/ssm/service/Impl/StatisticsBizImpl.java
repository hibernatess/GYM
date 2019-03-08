package com.gym.ssm.service.Impl;

import com.gym.ssm.entity.Vip;
import com.gym.ssm.mapper.StatisticsMapper;
import com.gym.ssm.service.StatisticsBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class StatisticsBizImpl implements StatisticsBiz {
    @Autowired
    private StatisticsMapper statisticsMapper;

    @Override
    public List<Map> listcum(Vip vip) {
        return statisticsMapper.liststa(vip);
    }

    @Override
    public List<Map> listStaInfo(Vip vip) {
        return statisticsMapper.listStaInfo(vip);
    }

    @Override
    public List<Map<String,Object>> listGraph() {
        return statisticsMapper.listGraph();
    }


}
