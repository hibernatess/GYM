package com.gym.ssm.mapper;

import com.gym.ssm.entity.Damage;
import com.gym.ssm.entity.Equipment;
import com.gym.ssm.sql.SqlDamage;
import com.gym.ssm.sql.SqlEquipment;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface DamageMapper extends Mapper<Damage> {
    @SelectProvider(type = SqlDamage.class,method = "SelectDamage")
    public List<Damage> SelectDamage(Damage damage);
}