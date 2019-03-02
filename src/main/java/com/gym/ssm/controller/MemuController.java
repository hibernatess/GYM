package com.gym.ssm.controller;

import com.gym.ssm.entity.peng.Memu;
import com.gym.ssm.service.MemuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;


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
        String[] split = mid.split(",");
        System.out.println(split.length);
        for (Memu nav : allMenu) {
            String getid = "'" + nav.getId() + "'";
            for (int i = 0; i < split.length; i++) {
                if (getid.equals(split[i])) {//父节点是输入节点的，为根节点。
                    rootMenu.add(nav);
                }
            }
        }
        for (Memu nav : rootMenu) {
            List<Memu> childList = memuService.getTreeZNode(nav.getId());
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
        memuList.add(new Memu("0", "0", "memu", "", memus));
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
    public String outLogin(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        request.getSession().invalidate();
        return "login";
    }


    @RequestMapping("go")
    public String gotu(String name, HttpServletRequest request) {


        return name;
    }
}
