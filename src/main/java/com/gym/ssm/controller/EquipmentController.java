package com.gym.ssm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gym.ssm.base.PageBean;
import com.gym.ssm.entity.Dictionaries;
import com.gym.ssm.entity.Equipment;
import com.gym.ssm.service.DamageService;
import com.gym.ssm.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author小强
 * @site www.xiaomage.com
 * @company xxx公司
 * @create  2019-03-04 16:36
 */
@Controller
@RequestMapping("/equipment")
public class EquipmentController {
    @Autowired
    EquipmentService EService;


    @RequestMapping("/Elist")
    @ResponseBody
    public Map<String, Object> SelectEquipment(Equipment e, HttpServletRequest request) {
        PageBean bean = new PageBean();
        bean.setPageBean(request);
        PageHelper.startPage(bean.getPage(), bean.getRows());
        List<Equipment> maps = EService.GetEquipment(e);
        PageInfo pageInfo = new PageInfo(maps);
        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", pageInfo.getTotal());
        map.put("data", pageInfo.getList());
        return map;
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
    public boolean PostEquipment(Equipment e) {
        if (EService.PostEquipment(e) > 0) {
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
    public boolean DleteEquipment(Equipment e) {
        if (EService.DleteEquipment(e) > 0) {
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
    public boolean PutEquipment(Equipment e) {
        if (EService.PutEquipment(e) > 0) {
            return true;
        }
        return false;
    }


}
