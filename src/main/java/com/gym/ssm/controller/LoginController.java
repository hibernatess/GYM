package com.gym.ssm.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gym.ssm.entity.peng.Admin;
import com.gym.ssm.entity.peng.Coach;
import com.gym.ssm.entity.peng.Login;
import com.gym.ssm.entity.peng.Vip;
import com.gym.ssm.service.peng.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ProjectNmae:GYM03
 * @ClassName:AdminController
 * @Description: TOOO
 * @Author:peng
 * @Date:2019/2/25 20:01
 * @Version:1.0
 */
@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;

    /**
     * @return java.util.Map<java.lang.String                               ,                               java.lang.Object>
     * @Author peng
     * @Description 判断登录用户
     * @Date 9:11 2019/2/26
     * @Param [name, pword]
     **/
    @RequestMapping("login")
    public String login(String name, String pword, HttpServletRequest argo) {
        Map<String, Object> loginMap = new HashMap<String, Object>();
        Vip vip = loginService.vipLogin(name, pword);
        Coach coach = loginService.coachLogin(name, pword);
        Admin admin = loginService.adminLogin(name, pword);
        Login login = new Login();
        HttpSession session = argo.getSession();
        if (vip.equals(null)) {
            if (coach.equals(null)) {
                if (admin.equals(null)) {
                } else {
                    login.setMid(admin.getAmid());
                    login.setName(admin.getAname());
                    login.setPword(admin.getApword());
                }
            } else {
                login.setName(coach.getJname());
                login.setPword(coach.getJpwd());
                login.setMid(coach.getJurid());
            }
        } else {
            login.setName(vip.getHname());
            login.setPword(vip.getHpwd());
            login.setMid(vip.getJurid());
        }
        session.setAttribute("login", login);
        return "index";
    }


}
