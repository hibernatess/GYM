package com.gym.ssm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gym.ssm.base.PageBean;
import com.gym.ssm.entity.Damage;
import com.gym.ssm.entity.Equipment;
import com.gym.ssm.service.DamageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * @author小强
 * @site www.xiaomage.com
 * @company xxx公司
 * @create  2019-03-05 14:06
 */
@Controller
@RequestMapping("/damage")
public class DamageController {
    @Autowired
    DamageService damageService;

    @RequestMapping("/Dlist")
    @ResponseBody
    public Map<String, Object> SelectEquipment(Damage d, HttpServletRequest request) {
        PageBean bean = new PageBean();
        bean.setPageBean(request);
        PageHelper.startPage(bean.getPage(), bean.getRows());
        List<Damage> maps = damageService.GetDamage(d);
        PageInfo pageInfo = new PageInfo(maps);
        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", pageInfo.getTotal());
        map.put("data", pageInfo.getList());
        return map;
    }
    @RequestMapping("/qname")
    @ResponseBody
    public  List<Equipment> SelectQname(){
        List<Equipment> qlist=damageService.SelectQname();
        Set  list=new HashSet();
        for (Equipment equipment : qlist) {
            list.add(equipment);
        }
        return qlist;
    }



    /**
     * @Description: 增加基础数据
     * @Param: [dictionaries]
     * @return: boolean
     * @Author: xxs
     * @Date: 2019/2/26 0026
     */
    @RequestMapping("/add")
    @ResponseBody
    public boolean PostDamage(Damage d) {
        if (damageService.PostDamage(d) > 0) {
            return true;
        }
        return false;
    }

    /**
     * @return: boolean
     * @Description: 删除基础数据
     * @Param: [Equipment]
     * @Author: xxs
     * @Date: 2019/2/26 0026
     */
    @RequestMapping("/del")
    @ResponseBody
    public boolean DleteDamage(Damage e) {
        if (damageService.DleteDamage(e)> 0) {
            return true;
        }
        return false;
    }

    /**
     * @Description: 修改基础数据类型
     * @Param: [Equipment]
     * @return: boolean
     * @Author: xxs
     * @Date: 2019/2/26 0026
     */
    @RequestMapping("/update")
    @ResponseBody
    public boolean PutDamage(Damage e) {
        if (damageService.PutDamage(e) > 0) {
            return true;
        }
        return false;
    }




}
