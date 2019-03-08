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
    public Map<Object, Object> selectsta(HttpServletRequest request, Vip vip) {
        PageBean pageBea = new PageBean();
        pageBea.setPageBean(request);
        //前段传过来的page和limit的值  放入到pagehelper中
        //System.out.println(vip.getHname());
        Page<Object> objects = PageHelper.startPage(pageBea.getPage(), pageBea.getRows());
        List<Map> liststa = statisticsBiz.listcum(vip);
        PageInfo pageInfo = new PageInfo(liststa);
        Map<Object, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", pageInfo.getTotal());
        map.put("data", pageInfo.getList());
        return map;
    }


    /**
     * @param request
     * @param vip
     * @return
     *      用户详情的详情查询
     */
    @RequestMapping("/selectinfo")
    @ResponseBody
    public Map<Object, Object> selectinfo(HttpServletRequest request, Vip vip) {
        PageBean pageBea = new PageBean();
        pageBea.setPageBean(request);
        //前段传过来的page和limit的值  放入到pagehelper中
        Page<Object> objects = PageHelper.startPage(pageBea.getPage(), pageBea.getRows());
        List<Map> listInfo = statisticsBiz.listStaInfo(vip);
        PageInfo pageInfo = new PageInfo(listInfo);
        Map<Object, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", pageInfo.getTotal());
        map.put("data", pageInfo.getList());
        return map;
    }

    @RequestMapping("/info")
    public  String   getInfo(){

        return  "statinfo";
    }


    /**
     * 统计图
     * @return
     */
    @RequestMapping("/selectGraph")
    @ResponseBody
    public List selectGraph() {
        List<Map<String,Object>> listGraph = statisticsBiz.listGraph();
//        for (Map<String, Object> map : listGraph) {
//            System.out.println(map.get("cname"));
//            System.out.println();
//        }
//        Object o = listGraph.get(1);

//        System.out.println(listGraph);
//        for (Object o : listGraph) {
//
//        }
//        for (Object o : listGraph) {
//            System.out.println(o);
//        }




        return listGraph;
    }


}
