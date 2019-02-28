package com.gym.ssm.mapper;

import com.gym.ssm.entity.peng.Admin;
import com.gym.ssm.entity.peng.Coach;
import com.gym.ssm.entity.vip;
import com.gym.ssm.sql.SqlAdmin;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface AdminMapper extends Mapper<Admin> {


    @SelectProvider(type = SqlAdmin.class, method = "selectAdmin")
    Admin adminLogin(Admin admin);

    /**
     * @return com.gym.ssm.entity.Coach
     * @Author peng
     * @Description 教练登录
     * @Date 10:05 2019/2/28
     * @Param [coach]
     **/
    @SelectProvider(type = SqlAdmin.class, method = "selectCoach1")
    Coach getCoachLogin(Coach coach);


    /**
     * @return com.gym.ssm.entity.vip
     * @Author peng
     * @Description 会员登录
     * @Date 10:01 2019/2/28
     * @Param [Vip]
     **/
    @SelectProvider(type = SqlAdmin.class, method = "selectLogin1")
    vip adminLogin1(vip vip);


}