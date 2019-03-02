package com.gym.ssm.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gym.ssm.base.PageBean;
import com.gym.ssm.entity.Curriculum;
import com.gym.ssm.service.SelectcumBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @authorリバティの風
 * @site
 * @company
 * @create 2019-03-01-18:20
 */
@Controller
@RequestMapping("/selectcum")
public class SelectcumController {
    @Autowired
    private SelectcumBiz selectcumBiz;
    @RequestMapping("/selectcum")
    @ResponseBody
    public Map<Object,Object> selectcum(HttpServletRequest request, Curriculum curriculum){
        PageBean pageBea = new PageBean();
        pageBea.setPageBean(request);
        //前段传过来的page和limit的值  放入到pagehelper中
        Page<Object> objects = PageHelper.startPage(pageBea.getPage(), pageBea.getRows());
        List<Map> listcum = selectcumBiz.listcum(curriculum);
        PageInfo pageInfo = new PageInfo(listcum);
        Map<Object,Object> map=new HashMap<>();
        map.put("code",0);
        map.put("msg", "");
        map.put("count",pageInfo.getTotal());
        map.put("data",pageInfo.getList());
        return map;
    }


@RequestMapping("/toselectcum")
    public String toselectcum(){
    System.out.println("toselectcum");
        return "WEB-INF/jsp/selectcum";
}

}
