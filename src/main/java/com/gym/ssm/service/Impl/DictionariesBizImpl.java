package com.gym.ssm.service.Impl;

import com.gym.ssm.entity.Dictionaries;
import com.gym.ssm.mapper.DictionariesMapper;
import com.gym.ssm.service.DictionariesBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @ClassName DictionariesBizImpl
 * @Author ywj
 * @Describe
 * @Date 2019/2/26 0026 18:40
 */
/*
3.2
 */
@Service
public class DictionariesBizImpl implements DictionariesBiz {

    @Autowired
    DictionariesMapper dictionariesMapper;


    @Override
    public int PostDictionaries(Dictionaries dictionaries) {
        return dictionariesMapper.insert(dictionaries);
    }

    @Override
    public int DleteDictionaries(Dictionaries dictionaries) {

        return dictionariesMapper.delete(dictionaries);
    }

    @Override
    public int PutDictionaries(Dictionaries dictionaries) {

        return dictionariesMapper.updateByPrimaryKey(dictionaries);
    }

    @Override
    public List<Dictionaries> GetDictionaries(Dictionaries dictionaries) {

        return dictionariesMapper.GetDictionaries(dictionaries);
    }
}
