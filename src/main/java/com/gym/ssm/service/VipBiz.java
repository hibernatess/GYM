package com.gym.ssm.service;

import com.gym.ssm.entity.Vip;

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
    public Vip vipselectbyhid(Integer hid);
    /**
     * 修改头像
     * @param Vip
     * @return
     */
    public int uploadimg(Vip Vip);

    /**
     * 修改会员个人信息
     * @param Vip
     * @return
     */
    public int update(Vip Vip);

    /**
     * 查询课程
     * @param Vip
     * @return
     */
    public List<Map> listcum(Vip Vip);
}