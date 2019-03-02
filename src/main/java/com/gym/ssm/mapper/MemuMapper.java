package com.gym.ssm.mapper;

import com.gym.ssm.entity.peng.Memu;
import com.gym.ssm.entity.peng.TreeNode;
import com.gym.ssm.sql.SqlCoach;
import com.gym.ssm.sql.SqlMemu;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
/*
3.2
 */
@Repository
public interface MemuMapper extends Mapper<Memu> {


    @SelectProvider(type = SqlMemu.class, method = "selectmume")
    List<Memu> getTreeNode(String mid);

    @SelectProvider(type = SqlMemu.class, method = "selectmume1")
    List<Memu> getTreeZNode(String mid);

}