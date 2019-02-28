package com.gym.ssm.service.Impl;

import com.gym.ssm.entity.vip;
import com.gym.ssm.service.vipBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gym.ssm.mapper.vipMapper;

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


    @Override
    public vip vipselectbyhid(Integer hid) {

        return vipMapper.selectByPrimaryKey(hid);
    }

    @Override
    public int uploadimg(vip vip) {

        return vipMapper.uploadimg(vip);
    }

    @Override
    public int update(vip vip) {

        return vipMapper.update(vip);
    }


}
