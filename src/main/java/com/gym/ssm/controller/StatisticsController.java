package com.gym.ssm.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gym.ssm.base.PageBean;
import com.gym.ssm.entity.Curriculum;
import com.gym.ssm.entity.Vip;
import com.gym.ssm.service.StatisticsBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/selectsta")
public class StatisticsController {
    @Autowired
    private StatisticsBiz statisticsBiz;
    @RequestMapping("/selectsta")
    @ResponseBody
    public Map<Object,Object> selectsta(HttpServletRequest request, Vip vip){
        PageBean pageBea = new PageBean();
        pageBea.setPageBean(request);
        //前段传过来的page和limit的值  放入到pagehelper中
        //System.out.println(vip.getHname());
        Page<Object> objects = PageHelper.startPage(pageBea.getPage(), pageBea.getRows());
        List<Map> liststa = statisticsBiz.listcum(vip);
        PageInfo pageInfo = new PageInfo(liststa);
        Map<Object,Object> map=new HashMap<>();
        map.put("code",0);
        map.put("msg", "");
        map.put("count",pageInfo.getTotal());
        map.put("data",pageInfo.getList());
        return map;
    }
}
