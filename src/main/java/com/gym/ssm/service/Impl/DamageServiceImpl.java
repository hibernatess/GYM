package com.gym.ssm.service.Impl;

import com.gym.ssm.entity.Damage;
import com.gym.ssm.entity.Equipment;
import com.gym.ssm.mapper.DamageMapper;
import com.gym.ssm.service.DamageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author小强
 * @site www.xiaomage.com
 * @company xxx公司
 * @create  2019-03-05 14:04
 */
@Service
public class DamageServiceImpl implements DamageService {
    @Autowired
    DamageMapper DMapper;

    @Override
    public int PostDamage(Damage damage) {
        return DMapper.PostDamage(damage);
    }

    @Override
    public int DleteDamage(Damage damage) {
        return DMapper.delete(damage);
    }

    @Override
    public int PutDamage(Damage damage) {
        return DMapper.PutDamage(damage);
    }

    @Override
    public List<Damage> GetDamage(Damage damage) {
        return DMapper.SelectDamage(damage);
    }

    @Override
    public List<Equipment> SelectQname() {
        return DMapper.SelectQname();
    }
}
