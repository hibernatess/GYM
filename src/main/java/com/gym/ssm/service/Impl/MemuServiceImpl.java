package com.gym.ssm.service.Impl;

import com.gym.ssm.entity.peng.Memu;
import com.gym.ssm.mapper.MemuMapper;
import com.gym.ssm.service.MemuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectNmae:GYM03
 * @ClassName:MemuServiceImpl
 * @Description: TOOO
 * @Author:peng
 * @Date:2019/2/26 20:56
 * @Version:1.0
 */
@Service
public class MemuServiceImpl implements MemuService {
    @Autowired
    MemuMapper memuMapper;

    /**
     * @return java.util.List<com.gym.ssm.entity.peng.TreeNode>
     * @Author peng
     * @Description 获取所有的父菜单
     * @Date 21:17 2019/2/26
     * @Param [mid]
     **/
    @Override
    public List<Memu> getmemu(String mid) {

        return memuMapper.getTreeNode(mid);
    }

    @Override
    public List<Memu> getTreeZNode(String mid) {
        return memuMapper.getTreeZNode(mid);
    }


}
