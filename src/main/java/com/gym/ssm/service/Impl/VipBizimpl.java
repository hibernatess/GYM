package com.gym.ssm.service.Impl;

import com.gym.ssm.entity.Vip;
import com.gym.ssm.service.VipBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gym.ssm.mapper.VipMapper;

import java.util.List;
import java.util.Map;

/**
 * @authorリバティの風
 * @site
 * @company
 * @create 2019-02-26-21:16
 * 修改3.1
 */
/*
3.2
 */
@Service
public class VipBizimpl implements VipBiz {
    @Autowired
    private VipMapper VipMapper;

    /**
     * 会员个人信息
     * @param hid
     * @return
     */
    @Override
    public Vip vipselectbyhid(Integer hid) {

        return VipMapper.selectByPrimaryKey(hid);
    }

    /**
     * 修改头像
     * @param Vip
     * @return
     */
    @Override
    public int uploadimg(Vip Vip) {

        return VipMapper.uploadimg(Vip);
    }

    /**
     * 修改个人信息
     * @param Vip
     * @return
     */
    @Override
    public int update(Vip Vip) {

        return VipMapper.update(Vip);
    }

    /**
     * 课程集合
     * @param Vip
     * @return
     */
    @Override
    public List<Map> listcum(Vip Vip) {

        return VipMapper.listcum(Vip);
    }



}
