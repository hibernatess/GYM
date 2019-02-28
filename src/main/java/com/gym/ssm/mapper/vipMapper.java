package com.gym.ssm.mapper;

import com.gym.ssm.entity.vip;
import com.gym.ssm.sql.Sqlvip;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface vipMapper extends Mapper<vip> {
    /**
     * 修改头像
     *
     * @param vip
     * @return
     */
    @UpdateProvider(type = Sqlvip.class, method = "uploadimg")
    public int uploadimg(vip vip);

    /**
     * 修改会员个人信息
     *
     * @param vip
     * @return
     */
    @UpdateProvider(type = Sqlvip.class, method = "update")
    public int update(vip vip);

}