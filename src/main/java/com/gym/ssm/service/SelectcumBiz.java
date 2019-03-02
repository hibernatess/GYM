package com.gym.ssm.service;

import com.gym.ssm.entity.Curriculum;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @authorリバティの風
 * @site
 * @company
 * @create 2019-03-01-18:26
 */
public interface SelectcumBiz {
    public List<Map> listcum(Curriculum curriculum);
}
