package com.gym.ssm.service.Impl;

import com.gym.ssm.entity.vip;
import com.gym.ssm.service.vipBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gym.ssm.mapper.vipMapper;

import java.util.List;
import java.util.Map;

/**
 * @authorリバティの風
 * @site
 * @company
 * @create 2019-02-26-21:16
 */
@Service
public class vipBizimpl implements vipBiz {
    @Autowired
    private vipMapper vipMapper;

    /**
     * 会员个人信息
     * @param hid
     * @return
     */
    @Override
    public vip vipselectbyhid(Integer hid) {

        return vipMapper.selectByPrimaryKey(hid);
    }

    /**
     * 修改头像
     * @param vip
     * @return
     */
    @Override
    public String uploadimg(vip vip) {

        return vipMapper.uploadimg(vip);
    }

    /**
     * 修改个人信息
     * @param vip
     * @return
     */
    @Override
    public int update(vip vip) {

        return vipMapper.update(vip);
    }

    /**
     * 课程集合
     * @param vip
     * @return
     */
    @Override
    public List<Map> listcum(vip vip) {

        return vipMapper.listcum(vip);
    }



}
