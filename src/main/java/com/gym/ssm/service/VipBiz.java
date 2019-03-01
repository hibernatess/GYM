package com.gym.ssm.service;

import com.gym.ssm.entity.vip;

import java.util.List;
import java.util.Map;

/**
 * 修改3.1
 */
public interface VipBiz {
    /**
     * 展示个人会员信息
     * @param hid
     * @return
     */
    public vip vipselectbyhid(Integer hid);
    /**
     * 修改头像
     * @param vip
     * @return
     */
    public int uploadimg(vip vip);

    /**
     * 修改会员个人信息
     * @param vip
     * @return
     */
    public int update(vip vip);

    /**
     * 查询课程
     * @param vip
     * @return
     */
    public List<Map> listcum(vip vip);
}