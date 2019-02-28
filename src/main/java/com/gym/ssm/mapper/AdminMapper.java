package com.gym.ssm.mapper;

import com.gym.ssm.entity.peng.Admin;
import com.gym.ssm.sql.SqlAdmin;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface AdminMapper extends Mapper<Admin> {
    @SelectProvider(type = SqlAdmin.class, method = "selectAdmin")
    Admin adminLogin(Admin admin);
}