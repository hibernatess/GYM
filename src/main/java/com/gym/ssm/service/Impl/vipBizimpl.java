package com.gym.ssm.service.Impl;

import com.gym.ssm.entity.vip;
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
@Service
public class vipBizimpl implements VipBiz {
    @Autowired
    private VipMapper VipMapper;

    /**
     * 会员个人信息
     * @param hid
     * @return
     */
    @Override
    public vip vipselectbyhid(Integer hid) {

        return VipMapper.selectByPrimaryKey(hid);
    }

    /**
     * 修改头像
     * @param vip
     * @return
     */
    @Override
    public int uploadimg(vip vip) {

        return VipMapper.uploadimg(vip);
    }

    /**
     * 修改个人信息
     * @param vip
     * @return
     */
    @Override
    public int update(vip vip) {

        return VipMapper.update(vip);
    }

    /**
     * 课程集合
     * @param vip
     * @return
     */
    @Override
    public List<Map> listcum(vip vip) {

        return VipMapper.listcum(vip);
    }



}
