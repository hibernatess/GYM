package com.gym.ssm.mapper;

import com.gym.ssm.entity.Dictionaries;
import com.gym.ssm.sql.SqlDictionaries;
import org.apache.ibatis.annotations.SelectProvider;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface DictionariesMapper extends Mapper<Dictionaries> {
     @SelectProvider(type = SqlDictionaries.class ,method = "SelectDictionaries")
    public List<Dictionaries>   GetDictionaries(Dictionaries dictionaries);

    @SelectProvider(type = SqlDictionaries.class ,method = "getSname")
     public List<Map<String,Object>> getSname();
}