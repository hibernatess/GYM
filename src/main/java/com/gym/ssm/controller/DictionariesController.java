package com.gym.ssm.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gym.ssm.base.PageBean;
import com.gym.ssm.entity.Dictionaries;
import com.gym.ssm.service.DictionariesBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName DictionariesController
 * @Author ywj
 * @Describe
 * @Date 2019/2/26 0026 20:14
 */
@Controller
@RequestMapping("/dict")
public class DictionariesController {
    @Autowired
    DictionariesBiz dbiz;

    /**
     * @Description: 查询基础数据
     * @Param: [dictionaries, request]
     * @return: java.util.Map<java.lang.String                               ,                               java.lang.Object>
     * @Author: ywj
     * @Date: 2019/2/26 0026
     */
    @RequestMapping("/getdictionaries")
    @ResponseBody
    public Map<String, Object> SelectDictionaries(Dictionaries dictionaries, HttpServletRequest request) {
        PageBean bean = new PageBean();
        bean.setPageBean(request);
        PageHelper.startPage(bean.getPage(), bean.getRows());
        List<Map<String, Object>> maps = dbiz.GetDictionaries(dictionaries);
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
     * @Author: ywj
     * @Date: 2019/2/26 0026
     */
    @RequestMapping("/post")
    @ResponseBody
    public boolean PostDictionaries(Dictionaries dictionaries) {
        if (dbiz.PostDictionaries(dictionaries) > 0) {
            return true;
        }
        return false;
    }

    /**    * @return: boolean

     * @Description: 删除基础数据
     * @Param: [dictionaries]
     * @Author: ywj
     * @Date: 2019/2/26 0026
     */
    @RequestMapping("/del")
    @ResponseBody
    public boolean DleteDictionaries(Dictionaries dictionaries) {
        if (dbiz.DleteDictionaries(dictionaries) > 0) {
            return true;
        }
        return false;
    }

/**    
    *@Description: 修改基础数据类型
    * @Param: [dictionaries]
    * @return: boolean
    * @Author: ywj
    * @Date: 2019/2/26 0026
    */
    @RequestMapping("/put")
    @ResponseBody
    public boolean PutDictionaries(Dictionaries dictionaries) {
        if (dbiz.PutDictionaries(dictionaries) > 0) {
            return true;
        }
        return false;
    }


}
