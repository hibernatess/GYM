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
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.sound.midi.Soundbank;
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
     * @Author peng
     * @Description 判断登录用户
     * @Date 9:11 2019/2/26
     * @Param [name, pword]
     **/
    @RequestMapping("/login")
    @ResponseBody
    public boolean login(String name, String pword, HttpServletRequest argo) {
        Map<String, Object> loginMap = new HashMap<String, Object>();
        Vip vip = loginService.vipLogin(name, pword);
        Login login = null;
        HttpSession session = argo.getSession();
        Boolean flag = true;
        if (vip == null) {
            Coach coach = loginService.coachLogin(name, pword);
            if (coach == null) {
                Admin admin = loginService.adminLogin(name, pword);
                if (admin == null) {
                    flag = false;
                } else {
                    login = setLogin(admin.getAname(), admin.getApword(), admin.getAmid(), admin.getAid());
                }
            } else {
                login = setLogin(coach.getJname(), coach.getJpwd(), coach.getJurid(), coach.getCid());
            }
        } else {
            login = setLogin(vip.getHname(), vip.getHpwd(), vip.getJurid(), vip.getHid());
        }
        session.setAttribute("login", login);
        return flag;
    }

    public Login setLogin(String name, String pword, String mid, int aid) {
        Login l = new Login(name, pword, mid, aid);
        return l;
    }

}
