package com.gym.ssm.controller;

import com.gym.ssm.entity.peng.Memu;
import com.gym.ssm.entity.peng.TreeNode;
import com.gym.ssm.service.peng.MemuService;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @ProjectNmae:GYM03
 * @ClassName:Memucontroller
 * @Description: TOOO
 * @Author:peng
 * @Date:2019/2/26 20:48
 * @Version:1.0
 */
@Controller
public class MemuController {

    @Autowired
    MemuService memuService;

    public List<Memu> memus(String mid) {
        List<Memu> allMenu = memuService.getmemu(mid);
        //根节点
        List<Memu> rootMenu = new ArrayList<Memu>();
//        rootMenu.add();
        for (Memu nav : allMenu) {
            if (nav.getOldid().equals("0")) {//父节点是0的，为根节点。
                rootMenu.add(nav);
            }
        }
        for (Memu nav : rootMenu) {
            List<Memu> childList = memuService.getmemu(nav.getId());
            nav.setChildren(childList);//给根节点设置子节点
        }
        return rootMenu;
    }


    /**
     * @return java.util.List<com.gym.ssm.entity.peng.Memu>
     * @Author peng
     * @Description 获取根节点
     * @Date 21:51 2019/2/26
     * @Param [mid]
     **/
    @RequestMapping("/memu")
    @ResponseBody
    public List<Memu> treeNode(String mid) {

        List<Memu> memus = memus(mid);
        List<Memu> memuList = new ArrayList<>();
        memuList.add(new Memu("0", "0", "主菜单", "", memus));
        return memuList;
    }

    /**
     * @return java.lang.String
     * @Author peng
     * @Description 退出登录
     * @Date 16:42 2019/2/27
     * @Param [request]
     **/
    @RequestMapping("/out")
    public String outLogin(HttpServletRequest request) {
        HttpSession session = request.getSession();
        request.getSession().invalidate();
        return "login";
    }
}
