package com.gym.ssm.controller;

import com.gym.ssm.entity.peng.Coach;
import com.gym.ssm.entity.peng.Admin;
import com.gym.ssm.entity.peng.Login;
import com.gym.ssm.entity.Vip;
import com.gym.ssm.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
    public boolean login(String name, String pword, HttpServletRequest argo) throws CloneNotSupportedException {
        Vip vip1 = loginService.vipLogin(name, pword);
        Login login = null;
        HttpSession session = argo.getSession();
        Boolean flag = true;


        if (isNull(vip1)) {
            Coach coach = loginService.coachLogin(name, pword);
            if (isNull(coach)) {
                Admin admin = loginService.adminLogin(name, pword);
                if (isNull(admin)) {
                    flag = false;
                } else {
                    login = setLogin(admin.getAname(), admin.getApword(), admin.getAmid(), admin.getAid());
                }
            } else {
                login = setLogin(coach.getJname(), coach.getJpwd(), coach.getJurid(), coach.getJid());
            }
        } else {
            System.out.println(vip1);
            login = setLogin(vip1.getHname(), vip1.getHpwd(), vip1.getJurid(), vip1.getHid());
        }
        System.out.println(login);
        session.setAttribute("login", login);
        return flag;
    }

    /***
     * @Author peng
     * @Description 为登录用户赋值
     * @Date 10:02 2019/2/28
     * @Param [name, pword, mid, aid]
     * @return com.gym.ssm.entity.peng.Login
     **/
    public Login setLogin(String name, String pword, String mid, int aid) {
        Login l = new Login(name, pword, mid, aid);
        return l;
    }


    public static boolean isNull(Object obj) {
        return obj == null;
    }


}
