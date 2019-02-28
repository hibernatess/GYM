package com.gym.ssm.mapper;

import com.gym.ssm.entity.peng.Admin;
import com.gym.ssm.entity.peng.Vip;
import com.gym.ssm.sql.SqlAdmin;
import com.gym.ssm.sql.SqlVip;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface VipMapper extends Mapper<Vip> {

    @SelectProvider(type = SqlVip.class, method = "selectVip")
    Vip adminLogin(Vip vip);

}