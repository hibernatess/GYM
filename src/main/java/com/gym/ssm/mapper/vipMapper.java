package com.gym.ssm.mapper;

import com.gym.ssm.entity.vip;
import com.gym.ssm.sql.SqlCoach;
import com.gym.ssm.sql.Sqlvip;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

@Repository
public interface vipMapper extends Mapper<vip> {
    @SelectProvider(type = Sqlvip.class,method = "uploadimg")
    public String uploadimg(vip vip);
    @UpdateProvider(type = Sqlvip.class,method = "update")
    public int update(vip vip);
    @SelectProvider(type = Sqlvip.class,method = "listcum")
    public List<Map> listcum(vip vip);
}