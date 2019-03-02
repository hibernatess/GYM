package com.gym.ssm.mapper;

import com.gym.ssm.entity.Vip;
import com.gym.ssm.sql.SqlVip;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 修改3.2
 */
@Repository
public interface VipMapper extends Mapper<Vip> {

    /**
     * 修改头像
     * @param vip
     * @return
     */
    @UpdateProvider(type = SqlVip.class,method = "uploadimg")
    public int uploadimg(Vip vip);

    /**
     * 修改会员信息
     * @param vip
     * @return
     */
    @UpdateProvider(type = SqlVip.class,method = "update")
    public int update(Vip vip);

    /**
     * 查询课程
     * @param vip
     * @return
     */
    @SelectProvider(type = SqlVip.class,method = "listcum")
    public List<Map> listcum(Vip vip);
}