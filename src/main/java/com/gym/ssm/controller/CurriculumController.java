package com.gym.ssm.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gym.ssm.base.PageBean;
import com.gym.ssm.entity.Curriculum;
import com.gym.ssm.mapper.CurriculumMapper;
import com.gym.ssm.service.CurriculumBiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: GYM
 * @description:课程访问类
 * @author: hw
 * @create: 2019-02-25 20:40
 **/
@RestController
public class CurriculumController {

    @Autowired
    CurriculumBiz biz;

    @Autowired
    CurriculumMapper curriculumMapper;

    /**
     * @Description: 查询课程
     * @Param: [curriculum]
     * @return: java.util.List<com.gym.ssm.entity.Curriculum>
     * @Author: hw
     * @Date: 2019/2/25
     */
    @RequestMapping("/get")
    public Map<String,Object> GetCurriculum(Curriculum curriculum, HttpServletRequest request) {
        PageBean bean = new PageBean();
        bean.setPageBean(request);
        Page<Object> objects = PageHelper.startPage(bean.getPage(), bean.getRows());
        //如果对象不为空则查询,否则直接查询全部
        List<Curriculum> list = null;
        if (!StringUtils.isEmpty(curriculum.getCname())) {
            list = biz.GetCurriculum(curriculum);
        } else {
            list =curriculumMapper.selectAll();
        }
        PageInfo pageInfo=new PageInfo(list);
        Map<String,Object> map=new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",pageInfo.getTotal());
        map.put("data",pageInfo.getList());
        return map;
    }
}
