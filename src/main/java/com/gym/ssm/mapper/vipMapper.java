package com.gym.ssm.mapper;

import com.gym.ssm.entity.vip;
import com.gym.ssm.sql.SqlVip;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

@Repository
public interface VipMapper extends Mapper<vip> {

    /**
     * 修改头像
     * @param vip
     * @return
     */
    @SelectProvider(type = SqlVip.class,method = "uploadimg")
    public String uploadimg(vip vip);

    /**
     * 修改会员信息
     * @param vip
     * @return
     */
    @UpdateProvider(type = SqlVip.class,method = "update")
    public int update(vip vip);

    /**
     * 查询课程
     * @param vip
     * @return
     */
    @SelectProvider(type = SqlVip.class,method = "listcum")
    public List<Map> listcum(vip vip);
}